package com.taarangana.collegefestapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Sponsors extends ActionBarActivity {

	private ListView  listView;
	//TextView postpone;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sponsors);
		
		ActionBar bar = getSupportActionBar();
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		bar.setDisplayShowTitleEnabled(true);
		bar.setDisplayShowHomeEnabled(true);
		
		listView=(ListView)findViewById(R.id.sponsorsList);
		String description[] = {"", "", "","","Associate partner","Online Shopping Partner"};	
		Integer sponsors_photo[] ={R.drawable.un_women,R.drawable.heforshe_logo,R.drawable.aten_food, R.drawable.random_captures,R.drawable.line,R.drawable.ebay};
		
		
		MyListAdapter adapterObject = new MyListAdapter(this, sponsors_photo, description);
		listView.setAdapter(adapterObject);
		
		 
	}


	private class MyListAdapter extends BaseAdapter{

		private Context ctxt;
		private String desc[];
		private Integer pic[];
		private LayoutInflater inflater;

		

		public MyListAdapter(Context context,Integer[] sponsors_photo,
				String[] description) {
			
			this.ctxt = context;
			this.desc = description ;
			this.pic = sponsors_photo;
			inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			// TODO Auto-generated constructor stub
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return desc.length;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public View getView(final int position, View convertView, ViewGroup parent) 
		{
			final Holder holder;
			if(convertView==null)
			{
				holder = new Holder();
				convertView = inflater.inflate(R.layout.sponsorgriditemlayout, null);
				holder.descV = (TextView) convertView.findViewById(R.id.sponsorsDetails);
				holder.photoV = (ImageView) convertView.findViewById(R.id.gridImage);
				convertView.setTag(holder);
			}
			else
			{
				holder = (Holder) convertView.getTag();
			}
			holder.descV.setText(this.desc[position]);
			
			holder.photoV.setImageResource(pic[position]);		

			return convertView;
		}
		@Override
		public long getItemId(int position) {
			return 0;
		}
	}
	static class Holder{
		TextView descV;
		ImageView photoV;
	}
}