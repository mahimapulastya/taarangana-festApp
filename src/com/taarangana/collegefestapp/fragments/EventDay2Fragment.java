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
import com.taarangana.collegefestapp.R;
import com.taarangana.collegefestapp.EventDescription;
import com.taarangana.collegefestapp.utils.AppConstants;
import com.taarangana.collegefestapp.vo.EventVO;

public class EventDay2Fragment extends Fragment
{
	private GridView  gridView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View event_day2 = inflater.inflate(R.layout.activity_event, container, false);
		gridView=(GridView)event_day2.findViewById(R.id.gridEvent);

		List<EventVO> eventList =new LinkedList<EventVO>();

		EventVO e1=new EventVO();
		e1.setName("Paintball");
		e1.setDescription("With an agitated mind, as you hunt your target down, the smirk on your face will stay. Keep yourself safe and shoot out the opponents. With a little pain and a little laugh, come and be a part of"+
				" this very popular fun event. When Concentration will pay, you shall stay.\n" +
				"\nDate: 30th and 31st January 2015\nTime: 11:00 AM onwards\nVenue: Funzone/Basketball Court");
		e1.setRules("No rules as such");//write
		e1.setIconID(R.drawable.ic_paintball);
		e1.setContact("Day1:\nMrigya Jain: +91-9871917624\nDay2:\nAstha Singh: +91-9868786981");
		e1.setUrl("");

		EventVO e2=new EventVO();
		e2.setName("Kissa Kursi Kaa");
		e2.setDescription("Remember old days where the highlight of the party was musical chairs? Nostalgic, eh? Never mind, we are giving the opportunity to relive the moments again. So here is the musical chairs Version 2.0," + 
				" with exciting twist and curvy turns, so that you get ready for super-duper fun! Are you ready to get on the chair, baby?\n" +
				"\nDate: 30th and 31st January 2015\nTime: 2:00-4:00 PM\nVenue: \nDay1: Behind Parking Lot\nDay2: Ground"); 
		e2.setRules("1. There shall be no use of hands, arms or shoulders to forcefully obtain a chair, save a chair, or force another player out of a chair.\n " +
				"2. Respect and sportsmanship are expected from all players.\n3. Touching chairs while music is playing is forbidden.\n" + 
				"4. Chairs are not to be moved from their original positions.\n5. The first occupant of a chair in a given round is the rightful occupant of that chair. If two players share a chair an official will determine the majority owner of the chair."+
				"\n6. You must follow the line when the music is playing, no passing, or cutting in line.\n7. In the event that a chair breaks, and cannot safely seat a player, it is no longer a valid chair in the game.\n\nRegistration Fees:\n20/- per head");
		e2.setIconID(R.drawable.ic_musicalchairs);
		e2.setContact("Day1:\nSakshi Garg: +91-9560726305\nDay2:\nRitu Sirohi: +91-9999942153");
		e2.setUrl("");

		EventVO e3=new EventVO();
		e3.setName("Minute to Win it");
		e3.setDescription("A fest stays incomplete without you all giving a shot at these amusing games. Win or lose. You're gonna walk out smiling.\n" +
				"\nDate: 30th and 31st January 2015\nTime: 11:00 AM onwards\nVenue: Funzone");
		e3.setRules("1. Tasks assigned to the participants are to be completed in 1 minute. Whoever does it in the allotted time wins.\n2. The tasks are to be completed in 1 minute. No further time will be provided. Only 1 try will be provided per game. No testing allowed.\n3. The decision of the organizers will be final and binding.");
		e3.setIconID(R.drawable.ic_minute_to_win_it);
		e3.setContact("Day1:\nEkta: +91-8860744140\nDay2:\nJyoti Bakshi: +91-8447722562");
		e3.setUrl("");

		EventVO e4=new EventVO();
		e4.setName("Luck By Chance");
		e4.setDescription("I've found that luck is quite predictable. If you want more luck, take more chances, Be more active, Show up more often. And when you thought you are losing, the tables suddenly turned and you won. Come and become lucky. Let the cards and numbers be in your favour. Experience the joy and fun in the game that is as unpredictable as the predictability itself.\n" +
				"\nDate: 30th and 31st January 2015\nTime: 11:00 AM onwards\nVenue: Funzone");
		e4.setRules("No rules as such");//write
		e4.setIconID(R.drawable.ic_luck);
		e4.setContact("Day1:\nEkta: +91-8860744140\nDay2:\nJyoti Bakshi: +91-8447722562");
		e4.setUrl("");

