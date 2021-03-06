package org.altervista.zhen.sightsingnow;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import jm.music.data.Note;

import static org.altervista.zhen.sightsingnow.EnhancedNote.EnhancedDuration;

/**
 * This custom view takes musical data as input and draws a musical staff with the inputted music on it.
 */
public class MusicNotationView extends View
{
    private final String LOG_TAG = MusicNotationView.class.getSimpleName();

    private Paint mStaffLinesPaint;
	private Paint mDotPaint;

    private Clef mClef ;
    private KeySignature mKeySignature;
    private byte mTimeSignatureUpperNum;
    private byte mTimeSignatureLowerNum;

    private EnhancedNote[][] mMusicalPhrase;

    private Bitmap mTrebleClefBitmap;
    private Bitmap mBassClefBitmap;

    private Bitmap mSharpSymbolBitmap;
    private Bitmap mFlatSymbolBitmap;
	private Bitmap mNaturalSymbolBitmap;

    private Bitmap mTimeSignatureZeroBitmap;
    private Bitmap mTimeSignatureOneBitmap;
    private Bitmap mTimeSignatureTwoBitmap;
    private Bitmap mTimeSignatureThreeBitmap;
    private Bitmap mTimeSignatureFourBitmap;
    private Bitmap mTimeSignatureFiveBitmap;
    private Bitmap mTimeSignatureSixBitmap;
    private Bitmap mTimeSignatureSevenBitmap;
    private Bitmap mTimeSignatureEightBitmap;
    private Bitmap mTimeSignatureNineBitmap;

	private Bitmap mWholeNoteBitmap;
	private Bitmap mHalfNoteStemUpBitmap;
	private Bitmap mHalfNoteStemDownBitmap;
	private Bitmap mQuarterNoteStemUpBitmap;
	private Bitmap mQuarterNoteStemDownBitmap;
	private Bitmap mEighthNoteStemUpBitmap;
	private Bitmap mEighthNoteStemDownBitmap;
	private Bitmap mSixteenthNoteStemUpBitmap;
	private Bitmap mSixteenthNoteStemDownBitmap;
	private Bitmap mThirtysecondNoteStemUpBitmap;
	private Bitmap mThirtysecondNoteStemDownBitmap;

    public MusicNotationView(Context context)
    {
        super(context);
        init();
    }

