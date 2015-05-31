package org.altervista.zhen.sightsingnow;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Write;

import static org.altervista.zhen.sightsingnow.MusicNotationView.Clef;
import static org.altervista.zhen.sightsingnow.MusicNotationView.KeySignature;
import static org.altervista.zhen.sightsingnow.MusicNotationView.OnClickListener;

/**
 * The activity for the practice screen.
 */
public class PracticeActivity extends ActionBarActivity
{
	//default package-lvl visibility
	static final String EXTRA_CLEF = "org.altervista.zhen.sightsingnow.CLEF";

	static final String EXTRA_DIFFICULTY_LEVEL = "org.altervista.zhen.sightsingnow.DIFFICULTY_LEVEL";

	static final String EXTRA_PRACTICE_MUSIC_NUMERICAL_IDENTIFIER = "org.altervista.zhen.sightsingnow.PRACTICE_MUSIC_NUM_ID";

	private static final String STATE_PRACTICE_MUSIC_NUMERICAL_IDENTIFIER = "practiceMusicNumId";
	private static final String STATE_PRACTICE_MUSIC_DIFFICULTY = "practiceMusicDifficulty";
	private static final String LOG_TAG = PracticeActivity.class.getSimpleName();

	private Clef mClef;
	private byte mDifficulty;

	private PracticeMusic mPracticeMusic;

	public Clef getClef()
	{
		return mClef;
	}

	public PracticeMusic getPracticeMusic()
	{
		return mPracticeMusic;
	}

	protected void setPracticeMusic(PracticeMusic practiceMusic)
	{
		mPracticeMusic = practiceMusic;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_practice);