		EventVO e5=new EventVO();
		e5.setName("Blind Dating");
		e5.setDescription("Well, Is it really a blind date if you have already stalked them on google or facebook? With this concept gaining popularity in reality shows and ofcourse we have dedicated websites for them, Did you ever thought of becoming a part of it on ground?\nWith the opportunity to meet and befriend people from different spheres of life, we introduce to you- The Blind Dating. Who knows perhaps, you may find your soul mate on the row. So, come, participate and have awesome fun in this popular event.\n"+
				"\nDate: 30th and 31st January 2015\nTime: 2:00-3:00 PM\nVenue: GCR and (Funzone or GCR tree)");
		e5.setRules("1. Strictly abide by the time limits.\n2. Any kind of misbehavior with fellow contestant or the hosts will lead to disqualification from the game.\n3. There will be three rounds:\n(i) Round 1: Find your partner\n(ii) Round 2: Know your partner better\n(iii) Round 3: Check you compatibility");
		e5.setIconID(R.drawable.ic_blinddate);
		e5.setContact("Shriya Gambhir: +91-9990817719\nParinita Aggarwal: +91-9899916044");
		e5.setUrl("");

		EventVO e7=new EventVO();
		e7.setName("Just In Jest");
		e7.setDescription("Hola humorous humans! This is your chance to come up to the stage and generously let them all share your laughter. Delight the people, by showing them the world from your eyes, witty people.\n" +
				"\nDate: 30th January 2015\nTime: 2:00-3:30 PM\nVenue: Funzone");
		e7.setRules("1. No profanity or vulgar activities.\n2. Props will be provided for the prior performance.\n3. Acts will be PENALIZED if time is exceeded. ");
		e7.setIconID(R.drawable.ic_justinjest);
		e7.setContact("Anjali Kain: +91-8527106208");
		e7.setUrl("");

		EventVO e6=new EventVO();
		e6.setName("Eat to Beat");
		e6.setDescription("Some eat to live, some live to eat.\n"+"Foodie to the core? Appetite of an elephant?\n"+
				"This is the competition, cooked in heaven, served hot with prizes, for you.\n" +
				"\nDate: 30th January 2015\nTime: 1:00-2:00 PM\nVenue: Beside Food Stalls");
		e6.setRules("1. This is an individual event.\n2. Time limit should be followed.\n3. All participants must positively carry their original college identity cards on the day of the event.\n" + 
				"4. There will be three rounds.\n5. Decision of event coordinators will be final and binding.");
		e6.setIconID(R.drawable.ic_eattobeat);
		e6.setContact("Varnali Dutta: +91-9810375382\nManisha Sharma: +91-9958747334");
		e6.setUrl("");

		EventVO e8=new EventVO();
		e8.setName("Get It If You Can");
		e8.setDescription("‘An artist will rob, beg, borrow or steal from anybody and everybody to get the work’ – William Faulkner\n"+
				"There is no denying in the fact that being able to beg, borrow and steal effectively is a professional virtue. So, Gear up to face the reality, take up the challenge and beat the fellow teams to become the"+
				" masters. Experience the time running and your mind thrilling in this amazing fun event.\n" +
				"\nDate: 30th January 2015\nTime: 3:00-4:30 PM\nVenue: GCR tree");
		e8.setRules("1. A team will comprise of 2 players.\n2. All the teams will be provided with a list of items.\n3. Team members will have to complete the task within a time limit of a specific round.\n4. Team can either beg, borrow or steal the items that are enlisted and provided to them."+
				"\n5. Any team found purchasing any enlisted item will be disqualified at that moment only.\n6. After the completion of the task the teams are required to report to the coordinators for evaluation.\n7. Teams will be judged on first come, first serve basis and also the items they were able to collect.\n8. There are three rounds in this event and in case of a tie we had a tie-breaker round.");
		e8.setIconID(R.drawable.ic_begborrowsteal);
		e8.setContact("Swati Jain: +91-8860535877");
		e8.setUrl("");

		EventVO e16=new EventVO();
		e16.setName("DancingShoes.com");
		e16.setDescription("For all you people, who are always the life of parties!\nSteal the show with those jigs and moves that you have for every song. Dance and beats run in your veins and you know this one's for you!\n" +
				"\nDate: 30th January 2015\nTime: 12:30-2:00 PM\nVenue: Funzone");
		e16.setRules("1. It will be conducted on first come first serve basis.\n2. There will be three rounds and a tie breaker round in case it is needed.\n3. Props and all material will be provided by us.\n4. Decision of judges will be final and binding");
		e16.setIconID(R.drawable.ic_dancingshoes);
		e16.setContact("Ria Katoch: +91-9582954903");
		e16.setUrl("");

