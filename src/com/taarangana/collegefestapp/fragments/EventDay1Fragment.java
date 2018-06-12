package com.taarangana.collegefestapp.fragments;

import java.util.LinkedList;
import java.util.List;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import com.taarangana.collegefestapp.EventDescription;
import com.taarangana.collegefestapp.R;
import com.taarangana.collegefestapp.utils.AppConstants;
import com.taarangana.collegefestapp.vo.EventVO;

public class EventDay1Fragment extends Fragment
{
	private GridView  gridView;


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		View event_day1 = inflater.inflate(R.layout.activity_event, container, false);
		gridView=(GridView)event_day1.findViewById(R.id.gridEvent);

		List<EventVO> eventList =new LinkedList<EventVO>();

		EventVO e1=new EventVO();
		e1.setName("Lilac Dreams");
		e1.setDescription("FASHION - the word that posseses extraordinary potential to make anyone go mad about it. Our way to talk, walk, think, dress,"+
				" etc depends on the present trend of fashion. Moreover,fashion can change one's perspective towards anything and everything.Would you like to be"+
				" a part of an event that would not only provide pleasure to your eyes..but also make you feel the special essence of entering a world of fashion..?!" +
				"TAARANGNA presents before you -\n'Lilac Dreams - Fashion Parade'\nAn event that will definitely mesemerize you! So, don't miss the fun..! Its worth it...\n"
				+"\nDate: 30th January 2015\nTime: 3:00-6:00 PM\nVenue: Ground Main Stage");
		e1.setRules("1. Time limit: 8-12 minutes including the stage set up time.\n2. Only one entry per college is allowed. Each student in the team must be a registered student of that college. Maximum of 15 participants per team.\n3. Teams have to submit a video of their previous performance for short-listing purpose at lilacdreams.taarangana@gmail.com"+
				"\n4. Theme based write-up should be submitted at the time of registration at lilacdreams.taarangana@gmail.com\n5. Participants will be judged on : theme, apparels, coordination, theme portrayal, X-factor. Emphasis will be given to clothing, portrayal and originality."+
				"\n6. Only 1 backstage helper allowed.\n7. Props are allowed. No hazardous props are allowed. Lighting of candles, matches or cigarettes on stage is not allowed and will result in disqualification.\n8. The teams are responsible for their own music & sequence."+
				"\n9. Music is to be submitted in CD/Pen drive in a format compatible with Windows media player (preferably in mp3 format), must contain all the music with properly named files and folders. The teams are expected to label the CD’s/pen drive properly also name"+
				" the music files according to the sequence to avoid confusion. All CDs/pen drives must be submitted to the organizers at least an hour before to the start of the competition.\n10. One team member should be present near the computer to help the organizers in playing the music smoothly."+
				"\n11. Lighting facility is to be availed. One person of the group can supervise else it will be up to the lights group.\n12. The teams will have to clear the stage with the help of organizers immediately after their performance.\n13. Vulgarity in any form will not be allowed in the competition.");
		e1.setIconID(R.drawable.ic_lilac);
		e1.setContact("Ria Katoch: +91-9582954903\nEmail ID: katochria3@gmail.com");
		e1.setUrl("http://taarangana.com/#!register3.html");

