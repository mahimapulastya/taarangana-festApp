package com.taarangana.collegefestapp;

import com.nineoldandroids.animation.AnimatorSet;
import com.nineoldandroids.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashScreen extends Activity{

	private ImageView logoImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);

		logoImage = (ImageView)findViewById(R.id.logo);
		logoImage.setClickable(false);
		/*Animator anim = AnimatorInflater.loadAnimator(this, R.animator.flipvertical);
		anim.setTarget(logoImage);
		anim.start();*/
		AnimatorSet set = new AnimatorSet();
		set.playTogether(

				ObjectAnimator.ofFloat(logoImage, "rotationY", 0, 360)

				);
		set.setDuration(2*1000).start();
	}


	@Override
	public void onResume() 
	{
		super.onResume();
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() 
		{
			public void run() 
			{
				Intent intent = new Intent(SplashScreen.this,HomeScreen.class);
				startActivity(intent);
				finish();
			}}, 3000);  
	}
}