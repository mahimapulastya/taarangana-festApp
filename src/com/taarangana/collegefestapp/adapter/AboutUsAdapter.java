package com.taarangana.collegefestapp.adapter;

import com.taarangana.collegefestapp.fragments.AboutUsPage1Fragment;
import com.taarangana.collegefestapp.fragments.AboutUsPage2Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class AboutUsAdapter extends FragmentStatePagerAdapter
{

	public AboutUsAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int i)
	{
		switch (i) {
        case 0:
            //Fragement for events of day 1
            return new AboutUsPage1Fragment();
        case 1:
           //Fragment for events of day2
            return new AboutUsPage2Fragment();
        
        }
    return null;
	}

	@Override
	public int getCount() {
		return 2;
	}
}