		EventVO e2=new EventVO();
		e2.setName("Anhad");
		e2.setDescription("Do you believe you can be the next big singing sensation? Break away from your shower solos and showcase your talent by a solo"+
				" or duet performance to take people's breaths away and win exciting prizes and certificates. If your heart yearns to express the harmonies within,"+
				" dont miss this chance to mesmerize the audience with your voice and rock the stage. This will be the place where all music enthusiasts"+
				" make magic this January.\n"+"\nDate: 30th January 2015\nTime: 12:00-2:00 PM\nVenue: Auditorium");
		e2.setRules("1. Maximum 3 participants per college are allowed.\n2. Entries close with 25 people.\n3. There will be two rounds:\n(i) Elimination round: Participants are expected to come with a prepared sequence.\nTime Limit : 1 minutes 30 seconds\nParticipants are allowed one instrument along with them."+
				"10 people will be selected for the next round.\n(ii) Final round: A Karaoke will be played.\nTime limit: 2 minutes\nPreparation time of 10 minutes will be given.\n4. Marks will be deducted for people who exceed the time limit.\n5. Participants have to bring their own instruments." +
				"\n\nNote:\nIn case of excess registrations, participants who have registered on our website will be given preference over participants registering on the spot.\n\nRegistration Fee:\nINR 30 for solo\nINR 50 for duet\nThe registration fee is to be paid on the day of the event."+
				"\n\nPeople who have registered will have to report 2 hours prior to the event. Participation will be first come first serve."); 
		e2.setIconID(R.drawable.ic_anhad);
		e2.setContact("Gursift Kaur: +91-9999337565\nEmail ID: gursiftkaur@gmail.com");
		e2.setUrl("Registrations have been closed");

		EventVO e3=new EventVO();
		e3.setName("Urban Thump");
		e3.setDescription("If dance isn't just a hobby for you but a party of your lifestyle. If dancing is your first love and you believe in the saying"+
				" Dance to express, not to impress!!!\n"+
				"Here's a chance to showcase your emotions through your art. Urban thump, western dance competition. So put on your dancing shoes and"+
				" get ready to win hearts. Because it's the place where you may win or lose but never get defeated..!!\n"+
				"\nDate: 30th January 2015\nTime: 11:00 AM- 2:00 PM\nVenue: Ground Main Stage");
		e3.setRules("1. Criteria for judgement includes appearance, dance, stage usage, prop utilization, music, energy, synchronization, expressions."+
				"\n2. Order of performances will be decided on the event day via a chit system in the presence of all group representatives.\n3. The performance must not exceed more than 10 + 2-3 (set up time). There exists a negative marking for exceeding the time limit.\n4. At least 5 and at most 14 participants can be present on the stage."+
				"\n5. Participants are required to bring in their songs in CD or pen-drive. Also to avoid technical disturbance, please carry an extra CD or backup of the song.\n6. Each student in the team (at most 20 members) must be a registered student of that college.\n7. Only one entry per college is allowed.\n8. Carry your own costumes, make-up, props, materials used in dance. Contestants need to inform about their props beforehand. Green room will be provided for changing purpose.");
		e3.setIconID(R.drawable.ic_urbanthump);
		e3.setContact("Nikita Mohan: +91-9891067574\nEmail ID: nikitamohan07@gmail.com");
		e3.setUrl("Registrations have been closed");

		EventVO e4=new EventVO();
		e4.setName("Synnove");
		e4.setDescription("For every rule, there is an exception. Watch youngsters fulfill this saying as they beat convention and come to rule your hearts" +
				" with freestyle dance performances. With every step and every beat promised to awe, you can't afford to miss this. We at Taarangana invite you"+
				" and your friends to feast your eyes on this spectacle. Interested dancers who wish to wow are invited to register themselves before it's too late.\n"+
				"\nDate: 30th January 2015\nTime: 2:30-4:30 PM\nVenue: Auditorium");
		e4.setRules("1. No costumes or props will be provided.\n2. There will be three rounds in the event:\n(i) FIRST ROUND : Participants can choose whichever song/forte they want to. They have to bring their music with them in CD/Pen Drive.\nTime limit: 1 to 1:30 minutes"+
				"\n(ii) SECOND ROUND (top 12 entries): Participants have to pick one of the three themes mentioned below and prepare a dance number on it. They are are required to come equipped with their choice of song. They have to bring the song with them in a CD/Pen Drive.\nTime limit : 1 to 1:30 minutes\n•Life of an artist\n•Lost love\n•Women Empowerment.\nParticipants for this round will be judged on choreography and execution."+
				"\n(iii) THIRD ROUND : This is a tie breaker round and will be declared on the spot.\n3. Each team participating in the event should have at least one CD and pen drive."+
				"\n4. Participants have to ensure that one copy of their edited song is with the event coordinator and one copy, as a backup, is present with them.\n5. It is the contestant's duty to be careful and aware of the order of performance.\n6. In case of any technical fault or confusion, judges result will be final.\n7. Order of performance will be decided on first come first basis."+
				"\n\nNote:\nIn case of excess registrations, participants who have registered on our website will be given preference over participants registering on the spot.\n\nRegistration Fee:\nINR 30 for solo\nINR 50 for duet\nThe registration fee is to be paid on the day of the event."+
				"\n\nPeople who have registered will have to report 2 hours prior to the event. Participation will be first come first serve.");
		e4.setIconID(R.drawable.ic_synnove);
		e4.setContact("Ritu Sirohi: +91-9999942153\nEmail ID: sirohi.ritu12@gmail.com");
		e4.setUrl("Registrations have been closed");

