package com.taarangana.collegefestapp.fragments;

import com.taarangana.collegefestapp.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutUsPage1Fragment extends Fragment 
{
	private TextView taarangana,igdtuw;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View aboutUs = inflater.inflate(R.layout.activity_about_us_page1, container, false);

		taarangana = (TextView) aboutUs.findViewById(R.id.about_tv);
		igdtuw= (TextView) aboutUs.findViewById(R.id.aboutCollege_tv);

		taarangana.setText("Indira Gandhi Delhi Technical University for Women (IGDTUW) proudly presents its most eagerly awaited cultural fest-TAARANGANA." +
							" Taarangana, is the cultural fest of the only" + 
							" Women Technical University of India. Taarangana aka 'taaron ka aangan' which is Hindi for 'trail of stars'" + 
							" represents the joyous and sparkling days of fests. The cultural fest over two days hosts a wide array of enthusiastic" + 
							" students who indulge in myriad activities to display and dabble with their creativity. The fest is an exquisite" +
							" exposure of technical minds to their latent artistic skills. We burns the candles from both the ends trying to" +
							" extract the hidden talents from students. Multitudes of students swarm to participate and interact over interesting" +
							" cultural events and some great food at IGDTUW, every January. We had the privilege of associating with some of the" +
							" biggest names in India and IGDTUW hopes to live up to their expectations again!!!");
		
			igdtuw.setText("IGDTUW is the first engineering university for women in Delhi, India which " +
				"came into existence in 1998 with an objective to promote technical education among female students in the " +
				"country. IGDTUW has a historical campus situated at the heritage building of Kashmere Gate which was built in " +
				"1938. The campus was housed by Department Of Chemical and Textile Technology (now IIT, Delhi at Hauz Khas), " +
				"DCE (now DTU, Rohini), DIT (now NSIT, Dwarka) and GGSIPU (now at Dwarka). Now IGDTUW is continuing it's rich legacy " +
				"with full enthusiasm and perfection. Taarangana is the annual cultural fest of IGDTUW held in January over two days." +
				" There is much more lined up for you to make sure you have a blast and never forget Taarangana.");
		return aboutUs;
	}
}
