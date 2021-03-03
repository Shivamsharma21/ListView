package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        String []list = {"Tokyo","New York","London","Amsterdam","Taipei","Moscow",
                "Brasilia","Zurik","France","Tibet","Siberia","South Africa",
                "Ottawa","Seoul","Riyadh","Canberra","Paris","Denmark"};

        ArrayAdapter<String>adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, list[position], Toast.LENGTH_SHORT).show();
            }
        });

    }


}