		/*EventIO e5=new EventIO();
		e5.setName("Inaugral");
		e5.setDescription("This is a great event.It is about abc.....There should be 3 members in a team.What else you need great coordination and support." +
				"\nDate:23 jan 2015\nTime:2 Pm onwards\nVenue:ground");
		e5.setIconID(R.drawable.ic_img_crop);
		e5.setContact("Tanmeet Kaur:+919873751900\nEmail ID: kaurtanmeet25@gmail.com");
		e5.setUrl("http://www.yahoo.com");*/

		EventVO e8=new EventVO();
		e8.setName("Aaghaaz");
		e8.setDescription("All the world's a stage, and all the men and women merely players quoth The Bard. Street theatre is undeniably the oldest form"+
				" of theatre and here's your chance to witness this beautiful art form in all its timeless glory when teams from different colleges spread all over"+
				" Delhi (or India?) would throng in the college grounds of IGDTUW to lock horns and prove their mettle.\n"+
				"\nDate: 31st January 2015\nTime: 10:00 AM-6:00 PM\nVenue: Badminton Court");
		e8.setRules("1. The time limit is 15-20 minutes. Exceeding this limit will result in negative marking.\n2. Only one entry per college is allowed.Each student in the team must be a registered student of that college. Minimum 10 and maximum 20 participants per team are allowed."+
				"\n3. Usage of bulky props is not permitted.\n4. There is no restriction on music instruments.\n5. Vulgarity will lead to immediate disqualification.\n6. Registration on"+
				" first come first serve basis, until the maximum no. of entries to be entertained is reached.\n7. Interested teams are required to mail a soft copy of their script as well as the synopsis to the undersigned.");
		e8.setIconID(R.drawable.ic_aaghaaz);
		e8.setContact("Ria Katoch: +91-9582954903\nEmail ID: aaghaaz.taarangana@gmail.com");
		e8.setUrl("Registrations have been closed");

		EventVO e7=new EventVO();
		e7.setName("Mr. & Ms. Taarangana");
		e7.setDescription("Do you have what it takes to be the first ever face of Taarangana? Dig out that million dollar click of yours. Or better yet, get another dazzling one"+
				" captured. Captivate the hearts of millions and be the much coveted fashionista of the year.\n" +
				"\nDate: 31st January 2015\nTime: 12:00-2:00 PM\nVenue: Auditorium");
		e7.setRules("1. 10 Boys+10 Girls which have been shortlisted from the prelims i.e. online round.\n2. There will be three rounds:\n(i) First Round: Ramp Walk\n(ii) Second Round: Talent Hunt\n(iii) Third Round: Questionnaire Round"+
				"\n3. For the Second Round, songs/music (if required) will have to be chosen from the available list.\n4. Marks will be deducted for participants violating the time limit.\n5. Vulgarity in any form will not be allowed in the first round.");
		e7.setIconID(R.drawable.ic_mrandmiss);
		e7.setContact("Shubhita Garg: +91-9818370891\nEmail ID: shubhita_g@yahoo.com");
		e7.setUrl("No registeration");

