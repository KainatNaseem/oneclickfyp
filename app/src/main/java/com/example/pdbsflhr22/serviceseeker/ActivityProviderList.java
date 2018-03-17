package com.example.pdbsflhr22.serviceseeker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.pdbsflhr22.serviceseeker.common.Utils_Str.TAG_NAME;

public class ActivityProviderList extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrician);

        /*Bundle b = new Bundle();
        b = getIntent().getExtras();*/
        String name = getIntent().getExtras().getString(TAG_NAME);
        Toast.makeText(this, ""+name, Toast.LENGTH_SHORT).show();

        listView = (ListView)findViewById(R.id.listview);
        String[] values = new String[]{"Item 0","Item 1"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    /*Intent myIntent = new Intent(view.getContext(), Item1.class);
                    startActivityForResult(myIntent, 0);*/
                startActivity(new Intent(ActivityProviderList.this,ActivityProviderProfile.class));
                }

            }
        });
    }
}
