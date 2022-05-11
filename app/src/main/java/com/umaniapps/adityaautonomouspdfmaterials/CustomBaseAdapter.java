package com.umaniapps.adityaautonomouspdfmaterials;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String[] listFruit,fruitlist2;
    int[] listImages;
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx,String[] fruitlist,String[] fruitlist2,int [] images){
        this.context=ctx;
        this.listFruit=fruitlist;
        this.fruitlist2=fruitlist2;
        this.listImages=images;
        inflater=LayoutInflater.from(ctx);

    }


    @Override
    public int getCount() {
        return listFruit.length;
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

        convertView =inflater.inflate(R.layout.activity_custom_list_view,null);
        TextView txtView =(TextView)convertView.findViewById(R.id.textView_l);
        TextView txtView2 =(TextView)convertView.findViewById(R.id.textView_l2);

        ImageView fruitImg=(ImageView) convertView.findViewById(R.id.imageView_l);
        txtView.setText(listFruit[position]);
        txtView2.setText(fruitlist2[position]);
        fruitImg.setImageResource(listImages[position]);
        return convertView;
    }
}
