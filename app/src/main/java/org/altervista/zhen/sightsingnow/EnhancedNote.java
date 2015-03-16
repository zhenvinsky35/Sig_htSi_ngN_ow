package org.altervista.zhen.sightsingnow;

import jm.JMC;
import jm.music.data.Note;

public class EnhancedNote extends Note
{
	private EnhancedDuration[] mEnhancedDurations;

	private BaseNoteAndOutOfKeySignatureAccidental mBaseNoteAndOutOfKeySignatureAccidental;

	public EnhancedNote(int pitch, EnhancedDuration[] enhancedDurations,
						BaseNoteAndOutOfKeySignatureAccidental baseNoteAndOutOfKeySignatureAccidental)
	{
		super(pitch, getDurationFromEnhancedDurations(enhancedDurations));
		mEnhancedDurations = enhancedDurations;
		mBaseNoteAndOutOfKeySignatureAccidental = baseNoteAndOutOfKeySignatureAccidental;
	}

	public EnhancedNote(int pitch, EnhancedDuration[] enhancedDurations,
						BaseNoteAndOutOfKeySignatureAccidental baseNoteAndOutOfKeySignatureAccidental, int dynamic)
	{
		super(pitch, getDurationFromEnhancedDurations(enhancedDurations), dynamic);
		mEnhancedDurations = enhancedDurations;
		mBaseNoteAndOutOfKeySignatureAccidental = baseNoteAndOutOfKeySignatureAccidental;
	}

	public EnhancedNote(int pitch, EnhancedDuration[] enhancedDurations,
						BaseNoteAndOutOfKeySignatureAccidental baseNoteAndOutOfKeySignatureAccidental, int dynamic, double pan)
	{
		super(pitch, getDurationFromEnhancedDurations(enhancedDurations), dynamic, pan);
		mEnhancedDurations = enhancedDurations;
		mBaseNoteAndOutOfKeySignatureAccidental = baseNoteAndOutOfKeySignatureAccidental;
	}

	public BaseNoteAndOutOfKeySignatureAccidental getBaseNoteAndOutOfKeySignatureAccidental()
	{
		return mBaseNoteAndOutOfKeySignatureAccidental;
	}

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
		 * Returns the duration in the format of a JMC floating-point constant, the type used by jm.music.data.Note
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
