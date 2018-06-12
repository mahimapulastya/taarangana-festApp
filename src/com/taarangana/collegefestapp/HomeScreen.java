package com.taarangana.collegefestapp;

import java.util.ArrayList;
import java.util.List;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.taarangana.collegefestapp.adapter.CustomDrawerAdapter;
import com.taarangana.collegefestapp.utils.FestCountdownTimer;
import com.taarangana.collegefestapp.vo.DrawerItem;

public class HomeScreen extends ActionBarActivity implements SurfaceHolder.Callback {

	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private CharSequence mDrawerTitle;
	private CharSequence mTitle;
	private CustomDrawerAdapter adapter;
	private int IMAGE_ARRAY[] = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8};
	private int currentImageIndex = 0;
	private ImageView imageSlider;
	private List<DrawerItem> dataList;	
	private TextView countdownTimer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);
		imageSlider = (ImageView)findViewById(R.id.backgroundSlider);
		countdownTimer = (TextView)findViewById(R.id.countdownTimer);
		dataList = new ArrayList<DrawerItem>();
		mTitle = mDrawerTitle = getTitle();
		getSupportActionBar().setTitle(mTitle);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.left_drawer);

		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,	GravityCompat.START);

		dataList.add(new DrawerItem("Events", R.drawable.ic_action_event));
		dataList.add(new DrawerItem("Schedule", R.drawable.ic_action_assignment));		
		dataList.add(new DrawerItem("Star Attractions", R.drawable.ic_star));
		dataList.add(new DrawerItem("Sponsors", R.drawable.ic_icon_sponsor));

		//dataList.add(new DrawerItem("Register", R.drawable.ic_action_action_subject));
		dataList.add(new DrawerItem("Gallery", R.drawable.ic_gallery_icon));
		dataList.add(new DrawerItem("About Us", R.drawable.ic_action_info));
		dataList.add(new DrawerItem("Feedback/Contact", R.drawable.ic_feedback));
		dataList.add(new DrawerItem("Event Partner", R.drawable.ic_mi));
		dataList.add(new DrawerItem("Share", R.drawable.ic_social_share));
		dataList.add(new DrawerItem("Rate Our App",	R.drawable.ic_toggle_star));
		dataList.add(new DrawerItem("Map", R.drawable.ic_maps_place));		


		adapter = new CustomDrawerAdapter(this, R.layout.drawerlistitemlayout,
				dataList);

		mDrawerList.setAdapter(adapter);

		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);



		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {

			public void onDrawerClosed(View view) {
				getSupportActionBar().setTitle(mTitle);
				supportInvalidateOptionsMenu(); // creates call to
				// onPrepareOptionsMenu()
			}

			public void onDrawerOpened(View drawerView) {
				getSupportActionBar().setTitle(mDrawerTitle);
				supportInvalidateOptionsMenu(); // creates call to
				// onPrepareOptionsMenu()
			}
		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);

		if (savedInstanceState == null) {

			/*if (dataList.get(0).isSpinner()
					& dataList.get(1).getTitle() != null) {
				//	SelectItem(2);
			} else */
			if (dataList.get(0).getTitle() != null) {
				SelectItem(1);
			} else {
				//SelectItem(0);
			}
		}
		FestCountdownTimer timer = new FestCountdownTimer(00, 00, 0, 30, 0, 2015);

		new CountDownTimer(timer.getIntervalMillis(), 1000) 
		{

			@Override
			public void onTick(long millisUntilFinished) {
				int days = (int) ((millisUntilFinished / 1000) / 86400);
				int hours = (int) (((millisUntilFinished / 1000)
						- (days * 86400)) / 3600);
				int minutes = (int) (((millisUntilFinished / 1000)
						- (days * 86400) - (hours * 3600)) / 60);
				int seconds = (int) ((millisUntilFinished / 1000) % 60);

				String countdown = String.format("%02dD %02dH %02dM %02dS", days,
						hours, minutes, seconds);
				countdownTimer.setText(countdown);
			}

			@Override
			public void onFinish() {
				//countdownBegins.setVisibility(View.GONE);
				countdownTimer.setText("The Fun Begins...!");
			}
		}.start();
		animateAndSlideShow();
	}



	//both functions below to handle configuration change and to see if drawer was opened/closed in a particular orientation
	//so save that state

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getSupportActionBar().setTitle(mTitle);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggle
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	//for click listener on drawer icon on left top to enable toggle on/off

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// toggle nav drawer on selecting action bar app icon/title

		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		/*if(item.getItemId()==R.id.addNewItem){

			Intent intent = new Intent(HomeScreen.this, PostAnAd.class);
			startActivity(intent);
			return true;
		}*/

		else 
			return false;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.home_screen, menu);
		return true;
	}

	public void SelectItem(int position) {

		switch (position) {		

		case 0:
			Intent intent1 = new Intent(HomeScreen.this, Events.class);
			startActivity(intent1);
			break;
		case 1:
			Intent intent = new Intent(HomeScreen.this, Schedule.class);
			startActivity(intent);
			break;
		case 2:
			Intent intent11 = new Intent(HomeScreen.this, StarAttractions.class);
			startActivity(intent11);
			break;
		case 3:
			Intent intent3 = new Intent(HomeScreen.this, Sponsors.class);
			startActivity(intent3);
			break;
		case 4:
			Intent intent4 = new Intent(HomeScreen.this, Gallery.class);
			startActivity(intent4);
			break;

		case 5:
			Intent intent5 = new Intent(HomeScreen.this, AboutUs.class);
			startActivity(intent5);
			break;

		case 6:
			Intent intent6 = new Intent(HomeScreen.this, FeedbackContact.class);
			startActivity(intent6);
			break;
		case 7:
			final Intent intent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mileageindia.com/"));
			startActivity(intent10);
			break;

		case 8:
			try
			{ Intent i = new Intent(Intent.ACTION_SEND);  
			i.setType("text/plain");
			Context context = this;
			i.putExtra(Intent.EXTRA_SUBJECT, "TAARANGANA IGDTUW Cultural Fest");
			String sAux = "\nIGDTUW proudly presents its most eagerly awaited cultural fest-TAARANGANA " +
					"which will leave everybody spellbound. Download this app from the link below:\n";
			sAux = sAux + "https://play.google.com/store/apps/details?id="+ context.getPackageName()+"\n\n";
			i.putExtra(Intent.EXTRA_TEXT, sAux);  
			// startActivity(Intent.createChooser(i, "Complete Action Using"));
			startActivity(i);

			}
			catch(Exception e)
			{ 
			}   
			break;

		case 9:
			Context context= this;
			Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
			Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
			try {
				startActivity(goToMarket);

			} catch (ActivityNotFoundException e) {
				startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));

			}
			break;
		case 10:
			final Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/place/Indira+Gandhi+Delhi+Technical+University+for+Women/@28.664656,77.232674,17z/data=!3m1!4b1!4m2!3m1!1s0x390cfd042531da9f:0x9cfbe9a24efb6694"));
			startActivity(intent9);
			break;		

		}

		mDrawerLayout.closeDrawer(mDrawerList);
	}
	private class DrawerItemClickListener implements
	ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			if (dataList.get(position).getTitle() == null) {
				SelectItem(position);
			}
		}
	}
	@Override
	public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {


	}

	@Override
	public void surfaceCreated(SurfaceHolder arg0) {


	}

	@Override
	public void surfaceDestroyed(SurfaceHolder arg0) {


	}

	final Animation.AnimationListener animationListener = new Animation.AnimationListener() {
		@Override
		public void onAnimationStart(final Animation animation) {
			// nothing to do here
		}

		@Override
		public void onAnimationEnd(final Animation animation) {
			// launch showing of next image on the end of the animation
			animateAndSlideShow();
		}

		@Override
		public void onAnimationRepeat(final Animation animation) {
			// nothing to do here
		}
	};

	private void animateAndSlideShow() {

		imageSlider.setBackgroundResource(IMAGE_ARRAY[currentImageIndex % IMAGE_ARRAY.length]);
		currentImageIndex++;
		final AnimationSet animationSet = new AnimationSet(true);
		final Animation fadeOutAnimation = new AlphaAnimation(1.0f, 0.0f);
		final Animation fadeInAnimation = new AlphaAnimation(0.0f, 1.0f);

		animationSet.addAnimation(fadeInAnimation);
		animationSet.addAnimation(fadeOutAnimation);
		fadeInAnimation.setDuration(400);
		fadeInAnimation.setStartOffset(0);
		fadeOutAnimation.setDuration(400);
		fadeOutAnimation.setStartOffset(4000);

		animationSet.setAnimationListener(animationListener);
		imageSlider.startAnimation(animationSet);
	}
}