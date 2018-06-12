package com.taarangana.collegefestapp.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.aphidmobile.utils.AphidLog;
import com.aphidmobile.utils.IO;
import com.aphidmobile.utils.UI;
import com.taarangana.collegefestapp.R;
import com.taarangana.collegefestapp.vo.GalleryVO;

import java.util.ArrayList;
import java.util.List;

public class GalleryAdapter extends BaseAdapter {

	private LayoutInflater inflater;
	private int repeatCount = 1;
	private List<GalleryVO.Data> galleryData;

	public GalleryAdapter(Context context) {
		inflater = LayoutInflater.from(context);
		galleryData = new ArrayList<GalleryVO.Data>(GalleryVO.IMG_DESCRIPTIONS);
	}

	@Override
	public int getCount() {
		return galleryData.size() * repeatCount;
	}

	public int getRepeatCount() {
		return repeatCount;
	}

	public void setRepeatCount(int repeatCount) {
		this.repeatCount = repeatCount;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View layout = convertView;
		if (convertView == null) {
			layout = inflater.inflate(R.layout.gallery, null);
			AphidLog.d("created new view from adapter: %d", position);
		}

		final GalleryVO.Data data = galleryData.get(position % galleryData.size());

		
		UI
		.<ImageView>findViewById(layout, R.id.photo)
		.setImageBitmap(IO.readBitmap(inflater.getContext().getAssets(), data.imageFilename));

		UI
		.<TextView>findViewById(layout, R.id.description)
		.setText(Html.fromHtml(data.description));

		return layout;
	}

	public void removeData(int index) {
		if (galleryData.size() > 1) {
			galleryData.remove(index);
		}
	}
}
