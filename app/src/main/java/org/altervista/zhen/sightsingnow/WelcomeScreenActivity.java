package org.altervista.zhen.sightsingnow;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


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

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings)
		{
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public void onClickTrebleClef(View view)
	{
		Intent intent = new Intent(this, PracticeActivity.class)
				.putExtra(PracticeActivity.EXTRA_CLEF, MusicNotationView.Clef.TREBLE);
	}

	public void onClickBassClef(View view)
	{
		//todo send intent
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
