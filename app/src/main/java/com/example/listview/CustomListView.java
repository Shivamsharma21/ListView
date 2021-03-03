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
        Person jady = new Person("Jady","22-1-2000","Male");
        Person freed = new Person("Jady","22-1-2000","Male");
        Person jhon = new Person("Jady","22-1-2000","Male");
        Person balke = new Person("Jady","22-1-2000","Male");
        Person michale = new Person("Jady","22-1-2000","Male");
        Person jacy = new Person("Jady","22-1-2000","Male");
        Person mialan = new Person("Jady","22-1-2000","Male");
        Person steve = new Person("Jady","22-1-2000","Male");
        Person july = new Person("Jady","22-1-2000","Male");
        Person karen = new Person("Jady","22-1-2000","Male");
        Person james = new Person("Jady","22-1-2000","Male");


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