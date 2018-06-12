package com.taarangana.collegefestapp.adapter;

import com.taarangana.collegefestapp.fragments.DJNightFragment;
import com.taarangana.collegefestapp.fragments.HardySandhuFragment;
import com.taarangana.collegefestapp.fragments.SwagGangFragment;
import com.taarangana.collegefestapp.fragments.TurkushBandFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class StarAttractionAdapter extends FragmentStatePagerAdapter
{

	public StarAttractionAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int i)
	{
		switch (i) 
		{
		case 0:
			return new HardySandhuFragment();
		case 1:
			return new DJNightFragment() ;			
		case 2:
			return new TurkushBandFragment();
		case 3:
			return new SwagGangFragment();
		}

		return null;
	}

	@Override
	public int getCount() 
	{
		// TODO Auto-generated method stub
		return 4;
	}


}
