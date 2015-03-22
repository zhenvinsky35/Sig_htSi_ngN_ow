package org.altervista.zhen.sightsingnow;

import jm.JMC;

import static org.altervista.zhen.sightsingnow.EnhancedNote.*;
import static org.altervista.zhen.sightsingnow.EnhancedNote.BaseNoteAndOutOfKeySignatureAccidental.*;

public enum PracticeMusic
{
	/*whenever updating PracticeMusic, make sure that their NumIds are unique and update
		getPracticeMusicFromNumericalIdentifier() and getRandomPracticeMusic()
	*/
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
	),
	M_6(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.BF3,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.EF4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.BF3,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B1, Accidental.NONE)),
					}
			},
			MusicNotationView.KeySignature.B_FLAT_MAJOR,
			(byte)4, (byte)4,
			6
	),
	M_7(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.EF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.BF4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.C5,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.BF4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.AF4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.EF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
					}
			},
			MusicNotationView.KeySignature.E_FLAT_MAJOR,
			(byte)4, (byte)4,
			7
	),
	M_8(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.C5,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.SHARP)),
							//note 3
							new EnhancedNote(JMC.GS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.SHARP)),
							//note 4
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.A_MINOR,
			(byte)4, (byte)4,
			8
	),
	M_9(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.D5,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.GS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.SHARP)),
							//note 3
							new EnhancedNote(JMC.AS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.SHARP)),
							//note 4
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.B_MINOR,
			(byte)4, (byte)4,
			9
	),
	M_10(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.D5,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.GS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.SHARP)),
							//note 3
							new EnhancedNote(JMC.AS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.SHARP)),
							//note 4
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.B_MINOR,
			(byte)4, (byte)4,
			10
	),
	M_11(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.CS4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.B3,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.CS4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.DS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.SHARP)),
							//note 3
							new EnhancedNote(JMC.ES4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.SHARP)),
							//note 4
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.F_SHARP_MINOR,
			(byte)4, (byte)4,
			11
	),
	M_12(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.BF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NATURAL)),
							//note 3
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.SHARP)),
							//note 4
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.G_MINOR,
			(byte)4, (byte)4,
			12
	),
	M_13(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.C5,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.EF5,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NATURAL)),
							//note 3
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NATURAL)),
							//note 4
							new EnhancedNote(JMC.C5,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.C_MINOR,
			(byte)4, (byte)4,
			13
	),
	M_14(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.AF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.BF3,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NATURAL)),
							//note 3
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NATURAL)),
							//note 4
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.F_MINOR,
			(byte)4, (byte)4,
			14
	),
	M_15(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.C5,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.SHARP)),
							//note 2
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.C5,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.C_MAJOR,
			(byte)3, (byte)4,
			15
	),
	M_16(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.CS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.SHARP)),
							//note 2
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.G_MAJOR,
			(byte)3, (byte)4,
			16
	),
	M_17(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.D5,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.CS5,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.GS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.SHARP)),
							//note 2
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.D5,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.D_MAJOR,
			(byte)3, (byte)4,
			17
	),
	M_18(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.GS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.DS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.SHARP)),
							//note 2
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.A_MAJOR,
			(byte)3, (byte)4,
			18
	),
	M_19(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.B3,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B1, Accidental.NATURAL)),
							//note 2
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.F_MAJOR,
			(byte)3, (byte)4,
			19
	),
	M_20(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.BF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NATURAL)),
							//note 2
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.BF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.B_FLAT_MAJOR,
			(byte)3, (byte)4,
			20
	),
	M_21(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.AF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.EF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE))
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NATURAL)),
							//note 2
							new EnhancedNote(JMC.EF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.AF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.A_FLAT_MAJOR,
			(byte)3, (byte)4,
			21
	),
	M_22(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							new EnhancedNote(JMC.C5,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE)),
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.A_MINOR,
			(byte)3, (byte)4,
			22
	),
	M_23(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.B3,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.B3,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B1, Accidental.NONE)),
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.E_MINOR,
			(byte)3, (byte)4,
			23
	),
	M_24(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							new EnhancedNote(JMC.D5,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D2, Accidental.NONE)),
							new EnhancedNote(JMC.CS5,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C2, Accidental.NONE)),
							new EnhancedNote(JMC.B4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.B_MINOR,
			(byte)3, (byte)4,
			24
	),
	M_25(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.CS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.CS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							new EnhancedNote(JMC.GS4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							new EnhancedNote(JMC.FS4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.F_SHARP_MINOR,
			(byte)3, (byte)4,
			25
	),
	M_26(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.A3,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.BF3,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.A3,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A1, Accidental.NONE)),
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.BF3,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B1, Accidental.NONE)),
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.D_MINOR,
			(byte)3, (byte)4,
			26
	),
	M_27(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.EF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.EF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							new EnhancedNote(JMC.BF4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B2, Accidental.NONE)),
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.G_MINOR,
			(byte)3, (byte)4,
			27
	),
	M_28(new EnhancedNote[][]
			{
					{//bar 1
							//note 1
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.DF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE)),
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.DF4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							new EnhancedNote(JMC.AF4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.F_MINOR,
			(byte)3, (byte)4,
			28
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
			case 6:
				return M_6;
			case 7:
				return M_7;
			case 8:
				return M_8;
			case 9:
				return M_9;
			case 10:
				return M_10;
			case 11:
				return M_11;
			case 12:
				return M_12;
			case 13:
				return M_13;
			case 14:
				return M_14;
			case 15:
				return M_15;
			case 16:
				return M_16;
			case 17:
				return M_17;
			case 18:
				return M_18;
			case 19:
				return M_19;
			case 20:
				return M_20;
			case 21:
				return M_21;
			case 22:
				return M_22;
			case 23:
				return M_23;
			case 24:
				return M_24;
			case 25:
				return M_25;
			case 26:
				return M_26;
			case 27:
				return M_27;
			case 28:
				return M_28;
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
			randomInt = ((int) (Math.random() * 28)) + 1;
		} while  (randomInt == valueToExclude);

		return getPracticeMusicFromNumericalIdentifier(randomInt);
	}
}
