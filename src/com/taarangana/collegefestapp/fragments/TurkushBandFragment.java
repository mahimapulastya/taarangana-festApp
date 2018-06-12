package com.taarangana.collegefestapp.fragments;

import com.taarangana.collegefestapp.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class TurkushBandFragment extends Fragment
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

		name.setText("Turkush Band");
		description.setText("Music is the one thing that has the power to unite millions of people. So if you have music" + 
				" in your soul, then IGDTU has a treat for you. Gear up to enjoy an amazing performance by the multi - genre band Turkush." +
				" As a perfect opening to our star night, Turkush promises you all a fantastic concert with songs that would make"+
				" your feet tap and your hearts sing. Get ready to have a wondrous evening, only at Taarangana'15!."+
				"\n\nDate: 31st January 2015\nVenue: Ground Main Stage\nPerformance after The Knights of the Fall event.");
		image.setImageResource(R.drawable.turkush);
		return star;
	}

}
