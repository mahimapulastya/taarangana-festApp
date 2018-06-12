package com.taarangana.collegefestapp.adapter;

import com.taarangana.collegefestapp.fragments.ContactFragment;
import com.taarangana.collegefestapp.fragments.FeedbackFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FeedbackContactAdapter extends FragmentStatePagerAdapter
{
	public FeedbackContactAdapter(FragmentManager fm) {
		super(fm);
	}
	@Override
	public Fragment getItem(int i)
	{
		switch(i)
		{
		case 0: return new FeedbackFragment();

		case 1: return new ContactFragment() ;
		}

		return null;
	}

	@Override
	public int getCount() 
	{
		return 2;
	}
}
