package org.altervista.zhen.sightsingnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A placeholder fragment containing a simple view.
 */
public class SelectMusicFragment extends Fragment
{

	public SelectMusicFragment()
	{
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState)
	{
		View rootView = inflater.inflate(R.layout.fragment_select_music, container, false);
		ListView listOfMusic = (ListView) rootView.findViewById(R.id.list_of_music);
		//the toString() method of the PracticeMusic dictates what will be shown in the list item textviews
		Intent receivedIntent = getActivity().getIntent();
		PracticeMusic[] practiceMusic;

		final byte difficultyLevel = receivedIntent.getByteExtra(PracticeActivity.EXTRA_DIFFICULTY_LEVEL, (byte)-1);

		practiceMusic = PracticeMusic.getPracticeMusic(difficultyLevel);

		ArrayAdapter<PracticeMusic> adapter = new ArrayAdapter<PracticeMusic>
				(
						getActivity(),
						R.layout.select_difficulty_music_list_listitem,
						practiceMusic
				);

		listOfMusic.setAdapter(adapter);

		listOfMusic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id)
			{
				Intent intent = new Intent(getActivity(), PracticeActivity.class)
						.putExtra
								(
										PracticeActivity.EXTRA_CLEF,
										getActivity().getIntent().getByteExtra
												(
														PracticeActivity.EXTRA_CLEF,
														MusicNotationView.Clef.TREBLE_NUMERICAL_IDENTIFIER
												)
								)
						.putExtra(PracticeActivity.EXTRA_DIFFICULTY_LEVEL, difficultyLevel)
						.putExtra(PracticeActivity.EXTRA_PRACTICE_MUSIC_NUMERICAL_IDENTIFIER, position); //position = numId
				startActivity(intent);
			}
		});

		return rootView;
	}
}
