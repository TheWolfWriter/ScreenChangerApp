package ctec.screenchangerapp.controller;

import ctec.screenchangerapp.controller.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class StartingActivity extends Activity
{
	private Button firstScreenButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_starting);
		
		firstScreenButton = (Button) findViewById(R.id.firstScreenButton);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		firstScreenButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View currentView)
			{
				Intent myIntent = new Intent(currentView.getContext(), SecondActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});
	}
}