		/*EventIO e10=new EventIO();
		e10.setName("Remix");
		e10.setDescription("The ability to perceive conveyed emotions and expressions is said to develop early in childhood and Bollywood movies have excess"+
				" of them. So everyone come and express yourself to your partner and let them guess the names of movies, songs, dialogues etc. conveyed by you."+
				" Let’s see how musically compatible you are." +
				"\nDate:23 jan 2015\nTime:2 Pm onwards\nVenue:ground");
		e10.setIconID(R.drawable.ic_img_crop);
		e10.setContact("Nikita Mohan:+919891067574\nEmail ID: nikitamohan07@gmail.com");
		e10.setUrl("");*/

		EventVO e11=new EventVO();
		e11.setName("Inked In a Blink");
		e11.setDescription("Do you doodle the most catchy designs? Well, here's your chance to show your favourite pastime to the world. Draw a design on skin and brag your swag!\n" +
				"\nDate: 30th January 2015\nTime: 2:30-4:00 PM\nVenue: GCR tree or outside Funzone");
		e11.setRules("1. A team will comprise of 2 players.\n2. There will be three rounds:\n(i) Round 1: One person paints/makes tattoo on the hands/arms/face etc. of the other person of their teams. Time given to each team is 15 minutes. Half of the registered teams get selectedfor the next round."+
				"\n(ii) Round 2: Tattoos are made according to the theme given. Time Limit is 20 minutes. Quality tattoos are to be made.\n(iii) Round 3: Participants have to persuade non participants of the event to get tattooed within a time period of 12 minutes. They will be given a specific pattern to draw. The person to pursue maximum number of people to get tattooed wins."+ 
				"\n3. Tie Breaker Round shall be introduced in case of a tie.\n4. Tattoos with plain dots etc. will not be judged.\n5. Stencils cannot be used.\n6. The tattoos will not be evaluated beyond the given duration.\n7. Sketch pens, painting kits will be provided to the participants team-wise.\n8. Themes for tattoos will be allotted on the spot.");
		e11.setIconID(R.drawable.ic_inked);
		e11.setContact("Gursift Kaur: +91-9999337565");
		e11.setUrl("");

		EventVO e12=new EventVO();
		e12.setName("Mute Point");
		e12.setDescription("Can you express without saying anything? Are your expressions good enough to convey the meaning? Are you a pro at acting? Then mime is back! Show us your skills and make the audience enraptured.\n"+
				"\nDate: 31st January 2015\nTime: 12:00-2:00 PM\nVenue: Funzone");
		e12.setRules("1. Only 1 entry per college.\n2. There will be two rounds:\n(i) Round 1: Mono acting any dialogue which will be decided via chits.\n(ii) Round 2: Based on a scenario given on the spot, like: Gone fishing, Robbing a bank, Visit to a dentist, Baking a cake/cooking, Racing competition\n"+
				"Tie Breaker Round shall be introduced in case of a tie.\n3. The situation would be written on a chit and the participant has to pick one chit and perform the situation.\n4. Only instrumental music is allowed and the act should not contain any dialogues or lip sync."+
				"\n5. Team will be disqualified if act contains any offensive, disrespectful actions or gestures.\n6. General rules of mime will be followed.\n7. Negative points for exceeding time limit.\n7. Props not allowed.\n8. Each participant would be given 2 to 5 min to perform an act."+
				"\n9. Decision of the judges will be final and binding.");
		e12.setIconID(R.drawable.ic_mute_point);
		e12.setContact("Priyanka Sharma: +91-8826335447");
		e12.setUrl("");

		EventVO e13=new EventVO();
		e13.setName("Karaoke");
		e13.setDescription("The new hype in town-KARAOKE. The king of all entertainments is here. Whether you are loud, whether you are soft, your voice quality ain’t really a matter of concern. Have the ultimate gala"+
				" time, singing and swaying to the music. So come, Bang the confidence on, Feel like a star and create memories.\n" +
				"\nDate: 31st January 2015\nTime: 11-12 and 2-3 PM\nVenue: Funzone");
		e13.setRules("No rules as such");//write
		e13.setIconID(R.drawable.ic_karaoke);
		e13.setContact("Parul Rawat: +91-8285242370");
		e13.setUrl("");


