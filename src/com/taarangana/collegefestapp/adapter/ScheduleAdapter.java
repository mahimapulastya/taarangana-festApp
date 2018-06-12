package com.taarangana.collegefestapp.adapter;

import com.taarangana.collegefestapp.fragments.ScheduleDay1Fragment;
import com.taarangana.collegefestapp.fragments.ScheduleDay2Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
public class ScheduleAdapter extends FragmentStatePagerAdapter {
	public ScheduleAdapter(FragmentManager fm) 
	{
		super(fm);
	}
	@Override
	public Fragment getItem(int i) {
		switch (i) {
		case 0:
			return new ScheduleDay1Fragment();
		case 1:
			return new ScheduleDay2Fragment();
		}
		return null;
	}
	@Override
	public int getCount() {
		return 2; //No of Tabs
	}
}