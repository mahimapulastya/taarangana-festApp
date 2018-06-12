package com.taarangana.collegefestapp.vo;

import java.util.ArrayList;
import java.util.List;

public class GalleryVO {

	public static final List<Data> IMG_DESCRIPTIONS = new ArrayList<Data>();

	static {
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "1.jpg",
				"The best way to pay for a lovely moment is to enjoy it."));

		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "2.jpg",
				"When you are born with wings, why prefer crawl."));

		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "4.jpg",
				"One sees the stars in the darkest night."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "3.jpg",
				"Smile - the language everyone understands."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "5.jpg",
				"Life is a dance floor, God is the DJ, you are the music."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "10 (2).jpg",
				"Those who speak the least are the most expressive."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "7.jpg",
				"When the music hits you, you feel no pain."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "8.jpg",
				"Stars, I have seen them fall."
						+ " But when they drop and die, No star is lost at all."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "20.jpg",
				"As she dances , under the moonlit stars , She makes her own music as her heart beats in time."
						+" For now she is alone but not lonely. She loves to perform ,as her life is dance."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "11.jpg",
				"College is where my bunch of crazies are."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "10 (1).jpg",
				"For never a star goes down into infinite space. But another is born with the wonder of God on its face."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "18.jpg",
				"Music is what feelings sound like."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "19.jpg",
				"I don't go crazy. I am crazy. I just go normal from time to time."));

		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "12.jpg",
				"Memories last forever , Never do they die. True friends stick together and never say goodbye."));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "13.jpg",
				"I love the things that make me smile."));

		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "17.jpg",
				"Rule number one : It has to be fun ..!!"));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "15.jpg",
				"...coz the best is yet to be... "));
		GalleryVO.IMG_DESCRIPTIONS.add(new GalleryVO.Data( "16.jpg",
				"Stay happy ! Stay crazy!"));
	}

	public static final class Data {

		//    public final String title;
		public final String imageFilename;
		public final String description;

		private Data( String imageFilename, String description) {
			//this.title = title;
			this.imageFilename = imageFilename;
			this.description = description;
		}
	}
}