		EventVO e14=new EventVO();
		e14.setName("Khojo Toh Jaane");
		e14.setDescription("The treasure is buried. The map is ready. The clues are in hand. What are you waiting for? Apply your head, follow the omens, build your boat and sail"+
				" off the shore! Be quick and claim the treasure before other pirates reach there. So come, Bring out the hidden Jack Sparrow in you and win this game of treasure hunt." +
				"\n\nDate: 31st January 2015\nTime: 2:00-3:30 PM\nVenue: GCR tree");
		e14.setRules("1. You should reach every location in not more than 10 minutes.\n2. Without handing over the first clue, u won't be granted the next clue.\n3. You have to accomplish a given task provided at every location, in order to, get the clue."+
				"\n4. You are not supposed to surf the Internet.\n5 You are required to participate in a team of four.");
		e14.setIconID(R.drawable.ic_treasure_hunt);
		e14.setContact("Puja Gupta: +91-7838390455\nParul: +91-8285242370");
		e14.setUrl("");


		EventVO e15=new EventVO();
		e15.setName("Pictionary");
		e15.setDescription("Here is the perfect combination of dumbcharades and drawing. Can you draw and make your partner guess the word? It doesn't matter how sketchy your drawing is! Show us the understanding"+
				" between you and your partner and win goodies!\n"+
				"\nDate: 31st January 2015\nTime: 3:00-4:00 PM\nVenue: Funzone");
		e15.setRules("1. Maximum of 2 people shall be allowed to participate per team.\n2. The event will basically consist of 3 rounds.\n3. Time limit is 2-3 minutes for each team. Negative points for exceeding the time.\n4. One member will be given a word/phrase by lottery.\n5. The guesser will guess the word/phrase from what his/her teammate draws on a sheet of paper provided."+
				"\n6. The team member who is drawing is not allowed to speak\n7. The drawing must not have letters, numbers or Greek symbols.\n8. Do not use spaces to determine how many letters are in the word.\n9. Do not use sign language and hand gestures.\n10. This is a timed game. The teams will be judged according to the time that they take in guessing the correct exact word.");
		e15.setIconID(R.drawable.ic_pictionary);
		e15.setContact("Priyanka Sharma: +91-8826335447");
		e15.setUrl("");

		EventVO e20=new EventVO();
		e20.setName("Happy Feet");
		e20.setDescription("Let's groove to the beat! But friends, on a piece of paper. Your stage folds to half, with every change in song. How long can you stay on it? Last one remaining wins goodies.\n" +
				"\nDate: 31st January 2015\nTime: 1:00-2:00 PM\nVenue: GCR tree");
		e20.setRules("1. Each team consists of 2 persons.\n2. If any of the team members stumbles or steps out of the newspaper, the team will be out of the game.\n3. The teams will be noticed not only " + 
				"after the music stops but also during the dance.\n4. Newspapers will be folded and other elements will be added.\n5. In case of a tie, a surprise round will be conducted and after that the winner"+
				" will be decided.\n6. The last team standing on the paper will be declared the winner.\n7. Registration will be on the first come first serve basis.");
		e20.setIconID(R.drawable.ic_happyfeet);
		e20.setContact("Tanmeet Kaur: +91-9873751900");
		e20.setUrl("");

		EventVO e17=new EventVO();
		e17.setName("Colours Unbound");
		e17.setDescription("Let's paint the walls red! It's time to sneak out the inner artist in you. Draw caricatures and designs with spray cans and show us your artistry!\n" +
				"\nDate: 31st January 2015\nTime: 1:00-3:00 PM\nVenue: Whole Campus (to be decided)");
		e17.setRules("1. The theme for the graffiti will be provided on the spot.\n2. All the materials required will be provided by the college.\n3. Use of any external material is not allowed.\n4. Participants will be given 1.5 hrs for the completion.\n4. The judging criteria will be based on creativity, skill and proper application of theme.\n5. The registrations will take place on the day of the event.");
		e17.setIconID(R.drawable.ic_graffiti);
		e17.setContact("Ritu Sirohi: +91-9999942153");
		e17.setUrl("");

