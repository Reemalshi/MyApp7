package com.example.myapp7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    private Context context;
    private List<ListItem> listItems;
    public ListAdapter(Context context, List<ListItem> listItems){
        this.context=context;
        this.listItems=listItems;
    }
    @Override
    public int getCount(){
        return listItems.size();
    }
    @Override
    public Object getItem(int position){
        return listItems.get(position);
    }
    @Override
    public long getItemId(int posotin){
        return posotin;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list, parent, false);

        }
        ListItem currentItem = (ListItem) getItem(position);
        CardView cardView = convertView.findViewById(R.id.card1);



        return convertView;
    }
}
