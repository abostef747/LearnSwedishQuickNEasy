package com.weebly.mustafamk.learnswedishquickneasy;


import android.content.Context;
import android.graphics.Color;
import android.speech.tts.TextToSpeech;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {

    TextToSpeech ttsobject;
    private Context context;


    public Integer[] images = {
            R.drawable.car, R.drawable.bicycle, R.drawable.house,
            R.drawable.man, R.drawable.woman, R.drawable.tree,
            R.drawable.paper, R.drawable.pencil, R.drawable.sweets
    };

    public CustomAdapter(Context c) {
        context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageButton imageButton = new ImageButton(context);
        imageButton.setImageResource(images[position]);
        imageButton.setScaleType(ImageButton.ScaleType.CENTER_CROP);
        imageButton.setLayoutParams(new GridView.LayoutParams(500, 500));
        imageButton.setId(position);

        return imageButton;
    }

}
