package com.taarangana.collegefestapp.fragments;

import com.taarangana.collegefestapp.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DJNightFragment extends Fragment
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

		name.setText("DJ Night");
		description.setText("We don't really care if you are the baraati dancer or a trained ballet dancer. Taarangana'15 invites you all to join us on our DJ night."+
				" The music is going to be loud and you have full licence to go crazy."+
				" So cancel all your prior plans and make way for the DJ night hosted by us girls. Do come!"+
				"\n\nDate: 30th January 2015\nTime: 6:00-8:00PM\nVenue: Ground Main Stage");
		image.setImageResource(R.drawable.dj);
		return star;
	}
}
