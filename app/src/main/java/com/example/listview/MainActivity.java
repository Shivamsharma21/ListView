package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button seeCustomListview;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        seeCustomListview = findViewById(R.id.seecustomlistview);

        String []list = {"Tokyo","New York","London","Amsterdam","Taipei","Moscow",
                "Brasilia","Zurik","France","Tibet","Siberia","South Africa",
                "Ottawa","Seoul","Riyadh","Canberra","Paris","Denmark"};

        seeCustomListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CustomListView.class);
                startActivity(intent);
            }
        });

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