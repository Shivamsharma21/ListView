package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class PersonListAdapter extends ArrayAdapter<Person> {

    Context mcontext;
    int mResource;

    public PersonListAdapter(@NonNull Context context, int resource, @NonNull ArrayList <Person> objects) {
        super(context, resource, objects);
    mcontext =context;
    mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String sex = getItem(position).getSex();

        Person person = new Person(name,birthday,sex);

        LayoutInflater inflater = LayoutInflater.from(mcontext);
        convertView =inflater.inflate(mResource,parent,false);

        TextView tvname = convertView.findViewById(R.id.person_Name);
        TextView tvbdy = convertView.findViewById(R.id.person_bdy);
        TextView tvsex = convertView.findViewById(R.id.person_sex);

        tvname.setText(name);
        tvbdy.setText(birthday);
        tvsex.setText(sex);

        return convertView;
            }


}
