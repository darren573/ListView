package com.darren.listview.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.darren.listview.R;

import java.util.ArrayList;

/**
 * Created by lenovo on 2017/4/24.
 */

public class TestAdapter extends BaseAdapter {
    private ArrayList <String> data;
    public TestAdapter(ArrayList<String> data){
        this.data=data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null);
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.Items_title.setText(data.get(position));
        holder.Items_text.setText(data.get(position));
        return convertView;
    }
    class ViewHolder{
        TextView Items_title;
        TextView Items_text;
       public ViewHolder(View view){
           Items_title= (TextView) view.findViewById(R.id.Items_title);
           Items_text= (TextView) view.findViewById(R.id.Items_text);
       }
    }
}