		if (savedInstanceState == null)
		{
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PracticeFragment())
					.commit();
		}
		else
		{
			mDifficulty = savedInstanceState.getByte(STATE_PRACTICE_MUSIC_DIFFICULTY, (byte)-1); //equals -1 if no difficulty saved
			int practiceMusicNumId = savedInstanceState.getInt(STATE_PRACTICE_MUSIC_NUMERICAL_IDENTIFIER, -1); //equals -1 if no value was previously set in onSaveInstanceState()
			mPracticeMusic = PracticeMusic.getPracticeMusicFromNumericalIdentifier(mDifficulty, practiceMusicNumId); //sets to null if either practiceMusicNumId or mDifficulty equals -1
		}

		if (mPracticeMusic == null) //no PracticeMusic saved from SavedInstanceState
		{
			Intent receivedIntent = getIntent();
			mDifficulty = receivedIntent.getByteExtra(EXTRA_DIFFICULTY_LEVEL, PracticeMusic.DIFFICULTY_LEVEL_EASY);
			int practiceMusicNumId = receivedIntent.getIntExtra(EXTRA_PRACTICE_MUSIC_NUMERICAL_IDENTIFIER, 0);
			mPracticeMusic = PracticeMusic.getPracticeMusicFromNumericalIdentifier(mDifficulty, practiceMusicNumId);
		}

		//under current arrangements, the clef will not be remembered
		byte clefNumId = getIntent().getByteExtra(EXTRA_CLEF, Clef.TREBLE_NUMERICAL_IDENTIFIER);
		mClef = Clef.getClefFromNumericalIdentifier(clefNumId);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_practice, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		return super.onOptionsItemSelected(item);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState)
	{
		outState.putByte(STATE_PRACTICE_MUSIC_DIFFICULTY, mDifficulty);
		outState.putInt(STATE_PRACTICE_MUSIC_NUMERICAL_IDENTIFIER, mPracticeMusic.getNumericalIdentifier());
		super.onSaveInstanceState(outState);
	}

	public static class PracticeFragment extends Fragment
	{
		private boolean portraitOrientation;
		private boolean isRecording = false;
		private MediaPlayer mStartingPitchMediaPlayer, mRhythmMediaPlayer, mRecordingMediaPlayer, mReferenceMediaPlayer;
		private MediaRecorder mMediaRecorder;
		private MusicNotationView mMusicStaffTop, mMusicStaffBottom;
		private File mStartingPitchAudioFile, mRhythmAudioFile, mRecordingAudioFile, mReferenceAudioFile;
		private final int TEMPO = 80;

		public PracticeFragment()
		{
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
								 Bundle savedInstanceState)
		{
			View rootView = inflater.inflate(R.layout.fragment_practice, container, false);
			mMusicStaffTop = (MusicNotationView) rootView.findViewById(R.id.musicStaffTop);
			mMusicStaffBottom = (MusicNotationView) rootView.findViewById(R.id.musicStaffBottom);
			portraitOrientation = getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT;

			//resets the recording button
			final Button recordButton = (Button) rootView.findViewById(R.id.recordButton);
			final Button playRecordingButton = (Button) rootView.findViewById(R.id.playRecordingButton);
			setRecordButtonToNotRecordingState(recordButton, playRecordingButton);

			mMusicStaffTop.setClef(((PracticeActivity) getActivity()).getClef());
			if (portraitOrientation)
			{
				//musicStaffBottom is only present in the layout for vertically oriented screens
				mMusicStaffBottom.setClef(((PracticeActivity) getActivity()).getClef());
			}

			drawNewMusic(0); //passing in zero shall not exclude any PracticeMusic

			Button getStartingPitchButton = (Button) rootView.findViewById(R.id.getStartingPitchButton);
			final Button getRhythmButton = (Button) rootView.findViewById(R.id.getRhythmButton);
			final Button playReferenceButton = (Button) rootView.findViewById(R.id.playReferenceButton);
			Button needHelpButton = (Button) rootView.findViewById(R.id.needHelpButton);

			getStartingPitchButton.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					releaseAllMediaPlayers();
					setRecordButtonToNotRecordingState(recordButton, playRecordingButton);

					PracticeMusic practiceMusic = ((PracticeActivity) getActivity()).getPracticeMusic();
					if (practiceMusic == null)
					{
						return;
					}

					EnhancedNote[][] musicalPhrase = practiceMusic.getMusicalPhrase();

					//writes audio file
					if (mStartingPitchAudioFile == null)
					{
						Note startingPitch = musicalPhrase[0][0];
						Part part = new Part(new Phrase(new Note[]{startingPitch}));
						Score score = new Score("startingPitch");
						score.addPart(part);
						score.setTempo(TEMPO);

						FileOutputStream fileOutputStream;
						try
						{
							mStartingPitchAudioFile = File.createTempFile("startingPitchAudioFile","mid");
							fileOutputStream = new FileOutputStream(mStartingPitchAudioFile);
							Write.midi(score, fileOutputStream);
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}

					//plays audio file
					mStartingPitchMediaPlayer = MediaPlayer.create(getActivity(), Uri.parse(mStartingPitchAudioFile.toURI().toString()));
					if (mStartingPitchMediaPlayer != null)
					{
						mStartingPitchMediaPlayer.start();
						mStartingPitchMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
						{
							@Override
							public void onCompletion(MediaPlayer mp)
							{
								mp.reset();
								mp.release();
								mStartingPitchMediaPlayer = null;
							}
						});
					}
				}
			});

			getRhythmButton.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					releaseAllMediaPlayers();
					setRecordButtonToNotRecordingState(recordButton, playRecordingButton);

					if (mRhythmAudioFile == null)
					{
						//writes audio file
						PracticeMusic practiceMusic = ((PracticeActivity) getActivity()).getPracticeMusic();
						int timeSignatureUpperNum = practiceMusic.getTimeSignatureUpperNum();
						int timeSignatureLowerNum = practiceMusic.getTimeSignatureLowerNum();

						double rhythmValue;
						switch (timeSignatureLowerNum)
						{
							case 1:
								rhythmValue = JMC.WHOLE_NOTE;
								break;
							case 2:
								rhythmValue = JMC.HALF_NOTE;
								break;
							case 4:
								rhythmValue = JMC.QUARTER_NOTE;
								break;
							case 8:
								rhythmValue = JMC.EIGHTH_NOTE;
								break;
							case 16:
								rhythmValue = JMC.SIXTEENTH_NOTE;
								break;
							case 32:
								rhythmValue = JMC.THIRTYSECOND_NOTE;
								break;
							default:
								rhythmValue = JMC.QUARTER_NOTE;
						}

						Note[] notes1 = new Note[timeSignatureUpperNum];
						Note[] notes2 = new Note[timeSignatureUpperNum];
						Note[] notes3 = new Note[timeSignatureUpperNum];

						for (int i = 0; i < notes1.length; i++)
						{
							notes1[i] = new Note(JMC.B2, rhythmValue);
							notes2[i] = new Note(JMC.C3, rhythmValue);
							notes3[i] = new Note(JMC.CS3, rhythmValue);
						}

						Part part1 = new Part(new Phrase(notes1));
						Part part2 = new Part(new Phrase(notes2));
						Part part3 = new Part(new Phrase(notes3));
						part1.setInstrument(JMC.TIMPANI);
						part2.setInstrument(JMC.TIMPANI);
						part3.setInstrument(JMC.TIMPANI);
						Score score = new Score("rhythm");
						score.addPart(part1);
						score.addPart(part2);
						score.addPart(part3);
						score.setDenominator(timeSignatureLowerNum);
						score.setTempo(TEMPO);

						FileOutputStream fileOutputStream;
						try
						{
							mRhythmAudioFile = File.createTempFile("rhythmAudioFile","mid");
							fileOutputStream = new FileOutputStream(mRhythmAudioFile);
							Write.midi(score, fileOutputStream);
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}

					//plays audio file
					mRhythmMediaPlayer = MediaPlayer.create(getActivity(), Uri.parse(mRhythmAudioFile.toURI().toString()));
					if (mRhythmMediaPlayer == null)
					{
						return;
					}
					mRhythmMediaPlayer.start();
					mRhythmMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
					{
						@Override
						public void onCompletion(MediaPlayer mp)
						{
							mp.reset();
							mp.release();
							mRhythmMediaPlayer = null;
						}
					});
				}
			});

			recordButton.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (isRecording)
					{
						try
						{
							mMediaRecorder.stop();
						}
						catch (RuntimeException e)
						{
							//a RuntimeException is intentionally thrown if no data has been received when stop() is called
						}
						mMediaRecorder.reset();
						mMediaRecorder.release();

						mMediaRecorder = null;

						setRecordButtonToNotRecordingState(recordButton, playRecordingButton);
						isRecording = false;
					}
					else //not recording
					{
						releaseAllMediaPlayers();

						FileOutputStream fileOutputStream;
						try
						{
							mMediaRecorder = new MediaRecorder();
							mMediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
							mMediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
							mRecordingAudioFile = File.createTempFile("recording", "3gp");
							fileOutputStream = new FileOutputStream(mRecordingAudioFile);
							mMediaRecorder.setOutputFile(fileOutputStream.getFD());
							mMediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
							mMediaRecorder.prepare();
							mMediaRecorder.start();

							setRecordButtonToRecordingState(recordButton, playRecordingButton);
							isRecording = true;
						}
						catch (Exception e)
						{
							e.printStackTrace();
							mMediaRecorder.release();
						}
						//do not release mMediaRecorder if recording is successful, it will be released when the button is pressed again.
					}
				}
			});

			playRecordingButton.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					if (isRecording || mRecordingAudioFile == null)
					{
						return; //do nothing
					}
					//else
					releaseAllMediaPlayers();
					//it's not necessary to set record button to not recording state as the click doesn't do anything if recording is happening

					mRecordingMediaPlayer = MediaPlayer.create(getActivity(), Uri.parse(mRecordingAudioFile.toURI().toString()));
					if (mRecordingMediaPlayer == null)
					{
						return;
					}
					mRecordingMediaPlayer.start();
					mRecordingMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
					{
						@Override
						public void onCompletion(MediaPlayer mp)
						{
							mp.reset();
							mp.release();
							mRecordingMediaPlayer = null;
						}
					});
				}
			});

			playReferenceButton.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					releaseAllMediaPlayers();
					setRecordButtonToNotRecordingState(recordButton, playRecordingButton);

					PracticeMusic practiceMusic = ((PracticeActivity) getActivity()).getPracticeMusic();
					if (practiceMusic == null)
					{
						return;
					}
					EnhancedNote[][] musicalPhrase = practiceMusic.getMusicalPhrase();
					byte timeSignatureLowerNum = practiceMusic.getTimeSignatureLowerNum();

					ArrayList<Note> notesArrayList = new ArrayList<>();
					for (EnhancedNote[] bar : musicalPhrase)
					{
						Collections.addAll(notesArrayList, bar);
					}

					Note[] notes = new Note[notesArrayList.size()];
					Part part = new Part(new Phrase(notesArrayList.toArray(notes)));
					Score score = new Score("reference");
					score.addPart(part);
					score.setDenominator(timeSignatureLowerNum);
					score.setTempo(TEMPO);

					FileOutputStream fileOutputStream;
					try
					{
						mReferenceAudioFile = File.createTempFile("referenceAudioFile","mid");
						fileOutputStream = new FileOutputStream(mReferenceAudioFile);
						Write.midi(score, fileOutputStream);
					}
					catch (IOException e)
					{
						e.printStackTrace();
					}

					//plays audio file
					mReferenceMediaPlayer = MediaPlayer.create(getActivity(), Uri.parse(mReferenceAudioFile.toURI().toString()));
					if (mReferenceMediaPlayer == null)
					{
						return;
					}
					mReferenceMediaPlayer.start();
					mReferenceMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener()
					{
						@Override
						public void onCompletion(MediaPlayer mp)
						{
							mp.reset();
							mp.release();
							mReferenceMediaPlayer = null;
						}
					});
				}
			});

			needHelpButton.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					Toast.makeText(getActivity(), R.string.need_help_message, Toast.LENGTH_LONG).show();
				}
			});

			return rootView;
		}

		/**
		 * Draw music
		 * @param practiceMusicNumIdToExclude The numerical identifier of the PracticeMusic to not repeat.
		 */
		private void drawNewMusic(int practiceMusicNumIdToExclude)
		{
			PracticeMusic practiceMusic = ((PracticeActivity) getActivity()).getPracticeMusic();

			KeySignature keySignature = practiceMusic.getKeySignature();
			byte timeSignatureUpperNum = practiceMusic.getTimeSignatureUpperNum();
			byte timeSignatureLowerNum = practiceMusic.getTimeSignatureLowerNum();
			EnhancedNote[][] musicalPhrase = practiceMusic.getMusicalPhrase();

			mMusicStaffTop.setKeySignature(keySignature);
			mMusicStaffTop.setTimeSignature(timeSignatureUpperNum, timeSignatureLowerNum);

			//split the musical phrase into 2 bars if the device is in portrait orientation
			if (portraitOrientation)
			{
				EnhancedNote[][] musicalPhraseTop, musicalPhraseBottom;
				if (musicalPhrase.length % 2 == 1) //odd number of bars
				{
					musicalPhraseTop = new EnhancedNote[musicalPhrase.length / 2][];
					System.arraycopy(musicalPhrase, 0, musicalPhraseTop, 0, musicalPhraseTop.length);

					musicalPhraseBottom = new EnhancedNote[musicalPhrase.length / 2 + 1][];
					System.arraycopy(musicalPhrase, musicalPhraseTop.length, musicalPhraseBottom, 0, musicalPhraseBottom.length);
				}
				else //even number of bars
				{
					musicalPhraseTop = new EnhancedNote[musicalPhrase.length / 2][];
					System.arraycopy(musicalPhrase, 0, musicalPhraseTop, 0, musicalPhraseTop.length);

					musicalPhraseBottom = new EnhancedNote[musicalPhrase.length / 2][];
					System.arraycopy(musicalPhrase, musicalPhraseTop.length, musicalPhraseBottom, 0, musicalPhraseTop.length);
				}

				mMusicStaffTop.setMusicalPhrase(musicalPhraseTop);

				mMusicStaffBottom.setKeySignature(keySignature);
				mMusicStaffBottom.setTimeSignature(timeSignatureUpperNum, timeSignatureLowerNum);
				mMusicStaffBottom.setMusicalPhrase(musicalPhraseBottom);
			}
			else //landscape orientation
			{
				mMusicStaffTop.setMusicalPhrase(musicalPhrase);
			}
		}

		/**
		 * Enables the button that plays back the recording and turns the record button into a "start recording" button.
		 * @param recordButton The button that starts/stops recording.
		 * @param playbackRecordButton The button that plays back the recording.
		 */
		private void setRecordButtonToNotRecordingState(Button recordButton, Button playbackRecordButton)
		{
			recordButton.setText(R.string.start_recording);
			recordButton.setTextColor(getResources().getColor(R.color.recordButtonNotRecording));
			playbackRecordButton.setEnabled(true);
		}

		/**
		 * Disables the button that plays back the recording and turns the record button into a "stop recording" button.
		 * @param recordButton The button that starts/stops recording.
		 * @param playbackRecordButton The button that plays back recording.
		 */
		private void setRecordButtonToRecordingState(Button recordButton, Button playbackRecordButton)
		{
			recordButton.setText(R.string.stop_recording);
			recordButton.setTextColor(getResources().getColor(R.color.recordButtonRecording));
			playbackRecordButton.setEnabled(false);
		}

		/**
		 * Reset MediaPlayers and the MediaRecorder, set the references to the MediaPlayers and the MediaRecorder to null, and
		 * sets isRecording to false.
		 */
		private void releaseAllMediaPlayers()
		{
			if (mStartingPitchMediaPlayer != null)
			{
				if (mStartingPitchMediaPlayer.isPlaying())
				{
					mStartingPitchMediaPlayer.stop();
				}
				mStartingPitchMediaPlayer.reset();
				mStartingPitchMediaPlayer.release();
				mStartingPitchMediaPlayer = null;
			}
			if (mRhythmMediaPlayer != null)
			{
				if (mRhythmMediaPlayer.isPlaying())
				{
					mRhythmMediaPlayer.stop();
				}
				mRhythmMediaPlayer.reset();
				mRhythmMediaPlayer.release();
				mRhythmMediaPlayer = null;
			}
			if (mRecordingMediaPlayer != null)
			{
				if (mRecordingMediaPlayer.isPlaying())
				{
					mRecordingMediaPlayer.stop();
				}
				mRecordingMediaPlayer.reset();
				mRecordingMediaPlayer.release();
				mRecordingMediaPlayer = null;
			}
			if (mReferenceMediaPlayer != null)
			{
				if (mReferenceMediaPlayer.isPlaying())
				{
					mReferenceMediaPlayer.stop();
				}
				mReferenceMediaPlayer.reset();
				mReferenceMediaPlayer.release();
				mReferenceMediaPlayer = null;
			}
			if (mMediaRecorder != null)
			{
				mMediaRecorder.reset();
				mMediaRecorder.release();
				mMediaRecorder = null;
				isRecording = false;
			}
		}

		/**
		 * Delete all audio files and sets their references to null.
		 */
		private void deleteAllAudioFiles()
		{
			if (mStartingPitchAudioFile != null)
			{
				mStartingPitchAudioFile.delete();
				mStartingPitchAudioFile = null;
			}
			if (mRhythmAudioFile != null)
			{
				mRhythmAudioFile.delete();
				mRhythmAudioFile = null;
			}
			if (mRecordingAudioFile != null)
			{
				mRecordingAudioFile.delete();
				mRecordingAudioFile = null;
			}
			if (mReferenceAudioFile != null)
			{
				mReferenceAudioFile.delete();
				mReferenceAudioFile = null;
			}
		}

		@Override
		public void onPause()
		{
			releaseAllMediaPlayers();
			super.onPause();
		}

		@Override
		public void onStop()
		{
			deleteAllAudioFiles();
			super.onStop();
		}
	}
}
