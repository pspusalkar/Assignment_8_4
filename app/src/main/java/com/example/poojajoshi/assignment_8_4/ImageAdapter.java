package com.example.poojajoshi.assignment_8_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class ImageAdapter extends BaseAdapter {
    private Context context;
    // private static LayoutInflater inflater=null;

    public ImageAdapter(Context c) {
        context = c;
    }

    public int getCount() {
        return mImageIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new grid for each item
    public View getView(int position, View view, ViewGroup viewG) {
        View grid;
        LayoutInflater inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null) {
            grid = new View(context);
            grid = inflater.inflate(R.layout.grid_col, null);

            TextView textView = (TextView) grid.findViewById(R.id.textView);
            ImageView imageView = (ImageView)grid.findViewById(R.id.imageView);

            textView.setText(mTitleIds[position]);
            imageView.setImageResource(mImageIds[position]);
        } else {
            grid = (View) view;
        }

        return grid;
    }

    // images
    private Integer[] mImageIds = {
            R.drawable.gingerbread, R.drawable.honeycomb,
            R.drawable.icecream, R.drawable.jelleybean,
            R.drawable.kitkat, R.drawable.lollipop
    };

    // title
    private String[] mTitleIds = {
            "GinberBread", "HoneyComb",
            "IceCream", "JellyBean",
            "Kitkat", "Lollipop",
    };
}