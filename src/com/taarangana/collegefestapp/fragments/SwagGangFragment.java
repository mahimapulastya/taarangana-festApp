package com.taarangana.collegefestapp.fragments;

import com.taarangana.collegefestapp.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SwagGangFragment extends Fragment
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

		name.setText("Swag Gang");
		description.setText("Get ready to have the most amazing experience of your life. The Swag Gang is here to give you all"+
				" a treat. Here is your chance to see some amazing hip hop and street dance. So beef up your swag and enjoy this"+
				" performance by the official hip hop crew of Delhi Dance Academy!"+
				"\n\nDate: 30th January 2015\nVenue: Ground Main Stage\nPerformance after Urban Thump event.");
		image.setImageResource(R.drawable.swag_gang);
		return star;
	}

}
