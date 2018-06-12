package com.taarangana.collegefestapp.fragments;

import java.util.LinkedList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.taarangana.collegefestapp.R;
import com.taarangana.collegefestapp.vo.ScheduleVO;

public class ScheduleDay2Fragment extends Fragment
{
	private ListView scheduleList;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View schedule2 = inflater.inflate(R.layout.schedule_frag, container, false);
		//setContentView(R.layout.activity_main);
		scheduleList=(ListView) schedule2.findViewById(R.id.scheduleList);
		List<ScheduleVO> list=new LinkedList<ScheduleVO>();

		ScheduleVO s1=new ScheduleVO();
		s1.setStartTime("10:00 AM");
		s1.setEndTime("6:00 PM");
		s1.setEventName("Aaghaaz");
		s1.setVenue("Badminton Court");

		ScheduleVO s2=new ScheduleVO();
		s2.setStartTime("10:30 AM");
		s2.setEndTime("1:00 PM");
		s2.setEventName("Rangrezz");
		s2.setVenue("Ground Main Stage");

		ScheduleVO s3=new ScheduleVO();
		s3.setStartTime("11:00 AM");
		s3.setEndTime("");
		s3.setEventName("Lan Gaming");
		s3.setVenue("Computer Centre");

		ScheduleVO s4=new ScheduleVO();
		s4.setStartTime("11:00 AM");
		s4.setEndTime("");
		s4.setEventName("Paintball");
		s4.setVenue("Funzone/Basketball Court");

		ScheduleVO s5=new ScheduleVO();
		s5.setStartTime("11:00 AM");
		s5.setEndTime("");
		s5.setEventName("Luck By Chance");
		s5.setVenue("Funzone");

		ScheduleVO s6=new ScheduleVO();
		s6.setStartTime("11:00 AM");
		s6.setEndTime("12:00 PM");
		s6.setEventName("Karaoke");
		s6.setVenue("Funzone");

		ScheduleVO s7=new ScheduleVO();
		s7.setStartTime("11:00 AM");
		s7.setEndTime("");
		s7.setEventName("Minute to Win it");
		s7.setVenue("Funzone");

		ScheduleVO s8=new ScheduleVO();
		s8.setStartTime("12:00 PM");
		s8.setEndTime("2:00 PM");
		s8.setEventName("Mr and Ms Taarangana");
		s8.setVenue("Auditorium");

		ScheduleVO s9=new ScheduleVO();
		s9.setStartTime("12:00 PM");
		s9.setEndTime("1:00 PM");
		s9.setEventName("Out and About");
		s9.setVenue("Admin Block");

		ScheduleVO s10=new ScheduleVO();
		s10.setStartTime("12:00 PM");
		s10.setEndTime("2:00 PM");
		s10.setEventName("Mute Point");
		s10.setVenue("Funzone");

		ScheduleVO s11=new ScheduleVO();
		s11.setStartTime("1:00 PM");
		s11.setEndTime("3:00 PM");
		s11.setEventName("Colours Unbound");
		s11.setVenue("Whole Campus");

		ScheduleVO s12=new ScheduleVO();
		s12.setStartTime("1:00 PM");
		s12.setEndTime("2:00 PM");
		s12.setEventName("Happy Feet");
		s12.setVenue("GCR tree");
		
		ScheduleVO s21=new ScheduleVO();
		s21.setStartTime("1:00 PM");
		s21.setEndTime("5:00 PM");
		s21.setEventName("The Knights of the Fall");
		s21.setVenue("Ground Main Stage");

		ScheduleVO s13=new ScheduleVO();
		s13.setStartTime("2:00 PM");
		s13.setEndTime("3:00 PM");
		s13.setEventName("Karaoke");
		s13.setVenue("Funzone");

		ScheduleVO s14=new ScheduleVO();
		s14.setStartTime("2:00 PM");
		s14.setEndTime("3:00 PM");
		s14.setEventName("Blind Dating");
		s14.setVenue("GCR and GCR tree/Funzone");

		ScheduleVO s15=new ScheduleVO();
		s15.setStartTime("2:00 PM");
		s15.setEndTime("3:30 PM");
		s15.setEventName("Khojo Toh Jaane");
		s15.setVenue("GCR tree");

		ScheduleVO s16=new ScheduleVO();
		s16.setStartTime("2:00 PM");
		s16.setEndTime("4:00 PM");
		s16.setEventName("Kissa Kursi Kaa");
		s16.setVenue("Ground");

		ScheduleVO s17=new ScheduleVO();
		s17.setStartTime("2:30 PM");
		s17.setEndTime("4:30 PM");
		s17.setEventName("Nautanki Unplugged");
		s17.setVenue("Auditorium");

		ScheduleVO s18=new ScheduleVO();
		s18.setStartTime("3:00 PM");
		s18.setEndTime("4:00 PM");
		s18.setEventName("Masti With Geet");
		s18.setVenue("Funzone");

		ScheduleVO s19=new ScheduleVO();
		s19.setStartTime("3:00 PM");
		s19.setEndTime("4:00 PM");
		s19.setEventName("Pictionary");
		s19.setVenue("Funzone");

		ScheduleVO s20=new ScheduleVO();
		s20.setStartTime("5:00 PM");
		s20.setEndTime("8:00 PM");
		s20.setEventName("Star Night");
		s20.setVenue("Ground Main Stage");		

		list.add(s1);	list.add(s2);	list.add(s3);	list.add(s4);
		list.add(s5);	list.add(s6);	list.add(s7);	list.add(s8);
		list.add(s9);	list.add(s10);	list.add(s11);	list.add(s12);	list.add(s21);
		list.add(s13);	list.add(s14);	list.add(s15);	list.add(s16);
		list.add(s17);	list.add(s18);	list.add(s19);	list.add(s20);

		Context cont;
		cont=getActivity();
		MyListAdapter adapterobject = new MyListAdapter(cont, list);
		scheduleList.setAdapter(adapterobject);
		return schedule2;
	}
	private class MyListAdapter extends BaseAdapter{

		private Context context;
		private List<ScheduleVO> list;
		private LayoutInflater inflator;

		public MyListAdapter(Context context,List<ScheduleVO> list){
			this.context=context;
			this.list=list;
			inflator = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}

		@Override
		public int getCount() {
			return list.size();
		}

		@Override
		public Object getItem(int arg0) {
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			return 0;
		}

		@Override
		public View getView(int pos, View convertView, ViewGroup viewGroup) {
			Holder holder = new Holder();
			if(convertView==null){		
				convertView=inflator.inflate(R.layout.listitemlayout,null);
				holder.startTime=(TextView)convertView.findViewById(R.id.startTime);
				holder.endTime=(TextView)convertView.findViewById(R.id.endTime);
				holder.eventName=(TextView)convertView.findViewById(R.id.eventName);
				holder.venue=(TextView)convertView.findViewById(R.id.venue);
				convertView.setTag(holder);			
			}
			else{
				holder =(Holder)convertView.getTag();	//getting heading & subheading as its saved in views...			
			}
			holder.startTime.setText(list.get(pos).getStartTime());
			holder.endTime.setText(list.get(pos).getEndTime());
			holder.eventName.setText(list.get(pos).getEventName());
			holder.venue.setText(list.get(pos).getVenue());

			return convertView;
		}
	}
	static class Holder{
		private TextView startTime,endTime,eventName,venue;
	}
}
