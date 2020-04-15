package com.example.gmail3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
public class ImageAdapter extends BaseAdapter {
    List<ContactModel> contacts;
    public ImageAdapter(List<ContactModel> contacts) {
        this.contacts = contacts;
    }
    @Override
    public int getCount() {
        return contacts.size();
    }
    @Override
    public Object getItem(int i) {
        return contacts.get(i);
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_1, viewGroup, false);
            viewHolder = new ViewHolder();
            viewHolder.textFullname = view.findViewById(R.id.text_fullname);
            viewHolder.textRound = view.findViewById(R.id.text_round);
            viewHolder.textMain= view.findViewById(R.id.text_main);
            viewHolder.textMain2= view.findViewById(R.id.text_main2);
            viewHolder.textTime=view.findViewById(R.id.text_time);
            viewHolder.imageFavorite = view.findViewById(R.id.image_favorite);
            view.setTag(viewHolder);
        }
        else
            viewHolder = (ViewHolder) view.getTag();

        final ContactModel contact = contacts.get(i);
        viewHolder.textFullname.setText(contact.getFullname());
        viewHolder.textRound.setText(contact.getFullname().substring(0, 1));
        viewHolder.textMain.setText(contact.getMain());
        viewHolder.textMain2.setText(contact.getMain2());
        viewHolder.textTime.setText(contact.getTime());

        if (contact.isSelected())
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_favorite);
        else
            viewHolder.imageFavorite.setImageResource(R.drawable.ic_star_normal);
        viewHolder.imageFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isSelected = contacts.get(i).isSelected;
                contacts.get(i).setSelected(!isSelected);
                notifyDataSetChanged();
            }
        });
        return view;
    }
    class ViewHolder {
        TextView textFullname;
        TextView textRound;
        ImageView imageFavorite;
        TextView textMain;
        TextView textTime;
        TextView textMain2;
    }
}


