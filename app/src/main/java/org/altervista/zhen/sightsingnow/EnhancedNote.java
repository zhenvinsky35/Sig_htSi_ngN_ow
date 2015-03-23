package org.altervista.zhen.sightsingnow;

import jm.JMC;
import jm.music.data.Note;

/**
 * The notes that are designed for use with MusicNotationView.
 */
public class EnhancedNote extends Note
{
	private EnhancedDuration[] mEnhancedDurations;

	private BaseNoteAndOutOfKeySignatureAccidental mBaseNoteAndOutOfKeySignatureAccidental;

	/**
	 * @param pitch The pitch of the note in JMC integer constants, assume treble clef.
	 * @param enhancedDurations The duration of the note. Put multiple durations into the array if they are to be tied. Otherwise, put only one note into the array. Note that drawing ties is currently unsupported.
	 * @param baseNoteAndOutOfKeySignatureAccidental The base note (note without any accidental applied) and any non-key signature accidental to be applied.
	 */
	public EnhancedNote(int pitch, EnhancedDuration[] enhancedDurations,
						BaseNoteAndOutOfKeySignatureAccidental baseNoteAndOutOfKeySignatureAccidental)
	{
		super(pitch, getDurationFromEnhancedDurations(enhancedDurations));
		mEnhancedDurations = enhancedDurations;
		mBaseNoteAndOutOfKeySignatureAccidental = baseNoteAndOutOfKeySignatureAccidental;
	}

	/**
	 * @return The base note and non-key signature accidental.
	 */
	public BaseNoteAndOutOfKeySignatureAccidental getBaseNoteAndOutOfKeySignatureAccidental()
	{
		return mBaseNoteAndOutOfKeySignatureAccidental;
	}

	/**
	 * @param enhancedDurations The enhanced duration array to convert into normal durations.
	 * @return The normal duration associated with the sum of all of the notes in the enhanced duration array.
	 */
	private static double getDurationFromEnhancedDurations(EnhancedDuration[] enhancedDurations)
    {
        double duration = 0;
        for (EnhancedDuration e : enhancedDurations)
        {
            duration += e.getDuration();
        }
        return duration;
    }

	public EnhancedDuration[] getEnhancedDurations() {return mEnhancedDurations;}

	/**
	 * Durations intended for use with EnhancedNote.
	 */
	public static enum EnhancedDuration
	{
		WHOLE_NOTE(JMC.WHOLE_NOTE), DOTTED_WHOLE_NOTE(JMC.WHOLE_NOTE * 1.5), DOUBLE_DOTTED_WHOLE_NOTE(JMC.WHOLE_NOTE * 1.75),
		HALF_NOTE(JMC.HALF_NOTE), DOTTED_HALF_NOTE(JMC.DOTTED_HALF_NOTE), DOUBLE_DOTTED_HALF_NOTE(JMC.DOUBLE_DOTTED_HALF_NOTE),
		QUARTER_NOTE(JMC.QUARTER_NOTE), DOTTED_QUARTER_NOTE(JMC.DOTTED_QUARTER_NOTE), DOUBLE_DOTTED_QUARTER_NOTE(JMC.DOUBLE_DOTTED_QUARTER_NOTE),
		EIGHTH_NOTE(JMC.EIGHTH_NOTE), DOTTED_EIGHTH_NOTE(JMC.DOTTED_EIGHTH_NOTE), DOUBLE_DOTTED_EIGHTH_NOTE(JMC.DOUBLE_DOTTED_EIGHTH_NOTE),
		SIXTEENTH_NOTE(JMC.SIXTEENTH_NOTE), DOTTED_SIXTEENTH_NOTE(JMC.DOTTED_SIXTEENTH_NOTE),
		THIRTYSECOND_NOTE(JMC.THIRTYSECOND_NOTE);

		private double mDuration;
		public static final double DOTTED_MULTIPLIER = 1.5;
		public static final double DOUBLE_DOTTED_MULTIPLIER = 1.75;
		private EnhancedDuration(double duration) {mDuration = duration;}

		/**
		 * @return The duration in the format of a JMC floating-point constant, the type used by jm.music.data.Note
		 */
		public double getDuration() {return mDuration;}
	}

	/**
	 * These notes do not contain accidentals that are in the key signature. They do contain accidentals that are not in the
	 * key signature.
	 */
	public static class BaseNoteAndOutOfKeySignatureAccidental
	{
		private BaseNote mBaseNote;
		private Accidental mAccidental;

		public BaseNoteAndOutOfKeySignatureAccidental(BaseNote baseNote, Accidental accidental)
		{
			mBaseNote = baseNote;
			mAccidental = accidental;
		}

		public BaseNote getBaseNote()
		{
			return mBaseNote;
		}

		public Accidental getAccidental()
		{
			return mAccidental;
		}

		public static enum BaseNote
		{
			A1, B1, C1, D1, E1, F1, G1, A2, B2, C2, D2, E2, F2, G2, A3
		}
		public static enum Accidental
		{
			SHARP, FLAT, NATURAL, NONE
		}
	}
}
