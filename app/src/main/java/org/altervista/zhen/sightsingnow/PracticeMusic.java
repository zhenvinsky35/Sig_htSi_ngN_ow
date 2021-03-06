package org.altervista.zhen.sightsingnow;

import jm.JMC;

import static org.altervista.zhen.sightsingnow.EnhancedNote.BaseNoteAndOutOfKeySignatureAccidental;
import static org.altervista.zhen.sightsingnow.EnhancedNote.BaseNoteAndOutOfKeySignatureAccidental.Accidental;
import static org.altervista.zhen.sightsingnow.EnhancedNote.BaseNoteAndOutOfKeySignatureAccidental.BaseNote;
import static org.altervista.zhen.sightsingnow.EnhancedNote.EnhancedDuration;

/**
 * A set of enums that hold the practice music. Contains the musical phrase, key signature, and time signature.
 */
public enum PracticeMusic
{
	E_0(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.C4, EnhancedDuration.QUARTER_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1)
					},
					{//bar 2
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1)
					},
					{//bar 3
							new EnhancedNote(JMC.C4, EnhancedDuration.QUARTER_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1)
					},
					{//bar 4
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.C4, EnhancedDuration.HALF_NOTE, BaseNote.C1)
					}
			},
			MusicNotationView.KeySignature.C_MAJOR,
			(byte)4, (byte)4,
			0
	),
	E_1(new EnhancedNote[][]
			{
					{
							new EnhancedNote(JMC.C4, EnhancedDuration.QUARTER_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.E4, EnhancedDuration.HALF_NOTE, BaseNote.E1)
					},
					{
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.G4, EnhancedDuration.HALF_NOTE, BaseNote.G1)
					},
					{
							new EnhancedNote(JMC.A4, EnhancedDuration.HALF_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1),
					},
					{
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.C4, EnhancedDuration.HALF_NOTE, BaseNote.C1)
					}
			},
			MusicNotationView.KeySignature.C_MAJOR,
			(byte)4, (byte)4,
			1
	),
	E_2(new EnhancedNote[][]
			{
					{
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2)
					},
					{
							new EnhancedNote(JMC.C5, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C2),
							new EnhancedNote(JMC.B4, EnhancedDuration.EIGHTH_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2)
					},
					{
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1)
					},
					{
							new EnhancedNote(JMC.G4, EnhancedDuration.DOTTED_HALF_NOTE, BaseNote.G1)
					}
			},
			MusicNotationView.KeySignature.G_MAJOR,
			(byte)3, (byte)4,
			2
	),
	E_3(new EnhancedNote[][]
			{
					{
							new EnhancedNote(JMC.F4, EnhancedDuration.HALF_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2)
					},
					{
							new EnhancedNote(JMC.BF4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.C5, EnhancedDuration.EIGHTH_NOTE, BaseNote.C2),
							new EnhancedNote(JMC.C5, EnhancedDuration.HALF_NOTE, BaseNote.C2)
					},
					{
							new EnhancedNote(JMC.C5, EnhancedDuration.QUARTER_NOTE, BaseNote.C2),
							new EnhancedNote(JMC.BF4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1)
					},
					{
							new EnhancedNote(JMC.F4, EnhancedDuration.WHOLE_NOTE, BaseNote.F1)
					}
			},
			MusicNotationView.KeySignature.F_MAJOR,
			(byte)4, (byte)4,
			3
	),
	E_4(new EnhancedNote[][]
			{
					{
							new EnhancedNote(JMC.D4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1)
					},
					{
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1)
					},
					{
							new EnhancedNote(JMC.D4, EnhancedDuration.HALF_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.CS4, EnhancedDuration.QUARTER_NOTE, BaseNote.C1)
					},
					{
							new EnhancedNote(JMC.D4, EnhancedDuration.DOTTED_HALF_NOTE, BaseNote.D1)
					}
			},
			MusicNotationView.KeySignature.D_MAJOR,
			(byte)3, (byte)4,
			4
	),
	E_5(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.C4, EnhancedDuration.QUARTER_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1)
					},
					{//bar 2
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.C4, EnhancedDuration.HALF_NOTE, BaseNote.C1)
					},
					{//bar 3
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1)
					},
					{//bar 4
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.C4, EnhancedDuration.HALF_NOTE, BaseNote.C1)
					}
			},
			MusicNotationView.KeySignature.C_MAJOR,
			(byte)4, (byte)4,
			5
	),
	E_6(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.C4, EnhancedDuration.HALF_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1)
					},
					{//bar 2
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.C4, EnhancedDuration.QUARTER_NOTE, BaseNote.C1)
					},
					{//bar 3
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.B3, EnhancedDuration.QUARTER_NOTE, BaseNote.B1)
					},
					{//bar 4
							new EnhancedNote(JMC.C4, EnhancedDuration.WHOLE_NOTE, BaseNote.C1),
					}
			},
			MusicNotationView.KeySignature.C_MAJOR,
			(byte)4, (byte)4,
			6
	),
	E_7(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.C4, EnhancedDuration.QUARTER_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1)
					},
					{//bar 2
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1)
					},
					{//bar 3
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.G4, EnhancedDuration.HALF_NOTE, BaseNote.G1)
					},
					{//bar 4
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.C4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1)
					}
			},
			MusicNotationView.KeySignature.C_MAJOR,
			(byte)3, (byte)4,
			7
	),
	E_8(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2)
					},
					{//bar 2
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1)
					},
					{//bar 3
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1)
					},
					{//bar 4
							new EnhancedNote(JMC.G4, EnhancedDuration.WHOLE_NOTE, BaseNote.G1)
					}
			},
			MusicNotationView.KeySignature.G_MAJOR,
			(byte)4, (byte)4,
			8
	),
	E_9(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.G4, EnhancedDuration.HALF_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2)
					},
					{//bar 2
							new EnhancedNote(JMC.B4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.G4, EnhancedDuration.HALF_NOTE, BaseNote.G1)
					},
					{//bar 3
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.C5, EnhancedDuration.EIGHTH_NOTE, BaseNote.C2),
							new EnhancedNote(JMC.D5, EnhancedDuration.EIGHTH_NOTE, BaseNote.D2),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2)
					},
					{//bar 4
							new EnhancedNote(JMC.G4, EnhancedDuration.WHOLE_NOTE, BaseNote.G1)
					}
			},
			MusicNotationView.KeySignature.G_MAJOR,
			(byte)4, (byte)4,
			9
	),

	M_0(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1)
					},
					{//bar 2
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.C4, EnhancedDuration.HALF_NOTE, BaseNote.C1),
					},
					{//bar 3
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.A2),
					},
					{//bar 4
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1)
					}
			},
			MusicNotationView.KeySignature.G_MAJOR,
			(byte)3, (byte)4,
			0
	),
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
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
					},
					{//bar 2
							//note 1
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.G4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.G1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.A4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.A2, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
					},
					{//bar 3
							//note 1
							new EnhancedNote(JMC.E4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.E1, Accidental.NONE)),
							//note 2
							new EnhancedNote(JMC.F4,
									new EnhancedDuration[] {EnhancedDuration.QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.F1, Accidental.NONE)),
							//note 3
							new EnhancedNote(JMC.D4,
									new EnhancedDuration[] {EnhancedDuration.EIGHTH_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.D1, Accidental.NONE)),
							//note 4
							new EnhancedNote(JMC.B3,
									new EnhancedDuration[] {EnhancedDuration.DOTTED_QUARTER_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.B1, Accidental.NONE)),
					},
					{//bar 4
							new EnhancedNote(JMC.C4,
									new EnhancedDuration[] {EnhancedDuration.WHOLE_NOTE},
									new BaseNoteAndOutOfKeySignatureAccidental(BaseNote.C1, Accidental.NONE))
					}
			},
			MusicNotationView.KeySignature.C_MAJOR,
			(byte)4, (byte)4,
			1
	),
	M_2(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.G4, EnhancedDuration.HALF_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1, Accidental.NONE),
					},
					{//bar 2
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.C5, EnhancedDuration.QUARTER_NOTE, BaseNote.C2, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.G4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.D4, EnhancedDuration.EIGHTH_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.A2, Accidental.NONE)
					},
					{//bar 4
							new EnhancedNote(JMC.G4, EnhancedDuration.WHOLE_NOTE, BaseNote.G1, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.G_MAJOR,
			(byte)4, (byte)4,
			2
	),
	M_3(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.F4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.A2, Accidental.NONE)
					},
					{//bar 2
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.BF4, EnhancedDuration.EIGHTH_NOTE, BaseNote.B2, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.C5, EnhancedDuration.EIGHTH_NOTE, BaseNote.C2, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.BF4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.B2, Accidental.NONE),
							new EnhancedNote(JMC.C5, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C2, Accidental.NONE)
					},
					{//bar 4
							new EnhancedNote(JMC.F4, EnhancedDuration.DOTTED_HALF_NOTE, BaseNote.F1, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.F_MAJOR,
			(byte)6, (byte)8,
			3
	),
	M_4(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.E1, Accidental.NONE),
					},
					{//bar 2
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.E1, Accidental.NONE)
					},
					{//bar 4
							new EnhancedNote(JMC.D4, EnhancedDuration.DOTTED_HALF_NOTE, BaseNote.D1, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.D_MAJOR,
			(byte)6, (byte)8,
			4
	),
	M_5(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.BF4, EnhancedDuration.HALF_NOTE, BaseNote.B2, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
					},
					{//bar 2
							new EnhancedNote(JMC.G4, EnhancedDuration.HALF_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.D4, EnhancedDuration.EIGHTH_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.BF4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2, Accidental.NONE)
					},
					{//bar 4
							new EnhancedNote(JMC.C5, EnhancedDuration.QUARTER_NOTE, BaseNote.C2, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.BF4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.B_FLAT_MAJOR,
			(byte)3, (byte)4,
			5
	),
	M_6(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.GS4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.F1, Accidental.NONE)
					},
					{//bar 2
							new EnhancedNote(JMC.E4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.D4, EnhancedDuration.EIGHTH_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.E1, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.A2, Accidental.NONE)
					},
					{//bar 4
							new EnhancedNote(JMC.GS4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2, Accidental.NONE),
							new EnhancedNote(JMC.GS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.A2, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.A_MAJOR,
			(byte)9, (byte)8,
			6
	),
	M_7(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.EF4, EnhancedDuration.HALF_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1, Accidental.NONE)
					},
					{//bar 2
							new EnhancedNote(JMC.BF4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.B2, Accidental.NONE),
							new EnhancedNote(JMC.AF4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.EF4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.AF4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.BF4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2, Accidental.NONE),
					},
					{//bar 4
							new EnhancedNote(JMC.F4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.EF4, EnhancedDuration.HALF_NOTE, BaseNote.E1, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.E_FLAT_MAJOR,
			(byte)4, (byte)4,
			7
	),
	M_8(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.C4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C1, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.E1, Accidental.NONE)
					},
					{//bar 2
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.D4, EnhancedDuration.EIGHTH_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.C4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C1, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.C_MAJOR,
			(byte)12, (byte)8,
			8
	),
	M_9(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE)
					},
					{//bar 2
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1, Accidental.NONE)
					},
					{//bar 4
							new EnhancedNote(JMC.G4, EnhancedDuration.DOTTED_HALF_NOTE, BaseNote.G1, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.G_MAJOR,
			(byte)3, (byte)4,
			9
	),
	M_10(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.D4, EnhancedDuration.HALF_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.CS4, EnhancedDuration.QUARTER_NOTE, BaseNote.C1, Accidental.SHARP)
					},
					{//bar 2
							new EnhancedNote(JMC.D4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1, Accidental.NONE)
					},
					{//bar 4
							new EnhancedNote(JMC.D4, EnhancedDuration.DOTTED_HALF_NOTE, BaseNote.D1, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.D_MINOR,
			(byte)3, (byte)4,
			10
	),
	M_11(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.B4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.B2, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1, Accidental.NONE)
					},
					{//bar 2
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.F1, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2, Accidental.NONE),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1, Accidental.NONE),
							new EnhancedNote(JMC.CS5, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C2, Accidental.NONE)
					},
					{//bar 4
							new EnhancedNote(JMC.B4, EnhancedDuration.DOTTED_HALF_NOTE, BaseNote.B2, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.B_MINOR,
			(byte)6, (byte)8,
			11
	),
	M_12(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.G4, EnhancedDuration.HALF_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.BF4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2, Accidental.NONE)
					},
					{//bar 2
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.D4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.D1, Accidental.NONE),
							new EnhancedNote(JMC.EF4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.BF4, EnhancedDuration.EIGHTH_NOTE, BaseNote.B2, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.NONE)
					},
					{//bar 4
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1, Accidental.SHARP),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.HALF_NOTE, BaseNote.G1, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.G_MINOR,
			(byte)4, (byte)4,
			12
	),
	M_13(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.GS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1,Accidental.SHARP),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2, Accidental.NONE)
					},
					{//bar 2
							new EnhancedNote(JMC.C5, EnhancedDuration.QUARTER_NOTE, BaseNote.C2, Accidental.NONE),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2, Accidental.NONE),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2, Accidental.NONE)
					},
					{//bar 3
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.GS4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1, Accidental.SHARP),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2, Accidental.NONE)
					},
					{//bar 4
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_HALF_NOTE, BaseNote.A2, Accidental.NONE)
					}
			},
			MusicNotationView.KeySignature.A_MINOR,
			(byte)3, (byte)4,
			13
	),
	M_14(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.E4, EnhancedDuration.HALF_NOTE, BaseNote.E1, Accidental.NONE),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2)
					},
					{//bar 2
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.A4, EnhancedDuration.HALF_NOTE, BaseNote.A2)
					},
					{//bar 3
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.B4, EnhancedDuration.HALF_NOTE, BaseNote.B2)
					},
					{//bar 4
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.E4, EnhancedDuration.HALF_NOTE, BaseNote.E1)
					}
			},
			MusicNotationView.KeySignature.E_MINOR,
			(byte)4, (byte)4,
			14
	),
	M_15(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.C4, EnhancedDuration.QUARTER_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.EF4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1)
					},
					{//bar 2
							new EnhancedNote(JMC.C4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.AF4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1)
					},
					{//bar 3
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.EF4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1)
					},
					{//bar 4
							new EnhancedNote(JMC.C4, EnhancedDuration.WHOLE_NOTE, BaseNote.C1)
					}
			},
			MusicNotationView.KeySignature.C_MINOR,
			(byte)4, (byte)4,
			15
	),
	M_16(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.C4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.E4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.G4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.G1),
					},
					{//bar 2
							new EnhancedNote(JMC.F4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.D4, EnhancedDuration.EIGHTH_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.G4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.G1)
					},
					{//bar 3
							new EnhancedNote(JMC.C4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.F4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2)
					},
					{//bar 4
							new EnhancedNote(JMC.G4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.D4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.C4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C1)
					}
			},
			MusicNotationView.KeySignature.C_MAJOR,
			(byte)9, (byte)8,
			16
	),
	M_17(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.D4, EnhancedDuration.EIGHTH_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1)
					},
					{//bar 2
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.C4, EnhancedDuration.QUARTER_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1)
					},
					{//bar 3
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.A4, EnhancedDuration.EIGHTH_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.C5, EnhancedDuration.QUARTER_NOTE, BaseNote.C2)
					},
					{//bar 4
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1)
					}
			},
			MusicNotationView.KeySignature.G_MAJOR,
			(byte)3, (byte)4,
			17
	),
	M_18(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.F4, EnhancedDuration.DOTTED_HALF_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.C5, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C2)
					},
					{//bar 2
							new EnhancedNote(JMC.G4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.BF4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.D5, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.D2),
							new EnhancedNote(JMC.C5, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C2)
					},
					{//bar 3
							new EnhancedNote(JMC.E4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.F4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.BF4, EnhancedDuration.EIGHTH_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.C5, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.C2)
					},
					{//bar 4
							new EnhancedNote(JMC.F4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.G4, EnhancedDuration.EIGHTH_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.F4, EnhancedDuration.DOTTED_HALF_NOTE, BaseNote.F1)
					}
			},
			MusicNotationView.KeySignature.F_MAJOR,
			(byte)12, (byte)8,
			18
	),
	M_19(new EnhancedNote[][]
			{
					{//bar 1
							new EnhancedNote(JMC.D4, EnhancedDuration.HALF_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.B4, EnhancedDuration.QUARTER_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1)
					},
					{//bar 2
							new EnhancedNote(JMC.A4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.B4, EnhancedDuration.EIGHTH_NOTE, BaseNote.B2),
							new EnhancedNote(JMC.A4, EnhancedDuration.QUARTER_NOTE, BaseNote.A2),
							new EnhancedNote(JMC.FS4, EnhancedDuration.QUARTER_NOTE, BaseNote.F1)
					},
					{//bar 3
							new EnhancedNote(JMC.E4, EnhancedDuration.DOTTED_QUARTER_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.FS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.F1),
							new EnhancedNote(JMC.G4, EnhancedDuration.QUARTER_NOTE, BaseNote.G1),
							new EnhancedNote(JMC.E4, EnhancedDuration.QUARTER_NOTE, BaseNote.E1)
					},
					{//bar 4
							new EnhancedNote(JMC.D4, EnhancedDuration.QUARTER_NOTE, BaseNote.D1),
							new EnhancedNote(JMC.CS4, EnhancedDuration.EIGHTH_NOTE, BaseNote.C1),
							new EnhancedNote(JMC.E4, EnhancedDuration.EIGHTH_NOTE, BaseNote.E1),
							new EnhancedNote(JMC.D4, EnhancedDuration.HALF_NOTE, BaseNote.D1)
					}
			},
			MusicNotationView.KeySignature.D_MAJOR,
			(byte)4, (byte)4,
			19
	);

	static final byte DIFFICULTY_LEVEL_EASY = 0;
	static final byte DIFFICULTY_LEVEL_MEDIUM = 1;

	private final EnhancedNote[][] musicalPhrase;
	private final MusicNotationView.KeySignature keySignature;
	private final byte timeSignatureUpperNum;
	private final byte timeSignatureLowerNum;
	private final int numericalIdentifier;

	PracticeMusic(EnhancedNote[][] musicalPhrase, MusicNotationView.KeySignature keySignature, byte timeSignatureUpperNum,
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

	/**
	 * @return The key signature associated with the music.
	 */
	public MusicNotationView.KeySignature getKeySignature()
	{
		return keySignature;
	}

	/**
	 * @return The upper number of the time signature associated with the music.
	 */
	public byte getTimeSignatureUpperNum()
	{
		return timeSignatureUpperNum;
	}

	/**
	 * @return The lower number of the time signature associated with the music.
	 */
	public byte getTimeSignatureLowerNum()
	{
		return timeSignatureLowerNum;
	}

	/**
	 * @return The unique numerical identifier associated with each PracticeMusic.
	 */
	public int getNumericalIdentifier()
	{
		return numericalIdentifier;
	}

	/**
	 * @param difficulty
	 * @param numId The numerical identifier.
	 * @return The medium difficulty PracticeMusic associated with the inputted numerical identifier, or null for -1 or an invalid numerical identifier.
	 */
	public static PracticeMusic getPracticeMusicFromNumericalIdentifier(byte difficulty, int numId)
	{
		switch (difficulty)
		{
			//todo update as needed
			case DIFFICULTY_LEVEL_EASY:
				switch (numId)
				{
					case 0:
						return E_0;
					case 1:
						return E_1;
					case 2:
						return E_2;
					case 3:
						return E_3;
					case 4:
						return E_4;
					case 5:
						return E_5;
					case 6:
						return E_6;
					case 7:
						return E_7;
					case 8:
						return E_8;
					case 9:
						return E_9;
					case -1:
					default:
						return null;
				}
			case DIFFICULTY_LEVEL_MEDIUM:
				switch (numId)
				{
					case 0:
						return M_0;
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
					case -1:
					default:
						return null;
				}
				//no break needed due to the return statements in the inner switch statement
			default:
				return null;
		}
	}

	public static PracticeMusic[] getPracticeMusic(byte difficulty)
	{
		switch (difficulty)
		{
			//todo update this list as new music is added
			case DIFFICULTY_LEVEL_EASY:
				return new PracticeMusic[]
						{
								E_0, E_1, E_2, E_3, E_4, E_5, E_6, E_7, E_8, E_9
						};
			case DIFFICULTY_LEVEL_MEDIUM:
				return new PracticeMusic[]
						{
								M_0, M_1, M_2, M_3, M_4, M_5, M_6, M_7, M_8, M_9, M_10, M_11, M_12, M_13, M_14, M_15, M_16, M_17, M_18, M_19
						};
			default:
				return null;
		}
	}

	/**
	 * Returns a random PracticeMusic.
	 * @/param valueToExclude The numerical identifier of the PracticeMusic that you wish to not be returned.
	 * @/return A random PracticeMusic.
	 */
	/*
	public static PracticeMusic getRandomPracticeMusic(int valueToExclude)
	{
		int randomInt;
		do //this loop will run at least once, but will keep repeating until the random number doesn't equal valueToExclude
		{
			//todo verify that the multiplier is correct (the number multiplying math.random() is equal to the number of melodies)
			randomInt = ((int) (Math.random() * 19)) + 1;
		} while  (randomInt == valueToExclude && randomInt == 0);

		return getPracticeMusicFromNumericalIdentifier(randomInt, );
	}
	*/

	@Override
	public String toString()
	{
		return "#" + Math.abs(numericalIdentifier) + " " + "Key Signature: " + keySignature.toString() + "\n" +
				"Time Signature: " + timeSignatureUpperNum + "/" + timeSignatureLowerNum;
	}
}
