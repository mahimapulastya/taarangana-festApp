package com.taarangana.collegefestapp.fragments;

import com.taarangana.collegefestapp.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HardySandhuFragment extends Fragment
{
	private TextView description,name;
	private ImageView image;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View star = inflater.inflate(R.layout.activity_star, container, false);

		description= (TextView) star.findViewById(R.id.eventDescription_tv);
		name = (TextView) star.findViewById(R.id.eventName_tv);
		image = (ImageView) star.findViewById(R.id.eventImage_iv);

		name.setText("Hardy Sandhu");
		description.setText("Wrapping up the cultural fest with a red bow in style, we at Taarangana proudly present the"+
				" Star  Night on the 31st of January which would be powered by sublime performance by Hardy Sandhu (who has popular "+
				"hits such as Soch and Joker under his belt) and a wondrous appearance by the band Turkush. So make sure to" + 
				" encircle the date on your respective calendars and don't miss the event!"+
				"\n\nDate: 31st January 2015\nTime: 5:00-8:00 PM\nVenue: Ground Main Stage");

		image.setImageResource(R.drawable.star);
		return star;
	}
}
