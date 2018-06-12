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
public class ScheduleDay1Fragment extends Fragment {
	private ListView scheduleList;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		View schedule1 = inflater.inflate(R.layout.schedule_frag, container, false);
		//setContentView(R.layout.activity_main);
		scheduleList=(ListView) schedule1.findViewById(R.id.scheduleList);
		List<ScheduleVO> list=new LinkedList<ScheduleVO>();

		ScheduleVO s1=new ScheduleVO();
		s1.setStartTime("10:00 AM");
		s1.setEndTime("11:00 AM");
		s1.setEventName("Inaugural");
		s1.setVenue("Auditorium");

		ScheduleVO s2=new ScheduleVO();
		s2.setStartTime("11:00 AM");
		s2.setEndTime("2:00 PM");
		s2.setEventName("Urban Thump");
		s2.setVenue("Ground Main Stage");

		ScheduleVO s3=new ScheduleVO();
		s3.setStartTime("11:00 AM");
		s3.setEndTime("");
		s3.setEventName("Minute to win it");
		s3.setVenue("Funzone");

		ScheduleVO s4=new ScheduleVO();
		s4.setStartTime("11:00 AM");
		s4.setEndTime("");
		s4.setEventName("Luck By Chance");
		s4.setVenue("Funzone");

		ScheduleVO s5=new ScheduleVO();
		s5.setStartTime("11:00 AM");
		s5.setEndTime("");
		s5.setEventName("Paintball");
		s5.setVenue("Funzone/Basketball Court");

		ScheduleVO s6=new ScheduleVO();
		s6.setStartTime("11:00 AM");
		s6.setEndTime("");
		s6.setEventName("Lan Gaming");
		s6.setVenue("Computer Centre");

		ScheduleVO s7=new ScheduleVO();
		s7.setStartTime("12:00 PM");
		s7.setEndTime("2:00 PM");
		s7.setEventName("Anhad");
		s7.setVenue("Auditorium");

		ScheduleVO s8=new ScheduleVO();
		s8.setStartTime("12:00 PM");
		s8.setEndTime("2:00 PM");
		s8.setEventName("Shades of Music");
		s8.setVenue("GCR");

		ScheduleVO s9=new ScheduleVO();
		s9.setStartTime("12:30 PM");
		s9.setEndTime("2:00 PM");
		s9.setEventName("DancingShoes.com");
		s9.setVenue("Funzone");

		ScheduleVO s10=new ScheduleVO();
		s10.setStartTime("1:00 PM");
		s10.setEndTime("3:00 PM");
		s10.setEventName("War of the Words");
		s10.setVenue("Admin Block");

		ScheduleVO s11=new ScheduleVO();
		s11.setStartTime("1:00 PM");
		s11.setEndTime("2:00 PM");
		s11.setEventName("Eat to Beat");
		s11.setVenue("Beside Food Stalls");

		ScheduleVO s12=new ScheduleVO();
		s12.setStartTime("2:00 PM");
		s12.setEndTime("3:30 PM");
		s12.setEventName("Just in Jest");
		s12.setVenue("Funzone");

		ScheduleVO s13=new ScheduleVO();
		s13.setStartTime("2:00 PM");
		s13.setEndTime("3:00 PM");
		s13.setEventName("Blind Dating");
		s13.setVenue("GCR and GCR tree/Funzone");

		ScheduleVO s14=new ScheduleVO();
		s14.setStartTime("2:00 PM");
		s14.setEndTime("4:00 PM");
		s14.setEventName("Kissa Kursi Kaa");
		s14.setVenue("Behind Parking Lot");

		ScheduleVO s15=new ScheduleVO();
		s15.setStartTime("2:30 PM");
		s15.setEndTime("4:30 PM");
		s15.setEventName("Synnove");
		s15.setVenue("Auditorium");

		ScheduleVO s16=new ScheduleVO();
		s16.setStartTime("2:30 PM");
		s16.setEndTime("4:00 PM");
		s16.setEventName("Inked In a Blink");
		s16.setVenue("GCR tree or Outside Funzone");

		ScheduleVO s17=new ScheduleVO();
		s17.setStartTime("3:00 PM");
		s17.setEndTime("6:00 PM");
		s17.setEventName("Lilac Dreams");
		s17.setVenue("Ground Main Stage");

		ScheduleVO s18=new ScheduleVO();
		s18.setStartTime("3:00 PM");
		s18.setEndTime("4:30 PM");
		s18.setEventName("Get It If You Can");
		s18.setVenue("GCR tree");

		ScheduleVO s19=new ScheduleVO();
		s19.setStartTime("6:00 PM");
		s19.setEndTime("8:00 PM");
		s19.setEventName("DJ");
		s19.setVenue("Ground Main Stage");		

		list.add(s1);	list.add(s2);	list.add(s3);	list.add(s4);
		list.add(s5);	list.add(s6);	list.add(s7);	list.add(s8);
		list.add(s9);	list.add(s10);	list.add(s11);	list.add(s12);
		list.add(s13);	list.add(s14);	list.add(s15);	list.add(s16);
		list.add(s17);	list.add(s18);	list.add(s19);

		Context cont;
		cont=getActivity();
		MyListAdapter adapterobject = new MyListAdapter(cont, list);
		scheduleList.setAdapter(adapterobject);         
		return schedule1;
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