    public MusicNotationView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public MusicNotationView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MusicNotationView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init()
    {
        mStaffLinesPaint = new Paint();
        mStaffLinesPaint.setColor(Color.BLACK);
        mStaffLinesPaint.setStrokeWidth(1);

		mDotPaint = new Paint();
		mDotPaint.setColor(Color.BLACK);
		mDotPaint.setStyle(Paint.Style.FILL);

        mTrebleClefBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.treble_clef);
        mBassClefBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bass_clef);

        mSharpSymbolBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sharp_symbol);
        mFlatSymbolBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.flat_symbol);
		mNaturalSymbolBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.natural_symbol);

        mTimeSignatureZeroBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.time_signature_0);
        mTimeSignatureOneBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.time_signature_1);
        mTimeSignatureTwoBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.time_signature_2);
        mTimeSignatureThreeBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.time_signature_3);
        mTimeSignatureFourBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.time_signature_4);
        mTimeSignatureFiveBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.time_signature_5);
        mTimeSignatureSixBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.time_signature_6);
        mTimeSignatureSevenBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.time_signature_7);
        mTimeSignatureEightBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.time_signature_8);
        mTimeSignatureNineBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.time_signature_9);

		mWholeNoteBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.whole_note);
		mHalfNoteStemUpBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.half_note_up);
		mHalfNoteStemDownBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.half_note_down);
		mQuarterNoteStemUpBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.quarter_note_up);
		mQuarterNoteStemDownBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.quarter_note_down);
		mEighthNoteStemUpBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.eighth_note_up);
		mEighthNoteStemDownBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.eighth_note_down);
		mSixteenthNoteStemUpBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sixteenth_note_up);
		mSixteenthNoteStemDownBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sixteenth_note_down);
		mThirtysecondNoteStemUpBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.thirtysecond_note_up);
		mThirtysecondNoteStemDownBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.thirtysecond_note_down);
    }

	/**
     * Sets the clef to be displayed.
     * @param clef The clef to be displayed
     */
    public void setClef(Clef clef)
    {
        mClef = clef;
        invalidate();
    }

    /**
     * Sets the key signature to be displayed.
     * @param keySignature The key signature to be displayed
     */
    public void setKeySignature(KeySignature keySignature)
    {
        mKeySignature = keySignature;
        invalidate();
    }

	/**
	 * Sets the time signature to be displayed.
	 * @param upperNum The upper number in the time signature.
	 * @param lowerNum The lower number in the time signature.
	 */
    public void setTimeSignature(byte upperNum, byte lowerNum)
    {
        mTimeSignatureUpperNum = upperNum;
        mTimeSignatureLowerNum = lowerNum;
		invalidate();
    }

    /**
     * Sets the musical phrase to be displayed.
     * @param musicalPhrase The musical phrase to be displayed, inputted as an array of bars, which are an array of notes. The inner arrays represents the individual
     *                      bars of the music, and the outer array represents a phrase made from these individual bars.
     */
    public void setMusicalPhrase(EnhancedNote[][] musicalPhrase)
    {
        mMusicalPhrase = musicalPhrase;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        //draws the lines of the staff
        float gapBetweenLines = 1 + canvas.getHeight() * (1f/12f);
        float lineFiveY = canvas.getHeight() * (4f/12f); //top staff line
        float lineFourY = lineFiveY + gapBetweenLines; //2nd from top
        float lineThreeY = lineFourY + gapBetweenLines; //middle
        float lineTwoY = lineThreeY + gapBetweenLines; //2nd from bottom
        float lineOneY = lineTwoY + gapBetweenLines; //bottom staff line
        canvas.drawLine(0, lineFiveY, canvas.getWidth(), lineFiveY + 1, mStaffLinesPaint);
        canvas.drawLine(0, lineFourY, canvas.getWidth(), lineFourY + 1, mStaffLinesPaint);
        canvas.drawLine(0, lineThreeY, canvas.getWidth(), lineThreeY + 1, mStaffLinesPaint);
        canvas.drawLine(0, lineTwoY, canvas.getWidth(), lineTwoY + 1, mStaffLinesPaint);
        canvas.drawLine(0, lineOneY, canvas.getWidth(), lineOneY + 1, mStaffLinesPaint);

		//draws last barline
		canvas.drawLine(getWidth() - 1, lineFiveY, getWidth(), lineOneY + 1, mStaffLinesPaint);

        float startX = 0;

		//draws the clef
        float clefWidth = canvas.getWidth() * 0.06f;
        if (mClef != null)
        {
            switch (mClef)
            {
                case TREBLE:
                    drawTrebleClef(canvas, clefWidth);
                    break;
                case BASS:
                    drawBassClef(canvas, clefWidth, lineTwoY, lineFiveY, gapBetweenLines);
                    break;
                default:
                    break;
            }
        }

        startX += clefWidth;

        float smallEmptySpaceCoefficient = 0.0075f;

        //adds a small empty space between the clef and key signature
        startX += canvas.getWidth() * smallEmptySpaceCoefficient;

        //calculation for width of sharp: gapBetweenLines * 2.5 is the height of the sharp sign, 60/190 is the width/height ratio of the sharp sign
        float widthOfSharp = gapBetweenLines * 2.5f * (60f/190f);
		//calculation for width of flat is analogous to width of sharp
        float widthOfFlat = gapBetweenLines * 2f * (60f/130f);
        //Accidentals of the key signatures overlap slightly in the x-axis to conserve space, the coefficient determines the degree of overlap
        float keySignatureAccidentalOverlapCoefficient = (5f/6f);
        //draws the key signature
        if (mKeySignature != null)
        {
            switch (mKeySignature)
            {
                case G_MAJOR:
                case E_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawSharpOnLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        case BASS:
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        default:
                            break;
                    }
                    break;
                case D_MAJOR:
                case B_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawSharpOnLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        case BASS:
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        default:
                            break;
                    }
                    break;
                case A_MAJOR:
                case F_SHARP_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawSharpOnLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceAboveLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        case BASS:
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        default:
                            break;
                    }
                    break;
                case E_MAJOR:
                case C_SHARP_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawSharpOnLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceAboveLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        case BASS:
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        default:
                            break;
                    }
                    break;
                case B_MAJOR:
                case G_SHARP_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawSharpOnLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceAboveLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        case BASS:
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        default:
                            break;
                    }
                    break;
                case F_SHARP_MAJOR:
                case D_SHARP_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawSharpOnLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceAboveLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        case BASS:
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        default:
                            break;
                    }
                    break;
                case C_SHARP_MAJOR:
                case A_SHARP_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawSharpOnLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceAboveLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        case BASS:
                            drawSharpOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfSharp * keySignatureAccidentalOverlapCoefficient;
                            drawSharpOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfSharp;
                            break;
                        default:
                            break;
                    }
                    break;
                case F_MAJOR:
                case D_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        case BASS:
                            drawFlatOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        default:
                            break;
                    }
                    break;
                case B_FLAT_MAJOR:
                case G_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        case BASS:
                            drawFlatOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        default:
                            break;
                    }
                    break;
                case E_FLAT_MAJOR:
                case C_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        case BASS:
                            drawFlatOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        default:
                            break;
                    }
                    break;
                case A_FLAT_MAJOR:
                case F_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        case BASS:
                            drawFlatOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        default:
                            break;
                    }
                    break;
                case D_FLAT_MAJOR:
                case B_FLAT_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        case BASS:
                            drawFlatOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineOneY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        default:
                            break;
                    }
                    break;
                case G_FLAT_MAJOR:
                case E_FLAT_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        case BASS:
                            drawFlatOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineOneY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        default:
                            break;
                    }
                    break;
                case C_FLAT_MAJOR:
                case A_FLAT_MINOR:
                    switch (mClef)
                    {
                        case TREBLE:
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFiveY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        case BASS:
                            drawFlatOnLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineFourY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineTwoY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnLine(canvas, startX, lineOneY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineThreeY, gapBetweenLines);
                            startX += widthOfFlat * keySignatureAccidentalOverlapCoefficient;
                            drawFlatOnSpaceBelowLine(canvas, startX, lineOneY, gapBetweenLines);
                            startX += widthOfFlat;
                            break;
                        default:
                            break;
                    }
                    break;
                case C_MAJOR:
                case A_MINOR:
                case ATONAL:
                case NO_KEY_SIGNATURE:
                default:
                    //draw nothing
                    break;
            }
        }

        //adds a small gap between the key signature and the time signature
        startX += getWidth() * smallEmptySpaceCoefficient;

		//draw time signature
        startX += drawTimeSignature(canvas, mTimeSignatureUpperNum, mTimeSignatureLowerNum, startX, lineFiveY, lineThreeY, gapBetweenLines);

        //no small empty space added here as one will be added in drawMusicalNotes(...)

		//draw musical notes
        drawMusicalNotes(canvas, startX, smallEmptySpaceCoefficient, lineOneY, lineTwoY, lineThreeY, lineFourY, lineFiveY,
				gapBetweenLines);
    }

    /**
     * Draws a treble clef on the staff.
     *
     * @param canvas    The canvas to draw on
     * @param clefWidth 3/50ths of the total width of the staff is recommended
     */
    private void drawTrebleClef(Canvas canvas, float clefWidth)
    {
        RectF coordinates = new RectF(0, 0, clefWidth, canvas.getHeight());
        canvas.drawBitmap(mTrebleClefBitmap, null, coordinates, null);
    }

    /**
     * Draws a bass clef on the staff.
     *  @param canvas          The canvas to draw on
     * @param clefWidth       3/50ths of the total width of the staff is recommended
     * @param lineTwoY        Y position of the line immediately above the lowest line of the staff (B2 or low B on bass clef)
     * @param lineFiveY       Y position of the uppermost line of the staff (A3 or high A on bass clef)
     * @param gapBetweenLines The difference in Y between two lines on the staff
     */
    private void drawBassClef(Canvas canvas, float clefWidth, float lineTwoY, float lineFiveY, float gapBetweenLines)
    {
        RectF coordinates = new RectF(0, lineFiveY, clefWidth, lineTwoY + (gapBetweenLines / 2));
        canvas.drawBitmap(mBassClefBitmap, null, coordinates, null);
    }

    /**
     * Draws a sharp symbol on a line of the staff.
	 * @param canvas The canvas to draw on
	 * @param startX The X position to start drawing the symbol on
	 * @param lineY The Y position of the line to draw the symbol on
	 * @param gapBetweenLines The difference in Y between two lines on the staff
	 */
    private void drawSharpOnLine(Canvas canvas, float startX, float lineY, float gapBetweenLines)
    {
		float width = gapBetweenLines * 2.5f * (60f/190f);
        RectF coordinates = new RectF(startX, lineY - (gapBetweenLines * 1.25f), startX + width, lineY + (gapBetweenLines * 1.25f));
        canvas.drawBitmap(mSharpSymbolBitmap, null, coordinates, null);
    }

    /**
     * Draws a sharp symbol on the space above a line of the staff.
	 * @param canvas The canvas to draw on
	 * @param startX The X position to start drawing the symbol on
	 * @param lineY The Y position of the line to draw the symbol on
	 * @param gapBetweenLines The difference in Y between two lines on the staff
	 */
    private void drawSharpOnSpaceAboveLine(Canvas canvas, float startX, float lineY, float gapBetweenLines)
    {
		float width = gapBetweenLines * 2.5f * (60f/190f);
        RectF coordinates = new RectF(startX, lineY - (gapBetweenLines * 1.75f), startX + width, lineY + (gapBetweenLines * 0.75f));
        canvas.drawBitmap(mSharpSymbolBitmap, null, coordinates, null);
    }

    /**
     * Draws a sharp symbol on the space below a line of the staff.
	 * @param canvas The canvas to draw on
	 * @param startX The X position to start drawing the symbol on
	 * @param lineY The Y position of the line to draw the symbol on
	 * @param gapBetweenLines The difference in Y between two lines on the staff
	 */
    private void drawSharpOnSpaceBelowLine(Canvas canvas, float startX, float lineY, float gapBetweenLines)
    {
		float width = gapBetweenLines * 2.5f * (60f/190f);
        RectF coordinates = new RectF(startX, lineY - (gapBetweenLines * 0.75f), startX + width, lineY + (gapBetweenLines * 1.75f));
        canvas.drawBitmap(mSharpSymbolBitmap, null, coordinates, null);
    }

    /**
     * Draws a flat symbol on a line of the staff.
	 * @param canvas The canvas to draw on
	 * @param startX The X position to start drawing the symbol on
	 * @param lineY The Y position of the line to draw the symbol on
	 * @param gapBetweenLines The difference in Y between two lines on the staff
	 */
    private void drawFlatOnLine(Canvas canvas, float startX, float lineY, float gapBetweenLines)
    {
		float width = gapBetweenLines * 2f * (60f/130f);
        RectF coordinates = new RectF(startX, lineY - (gapBetweenLines * 1.5f), startX + width, lineY + (gapBetweenLines * 0.5f));
        canvas.drawBitmap(mFlatSymbolBitmap, null, coordinates, null);
    }

    /**
     * Draws a flat symbol on the space above a line of the staff.
	 * @param canvas The canvas to draw on
	 * @param startX The X position to start drawing the symbol on
	 * @param lineY The Y position of the line to draw the symbol on
	 * @param gapBetweenLines The difference in Y between two lines on the staff
	 */
    private void drawFlatOnSpaceAboveLine(Canvas canvas, float startX, float lineY, float gapBetweenLines)
    {
		float width = gapBetweenLines * 2f * (60f/130f);
        RectF coordinates = new RectF(startX, lineY - (gapBetweenLines * 2f), startX + width, lineY);
        canvas.drawBitmap(mFlatSymbolBitmap, null, coordinates, null);
    }

    /**
     * Draws a flat symbol on the space below a line of the staff.
	 * @param canvas The canvas to draw on
	 * @param startX The X position to start drawing the symbol on
	 * @param lineY The Y position of the line to draw the symbol on
	 * @param gapBetweenLines The difference in Y between two lines on the staff
	 */
    private void drawFlatOnSpaceBelowLine(Canvas canvas, float startX, float lineY, float gapBetweenLines)
    {
		float width = gapBetweenLines * 2f * (60f/130f);
        RectF coordinates = new RectF(startX, lineY - gapBetweenLines, startX + width, lineY + gapBetweenLines);
        canvas.drawBitmap(mFlatSymbolBitmap, null, coordinates, null);
    }

	/**
	 * Draws a natural symbol on a line of the staff.
	 * @param canvas The canvas to draw on
	 * @param startX The X position to start drawing the symbol on
	 * @param lineY The Y position of the line to draw the symbol on
	 * @param gapBetweenLines The difference in Y between two lines on the staff
	 */
	private void drawNaturalOnLine(Canvas canvas, float startX, float lineY, float gapBetweenLines)
	{
		float width = gapBetweenLines * 3f * (60f/250f);
		RectF coordinates = new RectF(startX, lineY - gapBetweenLines, startX + width, lineY + gapBetweenLines);
		canvas.drawBitmap(mNaturalSymbolBitmap, null, coordinates, null);
	}

    /**
     * Draws the time signature on the staff.
     * @param canvas The canvas to draw on
     * @param upperNum The upper number to draw.
     * @param lowerNum The lower number to draw.
     * @param startX The X position to start drawing the time signature on
     * @param lineFiveY The Y position of the uppermost line of the staff (F5 or high F on treble clef, A3 or high A on bass clef)
     * @param lineThreeY The Y position of the middle line of the staff (B4 or middle B on treble clef, D3 or middle D on bass clef)
     * @param gapBetweenLines The difference in Y between two lines on the staff
     * @return
     */
    private float drawTimeSignature(Canvas canvas, byte upperNum, byte lowerNum, float startX, float lineFiveY, float lineThreeY,
                                      float gapBetweenLines)
    {
        float heightOfNum = 2 * gapBetweenLines;
        //width = height that the number occupies * width:height ratio of number
        float widthOfZero = heightOfNum * (93f/115f);
        float widthOfOne = heightOfNum * (66f/115f);
        float widthOfTwo = heightOfNum * (91f/115f);
        float widthOfThree = heightOfNum * (88f/115f);
        float widthOfFour = heightOfNum * (93f/115f);
        float widthOfFive = heightOfNum * (77f/115f);
        float widthOfSix = heightOfNum * (89f/115f);
        float widthOfSeven = heightOfNum * (93f/115f);
        float widthOfEight = heightOfNum * (87f/115f);
        float widthOfNine = heightOfNum * (89f/115f);

        byte[] upperNumArray = {}, lowerNumArray = {};

        while (upperNum != 0)
        {
            upperNumArray = insertElementAtBeginningOfArray(upperNumArray, (byte) (upperNum % 10));
            upperNum /= 10;
        }

        while (lowerNum != 0)
        {
            lowerNumArray = insertElementAtBeginningOfArray(lowerNumArray, (byte) (lowerNum % 10));
            lowerNum /= 10;
        }

        //determine the widths that the numbers in the time signature will occupy
        float widthOfUpperNum = 0, widthOfLowerNum = 0;
        for (byte c : upperNumArray)
        {
            switch (c)
            {
                case 0:
                    widthOfUpperNum += widthOfZero;
                    break;
                case 1:
                    widthOfUpperNum += widthOfOne;
                    break;
                case 2:
                    widthOfUpperNum += widthOfTwo;
                    break;
                case 3:
                    widthOfUpperNum += widthOfThree;
                    break;
                case 4:
                    widthOfUpperNum += widthOfFour;
                    break;
                case 5:
                    widthOfUpperNum += widthOfFive;
                    break;
                case 6:
                    widthOfUpperNum += widthOfSix;
                    break;
                case 7:
                    widthOfUpperNum += widthOfSeven;
                    break;
                case 8:
                    widthOfUpperNum += widthOfEight;
                    break;
                case 9:
                    widthOfUpperNum += widthOfNine;
                    break;
                default:
                    break;
            }
        }

        for (byte c : lowerNumArray)
        {
            switch (c)
            {
                case 0:
                    widthOfLowerNum += widthOfZero;
                    break;
                case 1:
                    widthOfLowerNum += widthOfOne;
                    break;
                case 2:
                    widthOfLowerNum += widthOfTwo;
                    break;
                case 3:
                    widthOfLowerNum += widthOfThree;
                    break;
                case 4:
                    widthOfLowerNum += widthOfFour;
                    break;
                case 5:
                    widthOfLowerNum += widthOfFive;
                    break;
                case 6:
                    widthOfLowerNum += widthOfSix;
                    break;
                case 7:
                    widthOfLowerNum += widthOfSeven;
                    break;
                case 8:
                    widthOfLowerNum += widthOfEight;
                    break;
                case 9:
                    widthOfLowerNum += widthOfNine;
                    break;
                default:
                    break;
            }
        }

        //determine the startX (left) values for the numbers in the time signature based on their widths
        float startXUpperNum, startXLowerNum, totalWidth;
        if (widthOfUpperNum >= widthOfLowerNum)
        {
            totalWidth = widthOfUpperNum;
            startXUpperNum = startX;
            startXLowerNum = startX + ((widthOfUpperNum - widthOfLowerNum) / 2);
            //the adjustment for startXLowerNum works when widths of both numbers are equal as the value added to startX will be zero
        }
        else
        {
            totalWidth = widthOfLowerNum;
            startXUpperNum = startX + ((widthOfLowerNum - widthOfUpperNum) / 2);
            startXLowerNum = startX;
        }

        for (byte c : upperNumArray)
        {
            RectF coordinates;
            switch (c)
            {
                case 0:
                    coordinates = new RectF(startXUpperNum, lineFiveY, startXUpperNum + widthOfZero, lineFiveY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureZeroBitmap, null, coordinates, null);
                    startXUpperNum += widthOfZero;
                    break;
                case 1:
                    coordinates = new RectF(startXUpperNum, lineFiveY, startXUpperNum + widthOfOne, lineFiveY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureOneBitmap, null, coordinates, null);
                    startXUpperNum += widthOfOne;
                    break;
                case 2:
                    coordinates = new RectF(startXUpperNum, lineFiveY, startXUpperNum + widthOfTwo, lineFiveY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureTwoBitmap, null, coordinates, null);
                    startXUpperNum += widthOfTwo;
                    break;
                case 3:
                    coordinates = new RectF(startXUpperNum, lineFiveY, startXUpperNum + widthOfThree, lineFiveY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureThreeBitmap, null, coordinates, null);
                    startXUpperNum += widthOfThree;
                    break;
                case 4:
                    coordinates = new RectF(startXUpperNum, lineFiveY, startXUpperNum + widthOfFour, lineFiveY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureFourBitmap, null, coordinates, null);
                    startXUpperNum += widthOfFour;
                    break;
                case 5:
                    coordinates = new RectF(startXUpperNum, lineFiveY, startXUpperNum + widthOfFive, lineFiveY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureFiveBitmap, null, coordinates, null);
                    startXUpperNum += widthOfFive;
                    break;
                case 6:
                    coordinates = new RectF(startXUpperNum, lineFiveY, startXUpperNum + widthOfSix, lineFiveY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureSixBitmap, null, coordinates, null);
                    startXUpperNum += widthOfSix;
                    break;
                case 7:
                    coordinates = new RectF(startXUpperNum, lineFiveY, startXUpperNum + widthOfSeven, lineFiveY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureSevenBitmap, null, coordinates, null);
                    startXUpperNum += widthOfSeven;
                    break;
                case 8:
                    coordinates = new RectF(startXUpperNum, lineFiveY, startXUpperNum + widthOfEight, lineFiveY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureEightBitmap, null, coordinates, null);
                    startXUpperNum += widthOfEight;
                    break;
                case 9:
                    coordinates = new RectF(startXUpperNum, lineFiveY, startXUpperNum + widthOfNine, lineFiveY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureNineBitmap, null, coordinates, null);
                    startXUpperNum += widthOfNine;
                    break;
                default:
                    break;
            }
        }

        for (byte c : lowerNumArray)
        {
            RectF coordinates;
            switch (c)
            {
                case 0:
                    coordinates = new RectF(startXLowerNum, lineThreeY, startXLowerNum + widthOfZero, lineThreeY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureZeroBitmap, null, coordinates, null);
                    startXLowerNum += widthOfZero;
                    break;
                case 1:
                    coordinates = new RectF(startXLowerNum, lineThreeY, startXLowerNum + widthOfOne, lineThreeY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureOneBitmap, null, coordinates, null);
                    startXLowerNum += widthOfOne;
                    break;
                case 2:
                    coordinates = new RectF(startXLowerNum, lineThreeY, startXLowerNum + widthOfTwo, lineThreeY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureTwoBitmap, null, coordinates, null);
                    startXLowerNum += widthOfTwo;
                    break;
                case 3:
                    coordinates = new RectF(startXLowerNum, lineThreeY, startXLowerNum + widthOfThree, lineThreeY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureThreeBitmap, null, coordinates, null);
                    startXLowerNum += widthOfThree;
                    break;
                case 4:
                    coordinates = new RectF(startXLowerNum, lineThreeY, startXLowerNum + widthOfFour, lineThreeY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureFourBitmap, null, coordinates, null);
                    startXLowerNum += widthOfFour;
                    break;
                case 5:
                    coordinates = new RectF(startXLowerNum, lineThreeY, startXLowerNum + widthOfFive, lineThreeY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureFiveBitmap, null, coordinates, null);
                    startXLowerNum += widthOfFive;
                    break;
                case 6:
                    coordinates = new RectF(startXLowerNum, lineThreeY, startXLowerNum + widthOfSix, lineThreeY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureSixBitmap, null, coordinates, null);
                    startXLowerNum += widthOfSix;
                    break;
                case 7:
                    coordinates = new RectF(startXLowerNum, lineThreeY, startXLowerNum + widthOfSeven, lineThreeY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureSevenBitmap, null, coordinates, null);
                    startXLowerNum += widthOfSeven;
                    break;
                case 8:
                    coordinates = new RectF(startXLowerNum, lineThreeY, startXLowerNum + widthOfEight, lineThreeY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureEightBitmap, null, coordinates, null);
                    startXLowerNum += widthOfEight;
                    break;
                case 9:
                    coordinates = new RectF(startXLowerNum, lineThreeY, startXLowerNum + widthOfNine, lineThreeY + heightOfNum);
                    canvas.drawBitmap(mTimeSignatureNineBitmap, null, coordinates, null);
                    startXLowerNum += widthOfNine;
                    break;
                default:
                    break;
            }
        }

        return totalWidth;
    }

	/**
	 * Draw the musical notes on the staff.
	 * @param canvas The canvas to draw on
	 * @param startX The X position to start drawing the notes on
	 * @param smallEmptySpaceCoefficient The width of a small empty space in terms of getWidth()
	 * @param lineOneY The Y position of the lowest line of the staff (E4 or low E on treble clef, G2 or low G on bass clef)
	 * @param lineTwoY The Y position of the line immediately above the lowest line of the staff (G4 or middle G on treble clef, B2 or low B on bass clef)
	 * @param lineThreeY The Y position of the middle line of the staff (B4 or middle B on treble clef, D3 or middle D on bass clef)
	 * @param lineFourY The Y position of the line immediately below the uppermost line of the staff (D5 or middle D on treble cleff, F3 or middle F on bass clef)
	 * @param lineFiveY The Y position of the uppermost line of the staff (F5 or high F on treble clef, A3 or high A on bass clef)
	 * @param gapBetweenLines The difference in Y between two lines on the staff
	 */
    private void drawMusicalNotes(Canvas canvas, float startX, float smallEmptySpaceCoefficient, float lineOneY, float lineTwoY, float lineThreeY, float lineFourY, float lineFiveY,
								  float gapBetweenLines)
    {
        if (mMusicalPhrase == null) { return; }

        float barLength = (getWidth() - startX) / mMusicalPhrase.length;

		//draw barlines
        float barlineStartX = startX;
        for (Note[] notes : mMusicalPhrase)
        {
            barlineStartX += barLength;
            canvas.drawLine(barlineStartX, lineFiveY, barlineStartX + 1, lineOneY, mStaffLinesPaint);
        }

        float emptySpaceWholeNote, emptySpaceHalfNote, emptySpaceQuarterNote, emptySpaceEighthNote, emptySpaceSixteenthNote, emptySpaceThirtySecondNote;

		//assign the amounts of empty space that notes shall displace on the staff.
        if (mTimeSignatureUpperNum != 0)
        {
            switch (mTimeSignatureLowerNum)
            {
                case 1:
                    emptySpaceWholeNote = barLength / mTimeSignatureUpperNum;
                    emptySpaceHalfNote = emptySpaceWholeNote / 2;
                    emptySpaceQuarterNote = emptySpaceHalfNote / 2;
                    emptySpaceEighthNote = emptySpaceQuarterNote / 2;
                    emptySpaceSixteenthNote = emptySpaceEighthNote / 2;
                    emptySpaceThirtySecondNote = emptySpaceSixteenthNote / 2;
                    break;
                case 2:
                    emptySpaceHalfNote = barLength / mTimeSignatureUpperNum;
                    emptySpaceWholeNote = emptySpaceHalfNote * 2;
                    emptySpaceQuarterNote = emptySpaceHalfNote / 2;
                    emptySpaceEighthNote = emptySpaceQuarterNote / 2;
                    emptySpaceSixteenthNote = emptySpaceEighthNote / 2;
                    emptySpaceThirtySecondNote = emptySpaceSixteenthNote / 2;
                    break;
                case 4:
                    emptySpaceQuarterNote = barLength / mTimeSignatureUpperNum;
                    emptySpaceHalfNote = emptySpaceQuarterNote * 2;
                    emptySpaceWholeNote = emptySpaceHalfNote * 2;
                    emptySpaceEighthNote = emptySpaceQuarterNote / 2;
                    emptySpaceSixteenthNote = emptySpaceEighthNote / 2;
                    emptySpaceThirtySecondNote = emptySpaceSixteenthNote / 2;
                    break;
                case 8:
                    emptySpaceEighthNote = barLength / mTimeSignatureUpperNum;
                    emptySpaceQuarterNote = emptySpaceEighthNote * 2;
                    emptySpaceHalfNote = emptySpaceQuarterNote * 2;
                    emptySpaceWholeNote = emptySpaceHalfNote * 2;
                    emptySpaceSixteenthNote = emptySpaceEighthNote / 2;
                    emptySpaceThirtySecondNote = emptySpaceSixteenthNote / 2;
                    break;
                case 16:
                    emptySpaceSixteenthNote = barLength / mTimeSignatureUpperNum;
                    emptySpaceEighthNote = emptySpaceSixteenthNote * 2;
                    emptySpaceQuarterNote = emptySpaceEighthNote * 2;
                    emptySpaceHalfNote = emptySpaceQuarterNote * 2;
                    emptySpaceWholeNote = emptySpaceHalfNote * 2;
                    emptySpaceThirtySecondNote = emptySpaceSixteenthNote / 2;
                    break;
                case 32:
                    emptySpaceThirtySecondNote = barLength / mTimeSignatureUpperNum;
                    emptySpaceSixteenthNote = emptySpaceThirtySecondNote * 2;
                    emptySpaceEighthNote = emptySpaceSixteenthNote * 2;
                    emptySpaceQuarterNote = emptySpaceEighthNote * 2;
                    emptySpaceHalfNote = emptySpaceQuarterNote * 2;
                    emptySpaceWholeNote = emptySpaceHalfNote * 2;
                    break;
                default: //these values may result in unpredictable drawings
                    emptySpaceQuarterNote = barLength / mTimeSignatureUpperNum;
                    emptySpaceHalfNote = emptySpaceQuarterNote * 2;
                    emptySpaceWholeNote = emptySpaceHalfNote * 2;
                    emptySpaceEighthNote = emptySpaceQuarterNote / 2;
                    emptySpaceSixteenthNote = emptySpaceEighthNote / 2;
                    emptySpaceThirtySecondNote = emptySpaceSixteenthNote / 2;
                    break;
            }
        }
        else //if mTimeSignatureUpperNum == 0
        {   //these values may result in unpredictable drawings
            emptySpaceQuarterNote = barLength / 4;
            emptySpaceHalfNote = emptySpaceQuarterNote * 2;
            emptySpaceWholeNote = emptySpaceHalfNote * 2;
            emptySpaceEighthNote = emptySpaceQuarterNote / 2;
            emptySpaceSixteenthNote = emptySpaceEighthNote / 2;
            emptySpaceThirtySecondNote = emptySpaceSixteenthNote / 2;
        }

		startX += getWidth() * 2.5f * smallEmptySpaceCoefficient;

		final float noteheadWidth = gapBetweenLines * (34f/27f);
		final float noteheadHeight = gapBetweenLines;
		final float stemmedNoteHeight = gapBetweenLines * (100f/27f);
		final float narrowNoteWidth = noteheadWidth;
		final float wideNoteWidth = noteheadWidth * (58f/34f); //use for up-stem eighth/sixteenth/thirtysecond notes
		final float wholeNoteWidth = gapBetweenLines * (62f/36f);

		final float ledgerLineOffsetWidth = noteheadWidth * (1f/3f);

        for (EnhancedNote[] bar : mMusicalPhrase)
        {
            for (EnhancedNote note : bar)
            {
				YPosOfNoteheadWithLedgerLinesAndStemDir yPosOfNoteheadCenterWithLedgerLinesAndStemDir =
						getCenterYPositionOfNotehead(note, lineOneY, lineTwoY, lineThreeY, lineFourY, lineFiveY,
								gapBetweenLines);
                EnhancedDuration[] enhancedDurations = note.getEnhancedDurations();
				//note that drawing ties are currently not supported, this shall be later revised
                for (EnhancedDuration duration : enhancedDurations)
                {
					//draw ledger lines
					if (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.positionOfLedgerLines != PositionOfLedgerLines.NO_LEDGER_LINES)
					{
						float drawLedgerLineY;
						switch(yPosOfNoteheadCenterWithLedgerLinesAndStemDir.positionOfLedgerLines)
						{
							case ABOVE_THE_STAFF:
								drawLedgerLineY = lineFiveY - gapBetweenLines;
								for (int i = 1; i <= yPosOfNoteheadCenterWithLedgerLinesAndStemDir.numOfLedgerLines; i++)
								{
									canvas.drawLine(startX - ledgerLineOffsetWidth, drawLedgerLineY,
											startX + noteheadWidth + ledgerLineOffsetWidth, drawLedgerLineY + 1, mStaffLinesPaint);
									drawLedgerLineY -= gapBetweenLines;
								}
								break;
							case BELOW_THE_STAFF:
								drawLedgerLineY = lineOneY + gapBetweenLines;
								for (int i = 1; i <= yPosOfNoteheadCenterWithLedgerLinesAndStemDir.numOfLedgerLines; i++)
								{
									canvas.drawLine(startX - ledgerLineOffsetWidth, drawLedgerLineY,
											startX + noteheadWidth + ledgerLineOffsetWidth, drawLedgerLineY + 1, mStaffLinesPaint);
									drawLedgerLineY += gapBetweenLines;
								}
								break;
							default:
								break;
						}
					}

					//draw notes and accidentals
					float widthOfSharp = gapBetweenLines * 2.5f * (60f/190f);
					float widthOfFlat = gapBetweenLines * 2f * (60f/130f);
					float widthOfNatural = gapBetweenLines * 3f * (60f/250f);
					float left, top, right, bottom, centerXForDot1, centerXForDot2, centerYForDot;
					float accidentalOffset = getWidth() * (1f/4f) * smallEmptySpaceCoefficient;
					float centerXForDot1Offset = getWidth() * (1f/2f) * smallEmptySpaceCoefficient;
					float centerXForDot2Offset = 1.5f * centerXForDot1Offset;
					float centerYForDotOffset = gapBetweenLines * (11f/16f);
					float radiusOfDot = gapBetweenLines * (1f/6f);
					RectF coordinates;
					switch (duration)
					{
						case WHOLE_NOTE:
							//there are no stems in whole notes, so there's not a stem direction to worry about
							left = startX;
							top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (noteheadHeight / 2);
							right = startX + wholeNoteWidth;
							bottom = top + noteheadHeight;
							coordinates = new RectF(left, top, right, bottom);
							canvas.drawBitmap(mWholeNoteBitmap, null, coordinates, null);
							//draw accidentals in front of note
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - accidentalOffset - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - accidentalOffset - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - accidentalOffset - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							startX += emptySpaceWholeNote;
							break;
						case DOTTED_WHOLE_NOTE:
							//there are no stems in whole notes, so there's not a stem direction to worry about
							left = startX;
							top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (noteheadHeight / 2);
							right = startX + wholeNoteWidth;
							bottom = top + noteheadHeight;
							coordinates = new RectF(left, top, right, bottom);
							canvas.drawBitmap(mWholeNoteBitmap, null, coordinates, null);
							//draw accidentals in front of note
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
                                default:
									break;
							}
							centerXForDot1 = right + centerXForDot1Offset;
							centerYForDot = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - centerYForDotOffset;
							canvas.drawCircle(centerXForDot1, centerYForDot, radiusOfDot, mDotPaint);
							startX += emptySpaceWholeNote * EnhancedDuration.DOTTED_MULTIPLIER;
							break;
						case DOUBLE_DOTTED_WHOLE_NOTE:
							//there are no stems in whole notes, so there's not a stem direction to worry about
							left = startX;
							top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (noteheadHeight / 2);
							right = startX + wholeNoteWidth;
							bottom = top + noteheadHeight;
							coordinates = new RectF(left, top, right, bottom);
							canvas.drawBitmap(mWholeNoteBitmap, null, coordinates, null);
							//draw accidentals in front of note
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							centerXForDot1 = right + centerXForDot1Offset;
							centerYForDot = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - centerYForDotOffset;
							centerXForDot2 = centerXForDot1 + radiusOfDot + centerXForDot2Offset;
							canvas.drawCircle(centerXForDot1, centerYForDot, radiusOfDot, mDotPaint);
							canvas.drawCircle(centerXForDot2, centerYForDot, radiusOfDot, mDotPaint);
							startX += emptySpaceWholeNote * EnhancedDuration.DOUBLE_DOTTED_MULTIPLIER;
							break;
						case HALF_NOTE:
							left = startX;
							right = startX + narrowNoteWidth;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mHalfNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mHalfNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							startX += emptySpaceHalfNote;
							break;
						case DOTTED_HALF_NOTE:
							left = startX;
							right = startX + narrowNoteWidth;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mHalfNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mHalfNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							centerXForDot1 = right + centerXForDot1Offset;
							centerYForDot = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - centerYForDotOffset;
							canvas.drawCircle(centerXForDot1, centerYForDot, radiusOfDot, mDotPaint);
							startX += emptySpaceHalfNote * EnhancedDuration.DOTTED_MULTIPLIER;
							break;
						case DOUBLE_DOTTED_HALF_NOTE:
							left = startX;
							right = startX + narrowNoteWidth;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mHalfNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mHalfNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							centerXForDot1 = right + centerXForDot1Offset;
							centerYForDot = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - centerYForDotOffset;
							centerXForDot2 = centerXForDot1 + radiusOfDot + centerXForDot2Offset;
							canvas.drawCircle(centerXForDot1, centerYForDot, radiusOfDot, mDotPaint);
							canvas.drawCircle(centerXForDot2, centerYForDot, radiusOfDot, mDotPaint);
							startX += emptySpaceHalfNote * EnhancedDuration.DOUBLE_DOTTED_MULTIPLIER;
							break;
						case QUARTER_NOTE:
							left = startX;
							right = startX + narrowNoteWidth;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mQuarterNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mQuarterNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							startX += emptySpaceQuarterNote;
							break;
						case DOTTED_QUARTER_NOTE:
							left = startX;
							right = startX + narrowNoteWidth;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mQuarterNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mQuarterNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							centerXForDot1 = right + centerXForDot1Offset;
							centerYForDot = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - centerYForDotOffset;
							canvas.drawCircle(centerXForDot1, centerYForDot, radiusOfDot, mDotPaint);
							startX += emptySpaceQuarterNote * EnhancedDuration.DOTTED_MULTIPLIER;
							break;
						case DOUBLE_DOTTED_QUARTER_NOTE:
							left = startX;
							right = startX + narrowNoteWidth;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mQuarterNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mQuarterNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							centerXForDot1 = right + centerXForDot1Offset;
							centerYForDot = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - centerYForDotOffset;
							centerXForDot2 = centerXForDot1 + radiusOfDot + centerXForDot2Offset;
							canvas.drawCircle(centerXForDot1, centerYForDot, radiusOfDot, mDotPaint);
							canvas.drawCircle(centerXForDot2, centerYForDot, radiusOfDot, mDotPaint);
							startX += emptySpaceQuarterNote * EnhancedDuration.DOUBLE_DOTTED_MULTIPLIER;
							break;
						case EIGHTH_NOTE:
							left = startX;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									right = startX + wideNoteWidth;
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mEighthNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									right = startX + narrowNoteWidth;
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mEighthNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							startX += emptySpaceEighthNote;
							break;
						case DOTTED_EIGHTH_NOTE:
                            left = startX;
                            switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
                            {
                                case UP:
                                    right = startX + wideNoteWidth;
                                    bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
                                    top = bottom - stemmedNoteHeight;
                                    coordinates = new RectF(left, top, right, bottom);
                                    canvas.drawBitmap(mEighthNoteStemUpBitmap, null, coordinates, null);
                                    break;
                                case DOWN:
                                    right = startX + narrowNoteWidth;
                                    top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
                                    bottom = top + stemmedNoteHeight;
                                    coordinates = new RectF(left, top, right, bottom);
                                    canvas.drawBitmap(mEighthNoteStemDownBitmap, null, coordinates, null);
                                    break;
                                default:
                                    right = -1;
                                    break;
                            }
                            switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
                            {
                                case SHARP:
                                    float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
                                    drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
                                    break;
                                case FLAT:
                                    float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
                                    drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
                                    break;
                                case NATURAL:
                                    float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
                                    drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
                                    break;
                                case NONE:
                                    //draw nothing
                                    break;
                                default:
                                    break;
                            }
                            centerXForDot1 = right + centerXForDot1Offset;
                            centerYForDot = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - centerYForDotOffset;
                            canvas.drawCircle(centerXForDot1, centerYForDot, radiusOfDot, mDotPaint);
                            startX += emptySpaceEighthNote * EnhancedDuration.DOTTED_MULTIPLIER;
                            break;
						case DOUBLE_DOTTED_EIGHTH_NOTE:
							left = startX;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									right = startX + wideNoteWidth;
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mEighthNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									right = startX + narrowNoteWidth;
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mEighthNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									right = -1;
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							centerXForDot1 = right + centerXForDot1Offset;
							centerYForDot = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - centerYForDotOffset;
							centerXForDot2 = centerXForDot1 + radiusOfDot + centerXForDot2Offset;
							canvas.drawCircle(centerXForDot1, centerYForDot, radiusOfDot, mDotPaint);
							canvas.drawCircle(centerXForDot2, centerYForDot, radiusOfDot, mDotPaint);
							startX += emptySpaceEighthNote * EnhancedDuration.DOUBLE_DOTTED_MULTIPLIER;
							break;
						case SIXTEENTH_NOTE:
							left = startX;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									right = startX + wideNoteWidth;
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mSixteenthNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									right = startX + narrowNoteWidth;
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mSixteenthNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							startX += emptySpaceSixteenthNote;
							break;
						case DOTTED_SIXTEENTH_NOTE:
							left = startX;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									right = startX + wideNoteWidth;
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mSixteenthNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									right = startX + narrowNoteWidth;
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mSixteenthNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									right = -1;
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							centerXForDot1 = right + centerXForDot1Offset;
							centerYForDot = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - centerYForDotOffset;
							canvas.drawCircle(centerXForDot1, centerYForDot, radiusOfDot, mDotPaint);
							startX += emptySpaceSixteenthNote * EnhancedDuration.DOTTED_MULTIPLIER;
							break;
						case THIRTYSECOND_NOTE:
							left = startX;
							switch (yPosOfNoteheadCenterWithLedgerLinesAndStemDir.stemDirection)
							{
								case UP:
									right = startX + wideNoteWidth;
									bottom = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition + (1f/2f) * noteheadHeight;
									top = bottom - stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mThirtysecondNoteStemUpBitmap, null, coordinates, null);
									break;
								case DOWN:
									right = startX + narrowNoteWidth;
									top = yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition - (1f/2f) * noteheadHeight;
									bottom = top + stemmedNoteHeight;
									coordinates = new RectF(left, top, right, bottom);
									canvas.drawBitmap(mThirtysecondNoteStemDownBitmap, null, coordinates, null);
									break;
								default:
									break;
							}
							switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getAccidental())
							{
								case SHARP:
									float startXForSharp = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfSharp;
									drawSharpOnLine(canvas, startXForSharp, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case FLAT:
									float startXForFlat = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfFlat;
									drawFlatOnLine(canvas, startXForFlat, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NATURAL:
									float startXForNatural = startX - getWidth() * (1f/4f) * smallEmptySpaceCoefficient - widthOfNatural;
									drawNaturalOnLine(canvas, startXForNatural, yPosOfNoteheadCenterWithLedgerLinesAndStemDir.yPosition, gapBetweenLines);
									break;
								case NONE:
									//draw nothing
									break;
								default:
									break;
							}
							startX += emptySpaceThirtySecondNote;
							break;
						default:
							break;
					}
                }
            }
        }
    }

	private YPosOfNoteheadWithLedgerLinesAndStemDir getCenterYPositionOfNotehead(EnhancedNote note, float lineOneY,
						float lineTwoY, float lineThreeY, float lineFourY, float lineFiveY, float gapBetweenLines)
	{
		switch (mClef)
		{
			case TREBLE:
				switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getBaseNote())
				{
					case A1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineOneY + (2 * gapBetweenLines), 2,
								PositionOfLedgerLines.BELOW_THE_STAFF, StemDirection.UP);
					case B1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineOneY + (1.5f * gapBetweenLines), 1,
								PositionOfLedgerLines.BELOW_THE_STAFF, StemDirection.UP);
					case C1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineOneY + gapBetweenLines, 1,
								PositionOfLedgerLines.BELOW_THE_STAFF, StemDirection.UP);
					case D1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineOneY + (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.UP);
					case E1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineOneY, 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.UP);
					case F1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineTwoY + (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.UP);
					case G1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineTwoY, 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.UP);
					case A2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineThreeY + (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.UP);
					case B2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineThreeY, 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case C2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFourY + (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case D2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFourY, 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case E2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY + (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case F2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY, 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case G2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY - (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case A3:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY - gapBetweenLines, 1,
								PositionOfLedgerLines.ABOVE_THE_STAFF, StemDirection.DOWN);
					default:
						return null;
				}
			case BASS:
				switch (note.getBaseNoteAndOutOfKeySignatureAccidental().getBaseNote())
				{
					case A1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineTwoY + (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.UP);
					case B1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineTwoY, 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.UP);
					case C1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineThreeY + (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.UP);
					case D1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineThreeY, 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case E1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFourY + (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case F1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFourY, 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case G1:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY + (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case A2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY, 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case B2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY - (0.5f * gapBetweenLines), 0,
								PositionOfLedgerLines.NO_LEDGER_LINES, StemDirection.DOWN);
					case C2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY - gapBetweenLines, 1,
								PositionOfLedgerLines.ABOVE_THE_STAFF, StemDirection.DOWN);
					case D2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY - (1.5f * gapBetweenLines), 1,
								PositionOfLedgerLines.ABOVE_THE_STAFF, StemDirection.DOWN);
					case E2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY - (2 * gapBetweenLines), 2,
								PositionOfLedgerLines.ABOVE_THE_STAFF, StemDirection.DOWN);
					case F2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY - (2.5f * gapBetweenLines), 2,
								PositionOfLedgerLines.ABOVE_THE_STAFF, StemDirection.DOWN);
					case G2:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY - (3 * gapBetweenLines), 3,
								PositionOfLedgerLines.ABOVE_THE_STAFF, StemDirection.DOWN);
					case A3:
						return new YPosOfNoteheadWithLedgerLinesAndStemDir(lineFiveY - (3.5f * gapBetweenLines), 2,
								PositionOfLedgerLines.ABOVE_THE_STAFF, StemDirection.DOWN);
					default:
						return null;
				}
			default:
				return null;
		}
	}

    /**
     * Insert an element at the beginning of an array
     * @param array The array to be modified
     * @param element The element to insert
     */
    private byte[] insertElementAtBeginningOfArray(byte[] array, byte element)
    {
        byte[] returnArray = new byte[array.length + 1];
		System.arraycopy(array, 0, returnArray, 1, array.length);
        returnArray[0] = element;
        return returnArray;
    }

	@Deprecated
    protected void logNoPreInitializedFigure(String figureName)
    {
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        int myWidth, myHeight;

        myWidth = MeasureSpec.getSize(widthMeasureSpec);

        int heightSpecMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSpecSize = MeasureSpec.getSize(heightMeasureSpec);
        if (heightSpecMode == MeasureSpec.AT_MOST) //wrap content
        {
            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) //device is in portrait, myWidth < heightSpecSize
            {
                if (getRootView().getHeight() >= heightSpecSize)
                {
                    myHeight = getRootView().getHeight() / 8;
                }
                else
                {
                    myHeight = heightSpecSize / 8;
                }
            }
            else //assume that device is tilted horizontally
            {
                if (getRootView().getHeight() >= heightSpecSize)
                {
                    myHeight = getRootView().getHeight() / 5;
                }
                else
                {
                    myHeight = heightSpecSize / 5;
                }
            }
        }
        else
        {
            myHeight = heightSpecSize;
        }

        setMeasuredDimension(myWidth, myHeight);
    }

	private static final byte TREBLE_NUMERICAL_IDENTIFIER = 0; //these are only intented to be used in the constructor of the Clef enum to resolve a forward reference problem
	private static final byte BASS_CLEF_NUMERICAL_IDENTIFIER = 1;

    public static enum Clef
    {
        TREBLE(MusicNotationView.TREBLE_NUMERICAL_IDENTIFIER), BASS(MusicNotationView.BASS_CLEF_NUMERICAL_IDENTIFIER);

		private static String LOG_TAG = Clef.class.getSimpleName();
		//default visibility intended, these are intended to be used in other classes within the package
		static final byte TREBLE_NUMERICAL_IDENTIFIER = MusicNotationView.TREBLE_NUMERICAL_IDENTIFIER;
		static final byte BASS_NUMERICAL_IDENTIFIER = MusicNotationView.BASS_CLEF_NUMERICAL_IDENTIFIER;

		private byte mNumericalIdentifier;
		private Clef(byte numericalIdentifier) {numericalIdentifier = mNumericalIdentifier;}

		//default visibility intended
		byte getNumericalIdentifier() {return mNumericalIdentifier;}

		static Clef getClefFromNumericalIdentifier(byte numericalIdentifier)
		{
			switch (numericalIdentifier)
			{
				case TREBLE_NUMERICAL_IDENTIFIER:
					return TREBLE;
				case BASS_NUMERICAL_IDENTIFIER:
					return BASS;
				default: //assumes treble clef and logs an error
					return TREBLE;
			}
		}
    }

    public static enum KeySignature
    {
        C_MAJOR, G_MAJOR, D_MAJOR, A_MAJOR, E_MAJOR, B_MAJOR, F_SHARP_MAJOR, C_SHARP_MAJOR,
        F_MAJOR, B_FLAT_MAJOR, E_FLAT_MAJOR, A_FLAT_MAJOR, D_FLAT_MAJOR, G_FLAT_MAJOR, C_FLAT_MAJOR,
        A_MINOR, E_MINOR, B_MINOR, F_SHARP_MINOR, C_SHARP_MINOR, G_SHARP_MINOR, D_SHARP_MINOR, A_SHARP_MINOR,
        D_MINOR, G_MINOR, C_MINOR, F_MINOR, B_FLAT_MINOR, E_FLAT_MINOR, A_FLAT_MINOR,
        ATONAL, NO_KEY_SIGNATURE;

		@Override
		public String toString()
		{
			switch (this)
			{
				case C_MAJOR:
					return "C Major";
				case G_MAJOR:
					return "G Major";
				case D_MAJOR:
					return "D Major";
				case A_MAJOR:
					return "A Major";
				case E_MAJOR:
					return "E Major";
				case B_MAJOR:
					return "B Major";
				case F_SHARP_MAJOR:
					return "F Sharp Major";
				case C_SHARP_MAJOR:
					return "C Sharp Major";
				case F_MAJOR:
					return "F Major";
				case B_FLAT_MAJOR:
					return "B Flat Major";
				case E_FLAT_MAJOR:
					return "E Flat Major";
				case A_FLAT_MAJOR:
					return "A Flat Major";
				case D_FLAT_MAJOR:
					return "D Flat Major";
				case G_FLAT_MAJOR:
					return "G Flat Major";
				case C_FLAT_MAJOR:
					return "C Flat Major";
				case A_MINOR:
					return "A Minor";
				case E_MINOR:
					return "E Minor";
				case B_MINOR:
					return "B Minor";
				case F_SHARP_MINOR:
					return "F Sharp Minor";
				case C_SHARP_MINOR:
					return "C Sharp Minor";
				case G_SHARP_MINOR:
					return "G Sharp Minor";
				case D_SHARP_MINOR:
					return "D Sharp Minor";
				case A_SHARP_MINOR:
					return "A Sharp Minor";
				case D_MINOR:
					return "D Minor";
				case G_MINOR:
					return "G Minor";
				case C_MINOR:
					return "C Minor";
				case F_MINOR:
					return "F Minor";
				case B_FLAT_MINOR:
					return "B Flat Minor";
				case E_FLAT_MINOR:
					return "E Flat Minor";
				case A_FLAT_MINOR:
					return "A Flat Minor";
				case ATONAL:
					return "Atonal";
				case NO_KEY_SIGNATURE:
					return "No Key Signature";
				default:
					return super.toString();
			}
		}
	}

	private static class YPosOfNoteheadWithLedgerLinesAndStemDir
	{
		float yPosition; //using default visibility to allow these fields to be directly edited in this class, this is okay, as this class is private and only usable within MusicNotationView
		int numOfLedgerLines;
		PositionOfLedgerLines positionOfLedgerLines;
		StemDirection stemDirection;

		YPosOfNoteheadWithLedgerLinesAndStemDir(float yPosition, int numOfLedgerLines,
												PositionOfLedgerLines positionOfLedgerLines, StemDirection stemDirection)
		{
			this.yPosition = yPosition;
			this.numOfLedgerLines = numOfLedgerLines;
			this.positionOfLedgerLines = positionOfLedgerLines;
			this.stemDirection = stemDirection;
		}
	}

	private enum PositionOfLedgerLines
	{
		ABOVE_THE_STAFF, BELOW_THE_STAFF, NO_LEDGER_LINES
	}

	private enum StemDirection
	{
		UP, DOWN
	}
}