		EventVO e6=new EventVO();
		e6.setName("Nautanki Unplugged");
		e6.setDescription("Taarangana presents to you full on dance-drama-nautanki unplugged.\nBring out the jai, gabbar and rakhi sawant in you as we give you full licence to go crazy. Get a chance to do what you've never done before and go past all your frights.\nSo if you think you have it in you to monoact (or even if you dont :-P), just register yourself"+
				" for the event right away.\n"+"\nDate: 31st January 2015\nTime: 2:30-4:30 PM\nVenue: Auditorium");
		e6.setRules("1. This is an individual event.\n2. Language of the act can be English/Hindi.\n3. Microphones, lights and a laptop to play sounds will be provided.\n4. There will be two rounds.\n5. Each participant would be given 2 to 5 minute to perform an act of their own choice."+
				"\n6. A situation would be written on a chit and the participant have to pick one chit each and perform the situation.\n7. All clothes and accessories are to be arranged by the participants. The organizing committee is responsible only for the infrastructural facilities only and shall not be responsible for the security of items left behind in green rooms or stage."+
				"\n8. Participants are expected to bring their own music on CD or pen drive for the act.\n9. Recorded vocals are not allowed, only instrumental music is allowed.\n10. The participating teams are requested to ensure that their presentation is in keeping with the dignity of the festival."
				+"\n\nNote:\nIn case of excess registrations, participants who have registered on our website will be given preference over participants registering on the spot."+
				"\n\nRegistration Fee:\nINR 30\nThe registration fee is to be paid on the day of the event.");
		e6.setIconID(R.drawable.ic_nautanki);
		e6.setContact("Mohini Agarwal: +91-8860993898\nEmail ID: mohiniagarwal2105@gmail.com");
		e6.setUrl("http://taarangana.com/#!register4.html");

		EventVO e13=new EventVO();
		e13.setName("The Knights of the Fall");
		e13.setDescription("Get ready for some serious head banging! Because here's introducing 'Knights of the Fall'-the craziest, phenomenal, most mind-blowing Rock Fest in the city. Come and sway to music on the day when the biggest bands from all over Delhi battle it out for the grand title! Knights of the Fall brought the most amazing artists to Taarangana's stage last year. So"+
				" start tuning your instruments and warm up your voices because this year's tournament is almost here!\n"+"\nDate: 31st January 2015\nTime: 1:00-5:00 PM\nVenue: Ground Main Stage");
		e13.setRules("1. Only one entry per college is allowed.Each student in the team must be a registered student of that college.\n2. The last date for registration is 20th Jan, 2015.\n3. The short-listed bands shall be informed latest by 25th Jan, 2015."+
				"\n4. Each band will be given 25 minutes (including sound check) to perform. The competing bands should perform at least two OCs in the stipulated time limit.\n5. Performance slots will be allotted on the first come first serve basis on the day of event.\n6. The organizers shall provide lead guitar amplifier, bass guitar amplifier, standard 5 piece drum kit (single pedal base ), Corded mics. Any equipment required apart from these shall be arranged for by the competing band itself.");
		e13.setIconID(R.drawable.ic_bob);
		e13.setContact("Ekta: +91-8860744140\nEmail ID: ekta.yadav995@gmail.com");
		e13.setUrl("Registrations have been closed");

		/*EventVO e10=new EventVO();
		e10.setName("Star Night");
		e10.setDescription("Taarangana is where stars shine! Even the stars of our industry. Be prepared to be blown away by the exquisite music and mind throbbing fun because the star night is here!"+
				" Come prepared to experience a fantabulous future memory of your lifetime." +
				"\n\nDate: 31st January 2015\nTime: 5:00-8:00 PM\nVenue: Ground Main Stage");
		e10.setRules("No rules... Just dance and music and loads of fun."); 
		e10.setIconID(R.drawable.ic_starnight);
		e10.setContact("Ekta: +91-8860744140\nEmail ID: ekta.yadav995@gmail.com");
		e10.setUrl("No registeration");*/

