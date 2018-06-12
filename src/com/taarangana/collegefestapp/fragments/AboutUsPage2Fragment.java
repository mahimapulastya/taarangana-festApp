package com.taarangana.collegefestapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.taarangana.collegefestapp.R;

public class AboutUsPage2Fragment extends Fragment 
{
	public ListView contact_list;

	@Override

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View developers = inflater.inflate(R.layout.activity_about_us__page2, container, false);
		contact_list = (ListView) developers.findViewById(R.id.contact_list);
		String contact_names[] = {"Aarushi Gupta", "Komal Thakur", "Mahima Pulastya","Shaifali Gupta"};	
		Integer contact_photo[] ={R.drawable.ic_aarushi,R.drawable.komal,R.drawable.ic_mahima, R.drawable.ic_shaifali};
		String contact_position[] = {" Developer","Developer","Developer","Developer"};

		Context cont;
		cont = getActivity();
		MyListAdapter adapterObject = new MyListAdapter(cont, contact_names,contact_photo,contact_position);
		contact_list.setAdapter(adapterObject);

		return developers;
	}

	private class MyListAdapter extends BaseAdapter
	{
		private String team_name[];
		private String team_position[];
		private Integer team_photo[];
		private Context context;
		private LayoutInflater inflater;

		public MyListAdapter(Context context, String contact_names[],Integer contact_photo[],String contact_position[] )
		{
			this.context = context;
			this.team_name = contact_names;
			this.team_photo = contact_photo;
			this.team_position=contact_position;
			inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}
		@Override
		public int getCount() {
			return team_name.length;
		}

		@Override
		public Object getItem(int arg0) {
			return null;
		}

		@Override
		public View getView(final int position, View convertView, ViewGroup parent) 
		{
			final Holder holder;
			if(convertView==null)
			{
				holder = new Holder();
				convertView = inflater.inflate(R.layout.contact_list_layout, null);
				holder.nameV = (TextView) convertView.findViewById(R.id.name_of_member_tv);
				holder.positionV = (TextView) convertView.findViewById(R.id.position_of_member_tv);
				holder.photoV = (ImageView) convertView.findViewById(R.id.contact_photo_iv);
				convertView.setTag(holder);
			}
			else
			{
				holder = (Holder) convertView.getTag();
			}
			holder.nameV.setText(this.team_name[position]);
			holder.positionV.setText(this.team_position[position]);
			holder.photoV.setImageResource(team_photo[position]);		

			return convertView;
		}
		@Override
		public long getItemId(int position) {
			return 0;
		}
	}
	static class Holder
	{
		TextView nameV,positionV;
		ImageView photoV;
	}
}