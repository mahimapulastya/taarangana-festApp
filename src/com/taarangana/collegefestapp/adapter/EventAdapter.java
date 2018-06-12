package com.taarangana.collegefestapp.adapter;

import com.taarangana.collegefestapp.fragments.EventDay1Fragment;
import com.taarangana.collegefestapp.fragments.EventDay2Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class EventAdapter extends FragmentStatePagerAdapter 
{

	public EventAdapter(FragmentManager fm) 
	{
		super(fm);
	}

	@Override
	public Fragment getItem(int i)
	{
		 switch (i) {
	        case 0:
	            //Fragement for events of day 1
	            return new EventDay1Fragment();
	        case 1:
	           //Fragment for events of day2
	            return new EventDay2Fragment();
	        
	        }
	    return null;
	}

	@Override
	public int getCount() {
		return 2;
	}
}