		EventVO e9=new EventVO();
		e9.setName("Rangrezz");
		e9.setDescription("In a diverse world like ours, there are varied cultures and traditions. Each tradition gives rise to different folk dance. It is form of dance that portrays traditional life of a"+
				" country or region. It is usually associated with social activities, while some are performed competitively. Each form of folk dance follows specific attire,rhythm and steps which are passed through"+
				" generations rarely being changed. Since every festival is accompanied by celebration, folk dances have become an integral part of our social milieu."+
				"\n\nDate: 31st January 2015\nTime: 10:30 AM-1:00 PM\nVenue: Ground");
		e9.setRules("1. Only one entry per college is allowed.Each student in the team must be a registered student of that college.\n2. Participants can perform Folk dance of any Region or State. Western, bollywood songs are not allowed.\n3. Participants must bring their songs in a PD or CD. They can also bring with them any instruments which they may require."+
				"The organizing committee shall not provide any props/ costumes/instruments/accompanists will be provided.\n4. Time limit for the performance of each team is 10 minutes. After 10 minutes judges will be free to penalize the team.\n5. The performance time includes the time for stage set up. However, the electronic instrument should be installed well before the performance.\n6. Number of participants in a team must not exceed 15. This limit includes Instrumental Players and Singers.\n7. At least 8 dancers should be present on the stage in Folk Dance.\n" );
		e9.setIconID(R.drawable.ic_rangrezz);
		e9.setContact("Swati Jain: +91-8860535877\nEmail ID: jain.swati5093@gmail.com");
		e9.setUrl("http://taarangana.com/#!register6.html");

		EventVO e12=new EventVO();
		e12.setName("War of the Words");
		e12.setDescription("'I may be wrong and you may be right and, by an effort, we may get nearer the truth.'\nPerfectly quoted by Karl Popper, bringing out the essence of debate. It brings a sense of a shared journey toward the truth brings debaters closer together, even when they represent opposing sides of issue.\n"+
				"\nDate: 30th January 2015\nTime: 1:00-3:00 PM\nVenue: Admin Block");
		e12.setRules("1. The topic of the debate is:\n'This house believes that freedom is never voluntarily given by the oppressor, it must be demanded by the oppressed; that Men cannot be allies for the feminist movement.'"+
				"\n2. Pre registrations (online) as well as on the spot registrations will be done.\n3. Participation will be in teams of 2(one speaker FOR and the other AGAINST).\n4. Only three (3) teams per college will be allowed to participate in the event.\n5. Each participant will get to speak for 4(3+1) minutes. The time keeper will ring the bell at the completion of 3 minutes and again at 4 minutes. Anyone who speaks for longer than 4 minutes will incur a time penalty of 1 mark per 5 seconds till 4 minutes 20 seconds. A participant speaking beyond the time limit would risk disqualification."+
				"\n6. All participants will be open to One (1) question from other participants after they have finished speaking. Participants will get 30 seconds for asking, and speakers will get 1 minute for presenting their rebuttal.\n7. The speakers will be judged on their Content, Presentation, Organisation and Rebuttal.\n8. The decision of the Judges will be final and binding.\n\nNote:\nIn case of excess registrations, participants who have registered on our website will be given preference over participants registering on the spot."+
				"\n\nRegistration Fee:\nA nominal registration fee of Rs 50 per team is to be paid on the day of the event.");
		e12.setIconID(R.drawable.ic_war_of_the_words);
		e12.setContact("Aditi Singh: +91-8447134608\nNavneet Mann: +91-9971660256");
		e12.setUrl("Registrations have been closed");

