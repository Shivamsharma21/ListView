package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        ListView listView = findViewById(R.id.clistview);
        Person jady = new Person("Jady","10-1-2000","Male");
        Person freed = new Person("freed","14-1-2000","Male");
        Person jhon = new Person("jhon","10-1-2000","Male");
        Person balke = new Person("blake","15-1-2000","female");
        Person michale = new Person("michale","22-1-2000","Male");
        Person jacy = new Person("jacy","19-1-2000","female");
        Person mialan = new Person("mialan","02-1-2000","Male");
        Person steve = new Person("steve","05-1-2000","Male");
        Person july = new Person("July","08-1-2000","female");
        Person karen = new Person("karen","10-1-2000","Male");
        Person james = new Person("James","13-1-2000","female");


        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(jady);
        personArrayList.add(freed);
        personArrayList.add(jhon);
        personArrayList.add(balke);
        personArrayList.add(michale);
        personArrayList.add(jacy);
        personArrayList.add(mialan);
        personArrayList.add(steve);
        personArrayList.add(july);
        personArrayList.add(karen);
        personArrayList.add(james);

        PersonListAdapter personListAdapter = new PersonListAdapter(this,R.layout.adapter_view_list,personArrayList);
        listView.setAdapter(personListAdapter);
    }
}