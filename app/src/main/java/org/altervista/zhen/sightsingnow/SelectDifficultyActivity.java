package org.altervista.zhen.sightsingnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class SelectDifficultyActivity extends ActionBarActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_difficulty);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_select_difficulty, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings)
		{
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public void onClick(View v)
	{
		Intent intent = new Intent(this, SelectMusicActivity.class)
				.putExtra(PracticeActivity.EXTRA_CLEF,
						getIntent().getByteExtra(PracticeActivity.EXTRA_CLEF, MusicNotationView.Clef.TREBLE_NUMERICAL_IDENTIFIER));
		switch(v.getId())
		{
			case R.id.easy_difficulty_button:
				intent.putExtra(PracticeActivity.EXTRA_DIFFICULTY_LEVEL, PracticeMusic.DIFFICULTY_LEVEL_EASY);
				startActivity(intent);
				return;
			case R.id.medium_difficulty_button:
				intent.putExtra(PracticeActivity.EXTRA_DIFFICULTY_LEVEL, PracticeMusic.DIFFICULTY_LEVEL_MEDIUM);
				startActivity(intent);
				return;
			default:
				return;
		}
	}
}