		EventVO e9=new EventVO();
		e9.setName("Masti with Geet");
		e9.setDescription("Consider yourself a bollywood buff? Think you know all the Eminem raps? Are you a pro at humming tunes and recognising them too? If yes, then come prove yourself! Masti with Geet at Taarangana offers you the perfect stage to justify your claim.\n" +
				"\nDate: 31st January 2015\nTime: 3:00-4:00 PM\nVenue: Funzone");
		e9.setRules("1. Registration prior to the event is necessary.\n2. Teams of not more than 3 people allowed.\n3. The competition will be held in four slots throughout the day, each slot being 45 minutes.\n4. There will be a break of an hour between two slots during which willing participants can register.\n" + 
				"5. This event will have four rounds:\n(i) Round 1 - Participants will have to guess the Hindi songs translated into English (or vice versa). Maximum 30 seconds will be given to do the same.\n(ii) Round 2 - Teams will have to determine the missing lyrics of the given edited version of a song. Time limit : 30 seconds\n" + 
				"(iii) Round 3 - Ascertain the artists/music directors of the song and give another song by the same artist/music director. Time limit : 50 seconds.\n6. Use of Internet is strictly prohibited.\n7. Vulgarity in any form is not permitted in the competition.");
		e9.setIconID(R.drawable.ic_mastiwithgeet);
		e9.setContact("Astha Singh: +91-9868786981");
		e9.setUrl("");		

		EventVO e19=new EventVO();
		e19.setName("LAN Gaming");
		e19.setDescription("Bring out the inner gamer and indulge in a virtual combat to gain power. Yes, LAN gaming is back! Let's see if your reflexes are fast enough to survive the game and win it.\n"+
				"\nDate: 30th and 31st January 2015\nTime: 11:00 AM onwards\nVenue: Computer Centre");
		e19.setRules("1. 1st round will be knife round.\n2. For the knife round, map will be 1_hp. The winner of the knife round picks the side they want to play first (CT or T).\n3. Matches will be played 5 on 5.\n4. The map list for the tournament is:\n• De_dust2\n• De_inferno\n• Cs_office\n• De_korfez\n"+
				"5. Automatic snipers (D3/Au-1, Krieg-550), tactical shield and smoke grenades are strictly not allowed.\n6. General rules settings:\n• Starting Money: $16,000\n• Spectate is OFF, fadetoblock is ON\n• Map Time: 3 minutes\n• C4 Timer: 45 seconds\n• Freeze Time: 5 seconds\n• Buy Time: 30 seconds\n• Friendly Fire: OFF"+
				"\n7. Team messages are allowed.\n8. If disconnection occurs during a match then scores till the last round will continue and starting money will be decided by the organizers.\n9. Playing with fewer than 5 players in any match is permitted with captain’s agreement."+
				"\n10. Use of particular console commands will be informed by the organizers on the day of tournament.\n11. Players may bring their own mouse pads & headphones. Mouse and Keyboards are strictly not allowed.");
		e19.setIconID(R.drawable.ic_langaming);
		e19.setContact("Jyoti Bakshi: +91-8447722562\nTanmeet Kaur: +91-9873751900\nMohini: +91-8860993898");
		e19.setUrl("");

		EventVO e18=new EventVO();
		e18.setName("Shades of Music");
		e18.setDescription("Paint Your Imagination…. Let the Music flow On The Sheet. \nForms of art can only be separated for so long. Then you paint to songs and sing to paintings. Deliver the beauty of that melody to a sheet of paper. Make us see what the music made you feel.\nTeam: 2-3 members\n"+
				"\nDate: 30th January 2015\nTime: 12:00-2:00 PM\nVenue: GCR");
		e18.setRules("1. Only one member will draw in a round, team members can only share ideas and theme.\n2. No usage of language, characters or words.\n"+
				"3. Use of mobile phone will not be allowed.\n4. Only 2 A4 size sheets per round, 2 pencils, 2 brushes, 1 color set per team will be given.\nJudging Criteria:\n"+ 
				"(i) How imaginative team can present the song.\n(ii) Thought/theme behind the painting/sketch.\n(iii) And the painting itself (Neatness, clarity, coloring, painting/sketching skills).");
		e18.setIconID(R.drawable.ic_shadesofmusic);
		e18.setContact("Nikita Mohan: +91-9891067574");
		e18.setUrl("");
		eventList.add(e1);	eventList.add(e2);	eventList.add(e3);
		eventList.add(e4);	eventList.add(e5);	eventList.add(e6);
		eventList.add(e7);	eventList.add(e8);	eventList.add(e9);
		eventList.add(e11);	eventList.add(e12);
		eventList.add(e13);	eventList.add(e14);	eventList.add(e15);
		eventList.add(e16);	eventList.add(e17);	eventList.add(e18);
		eventList.add(e19);eventList.add(e20);

		Context cont;
		cont = getActivity();
		MyGridAdapter adapterObject = new MyGridAdapter(cont, eventList);
		gridView.setAdapter(adapterObject);

		return event_day2;

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