		EventVO e11=new EventVO();
		e11.setName("Out and About");
		e11.setDescription("Can you convince people and lead them to a conclusion?  Do you have a mind effused with ideas and are able to articulate them properly? Then here is the chance to speak them out!"
				+"\n\nDate: 31st January 2015\nTime: 12:00-1:00 PM\nVenue: Admin Block");
		e11.setRules("1. There will be on the spot as well as on-line registrations.\n2. The topic for the GD will be given on the when the event starts. After the topic has been announced, all the participants will be given a preparation time of 15 minutes to organise their thoughts and ideas on the given topic. At the end of allotted the 15 minutes, the discussion shall begin." +
				"\n3. The Judging Criteria for the Group Discussion will be as follows:\nLeadership skills: Ability to initiate the group discussion; to be able to guide the group especially when the discussion begins losing relevance; to try to encourage all members to participate in the discussion.\nCommunication skills: Clarity of thought, expression and aptness of language.\nInterpersonal skills: Ability of the individual to interact with other members of the group in a brief situation.\nPersuasive skills: Ability to analyse and persuade others to see the problem from multiple perspectives"+
				" without hurting the group members.\n4. Any participant using offensive and defamatory content during the discussion will be disqualified.\n\nNote:\nIn case of excess registrations, participants who have registered on our website will be given preference over participants registering on the spot.\n\nRegistration Fee:\nA nominal registration fee of Rs 30 per person is to be paid on the day of the event.");
		e11.setIconID(R.drawable.ic_outandabout);
		e11.setContact("Malvika: +91-9560453580\nAparna: +91-9953454922");
		e11.setUrl("http://taarangana.com/#!register5.html");


		eventList.add(e1);	eventList.add(e2);	eventList.add(e3);
		eventList.add(e4);	eventList.add(e6);
		eventList.add(e7);	eventList.add(e8);	eventList.add(e9);
		//eventList.add(e10);
		eventList.add(e11);	eventList.add(e12);
		eventList.add(e13);

		Context cont;
		cont = getActivity();
		MyGridAdapter adapterObject = new MyGridAdapter(cont, eventList);
		gridView.setAdapter(adapterObject);

		return event_day1;

	}


	private class MyGridAdapter extends BaseAdapter{

		private Context ctxt;
		private List<EventVO> list;
		private LayoutInflater inflater;

		public MyGridAdapter(Context context , List<EventVO>newlist){
			this.ctxt=context;
			this.list=newlist;
			inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(final int pos, View convertView, ViewGroup viewGroup) {
			Holder holder =new Holder();
			if(convertView==null){
				convertView=inflater.inflate(R.layout.griditemlayout, null);
				holder.button=(Button)convertView.findViewById(R.id.gridIcon);
				convertView.setTag(holder);
			}
			else{
				holder=(Holder)convertView.getTag();
			}
			holder.button.setText(list.get(pos).getName());
			Drawable img=this.ctxt.getResources().getDrawable(list.get(pos).getIconID());
			holder.button.setCompoundDrawablesWithIntrinsicBounds(null,img,null, null);

			holder.button.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View arg0) {

					Intent intent =new Intent(getActivity().getApplicationContext(),EventDescription.class);
					intent.putExtra(AppConstants.NAME_KEY,list.get(pos).getName() );
					intent.putExtra(AppConstants.DESCRIPTION_KEY, list.get(pos).getDescription());
					intent.putExtra(AppConstants.RULES_KEY, list.get(pos).getRules());
					intent.putExtra(AppConstants.ICON_ID,list.get(pos).getIconID());
					intent.putExtra(AppConstants.CONTACT_KEY, list.get(pos).getContact());
					intent.putExtra(AppConstants.URL, list.get(pos).getUrl());
					startActivity(intent);

				}
			});

			return convertView;
		}
	}
	static class Holder{
		private Button button;
	}
}