package com.taarangana.collegefestapp.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.taarangana.collegefestapp.R;

public class ContactFragment extends Fragment
{
	public ListView contact_list;	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View contact = inflater.inflate(R.layout.activity_contact, container, false);
		contact_list = (ListView) contact.findViewById(R.id.contact_list);
				String contact_names[] = {"Mansi Tripathi","Amitoj Kaur Chawla","Akanksha Sain", "Rivina","Kritika Khurana",
				"Shipra Chandra","Pratishtha Gupta","Nitya Khanna",
				"Rashmeet Kaur", "Maitreyi Gupta","Shagoon Nayyar",
				"Utkrete Srivastava"};
		String contact_position[] = {" Website & App Head","Creative, Website & App Head", "Sponsorship Head", "Publicity Head", "Publicity Head",
				"Sponsorship & Content Head","Event Management Head","Event Management Head",
				"Sponsorship Head","HR Head","HR & Media Head","HR Head"};
		String contact_number[] = {"9873700919","9560127770","7838878584","9873938834","9811229445","8745956961","7838697016","9212220990",
				"8586910731","7530808096","8860370601","9953595004"};
		Integer contact_photo[] ={R.drawable.ic_mansi,R.drawable.ic_amitoj,R.drawable.ic_akanksha,R.drawable.ic_rivina,R.drawable.ic_kritika,
				R.drawable.ic_shipra,R.drawable.ic_pratishtha,
				R.drawable.ic_nitya,R.drawable.ic_rashmeet,R.drawable.ic_maitreyi,
				R.drawable.ic_shagoon,R.drawable.ic_utkrete};
		Context cont;
		cont = getActivity();
		MyListAdapter adapterObject = new MyListAdapter(cont, contact_names, contact_position,contact_number,contact_photo);
		contact_list.setAdapter(adapterObject);		
		return contact;
	}

	private class MyListAdapter extends BaseAdapter
	{
		private String team_name[];
		private String team_position[];
		private String team_contact[];
		private Integer team_photo[];
		private Context context;
		private LayoutInflater inflater;

		public MyListAdapter(Context context, String contact_names[],String contact_position[],String contact_number[], Integer contact_photo[] )
		{
			this.context = context;
			this.team_name = contact_names;
			this.team_position = contact_position;
			this.team_contact = contact_number;
			this.team_photo = contact_photo;
			inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return team_name.length;
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
			contact_list.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1, int position,
						long arg3) {

					Uri number = Uri.parse("tel: " +team_contact[position]);
					Intent dial = new Intent(Intent.ACTION_DIAL,number);
					startActivity(dial);

				}
			});			
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
