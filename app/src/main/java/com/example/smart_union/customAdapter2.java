package com.example.smart_union;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter2 extends BaseAdapter {

    private final Activity activity;

    private final String[] title;
    private final String[] det;
    private final String[] year;

    public customAdapter2(Activity activity, String[] title, String[] det, String[] year) {
        this.activity = activity;
        this.title = title;
        this.det = det;
        this.year = year;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater=activity.getLayoutInflater();

        View rowview=inflater.inflate(R.layout.customlayout1,null,true);

        TextView txt=rowview.findViewById(R.id.t1);
        TextView details=rowview.findViewById(R.id.t2);
        TextView yr=rowview.findViewById(R.id.t3);

        txt.setText(title[position]);
        details.setText(det[position]);
        yr.setText(year[position]);

        return  rowview;

    }
}
