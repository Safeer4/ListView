package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list1);
        String[] cars = {"PK", "Dangal", "Secret Superstar", "3 Idiots", "Ghajini",
                "Talaash", "Rang De Basnti", "Lagaan", "Ghulam", "Mela"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                cars
        );

        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                int itemPosition = position;

                String itemValue = (String)list.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(), "Position: " + position + " Content: " + itemValue, Toast.LENGTH_SHORT).show();
            }
        });


    }

}
