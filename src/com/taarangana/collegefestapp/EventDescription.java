package com.taarangana.collegefestapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.taarangana.collegefestapp.utils.AppConstants;


public class EventDescription extends ActionBarActivity {

	private TextView eventName,eventDescription,eventContact,eventRules;
	private ImageView eventImage;	
	private Button register;
	private String name,description,contact,url,rules;
	private int id;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_event_page);

		ActionBar bar = getSupportActionBar();
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		bar.setDisplayShowTitleEnabled(true);
		bar.setDisplayShowHomeEnabled(true);

		eventName=(TextView)findViewById(R.id.eventName);
		eventDescription=(TextView)findViewById(R.id.eventDescription);
		eventRules=(TextView)findViewById(R.id.RulesandRegulation);
		eventContact=(TextView)findViewById(R.id.eventContact);
		eventImage=(ImageView)findViewById(R.id.eventImage);
		register = (Button) findViewById(R.id.register);
		register.setVisibility(View.INVISIBLE);

		name=getIntent().getExtras().getString(AppConstants.NAME_KEY);		
		id=getIntent().getExtras().getInt(AppConstants.ICON_ID);
		description=getIntent().getExtras().getString(AppConstants.DESCRIPTION_KEY);
		rules=getIntent().getExtras().getString(AppConstants.RULES_KEY);
		contact=getIntent().getExtras().getString(AppConstants.CONTACT_KEY);
		url = getIntent().getExtras().getString(AppConstants.URL);

		eventName.setText(name);
		eventDescription.setText(description);
		eventRules.setText(rules);
		Drawable img=this.getResources().getDrawable(id);
		eventImage.setImageDrawable(img);
		eventContact.setText(contact);		

		if(url.equals("")){
			register.setText("On The Spot Registration Only");
			register.setEnabled(false);	
			register.setVisibility(View.VISIBLE);					
		}
		else if(url.endsWith("closed")){
			register.setText(url);
			register.setEnabled(false);	
			register.setVisibility(View.VISIBLE);
		}
		else if(url.endsWith(".html")){
			register.setVisibility(View.VISIBLE);
		}		

		register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view)
			{				
				Uri uriUrl = Uri.parse(url);
				Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
				startActivity(launchBrowser);			

			}
		});

	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		// Handle action bar actions click
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// if nav drawer is opened, hide the action items
		return super.onPrepareOptionsMenu(menu);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_second_event_page, menu);
		return true;
	}
	/*@Override
protected void onRestart() {
	// TODO Auto-generated method stub
	super.onRestart();

	Intent intt=new Intent(this, SplashScreen.class);
	intt.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
	startActivity(intt);
	finish();
}*/

}
