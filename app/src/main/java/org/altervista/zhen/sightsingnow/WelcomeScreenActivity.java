package org.altervista.zhen.sightsingnow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * The activity for the welcome screen.
 */
public class WelcomeScreenActivity extends ActionBarActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_screen);
		if (savedInstanceState == null)
		{
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new WelcomeScreenFragment())
					.commit();
		}
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_welcome_screen, menu);
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

	public void onClickTrebleClef(View view)
	{
		Intent intent = new Intent(this, SelectDifficultyActivity.class)
				.putExtra(PracticeActivity.EXTRA_CLEF, MusicNotationView.Clef.TREBLE_NUMERICAL_IDENTIFIER);
		startActivity(intent, null);
	}

	public void onClickBassClef(View view)
	{
		Intent intent = new Intent(this, SelectDifficultyActivity.class)
				.putExtra(PracticeActivity.EXTRA_CLEF, MusicNotationView.Clef.BASS_NUMERICAL_IDENTIFIER);
		startActivity(intent, null);
}

	public static class WelcomeScreenFragment extends Fragment
	{

		public WelcomeScreenFragment()
		{
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
								 Bundle savedInstanceState)
		{
			View rootView = inflater.inflate(R.layout.fragment_welcome_screen, container, false);
			return rootView;
		}
	}
}
