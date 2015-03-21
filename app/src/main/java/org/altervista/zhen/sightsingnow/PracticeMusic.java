package org.altervista.zhen.sightsingnow;


import jm.JMC;

import static org.altervista.zhen.sightsingnow.EnhancedNote.*;
import static org.altervista.zhen.sightsingnow.EnhancedNote.BaseNoteAndOutOfKeySignatureAccidental.*;

public enum PracticeMusic
{
	M_1(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
					}
			},
			MusicNotationView.KeySignature.C_MAJOR,
			(byte)4, (byte)4,
			1
	),
	M_2(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
					}
			},
			MusicNotationView.KeySignature.D_MAJOR,
			(byte)4, (byte)4,
			2
	),
	M_3(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.A3,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.CS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.CS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.A3,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A1, Accidental.NONE)),
					}
			},
			MusicNotationView.KeySignature.A_MAJOR,
			(byte)4, (byte)4,
			3
	),
	M_4(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.GS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.CS5,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.GS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
					}
			},
			MusicNotationView.KeySignature.E_MAJOR,
			(byte)4, (byte)4,
			4
	),
	M_5(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.C5,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.D5,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D2, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.C5,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.BF4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
					}
			},
			MusicNotationView.KeySignature.F_MAJOR,
			(byte)4, (byte)4,
			5
	);

	private final EnhancedNote[][] musicalPhrase;
	private final MusicNotationView.KeySignature keySignature;
	private final byte timeSignatureUpperNum;
	private final byte timeSignatureLowerNum;
	private final int numericalIdentifier;

	private PracticeMusic(EnhancedNote[][] musicalPhrase, MusicNotationView.KeySignature keySignature, byte timeSignatureUpperNum,
						  byte timeSignatureLowerNum, int numericalIdentifier)
	{
		this.musicalPhrase = musicalPhrase;
		this.keySignature = keySignature;
		this.timeSignatureUpperNum = timeSignatureUpperNum;
		this.timeSignatureLowerNum = timeSignatureLowerNum;
		this.numericalIdentifier = numericalIdentifier;
	}

	public EnhancedNote[][] getMusicalPhrase()
	{
		return musicalPhrase;
	}

	public MusicNotationView.KeySignature getKeySignature()
	{
		return keySignature;
	}

	public byte getTimeSignatureUpperNum()
	{
		return timeSignatureUpperNum;
	}

	public byte getTimeSignatureLowerNum()
	{
		return timeSignatureLowerNum;
	}

	public int getNumericalIdentifier()
	{
		return numericalIdentifier;
	}

	public static PracticeMusic getPracticeMusicFromNumericalIdentifier(int numId)
	{
		switch (numId)
		{
			case 1:
				return M_1;
			case 2:
				return M_2;
			case 3:
				return M_3;
			case 4:
				return M_4;
			case 5:
				return M_5;
			case 0:
			default:
				return null;
		}
	}

	/**
	 * Returns a random PracticeMusic.
	 * @param valueToExclude The numerical identifier of the PracticeMusic that you wish to not be returned.
	 * @return A random PracticeMusic.
	 */
	public static PracticeMusic getRandomPracticeMusic(int valueToExclude)
	{
		int randomInt;
		//todo optimize this once all of the PracticeMusic are written in code
		do //this loop will run at least once, but will keep repeating until the random number doesn't equal valueToExclude
		{
			randomInt = ((int) (Math.random() * 5)) + 1;
		} while  (randomInt == valueToExclude);

		return getPracticeMusicFromNumericalIdentifier(randomInt);
	}
}
