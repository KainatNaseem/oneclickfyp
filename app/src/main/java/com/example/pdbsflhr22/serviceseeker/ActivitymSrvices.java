package com.example.pdbsflhr22.serviceseeker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import static com.example.pdbsflhr22.serviceseeker.common.Utils_Str.TAG_NAME;
import static com.example.pdbsflhr22.serviceseeker.common.Utils_Str.TAG_PID;
import static com.example.pdbsflhr22.serviceseeker.common.Utils_Str.TAG_THUMBNAIL;
import static com.example.pdbsflhr22.serviceseeker.common.utils.mID;
import static com.example.pdbsflhr22.serviceseeker.common.utils.mThumbIds;
import static com.example.pdbsflhr22.serviceseeker.common.utils.mtTitle;

public class ActivitymSrvices extends Activity {

    ArrayList<HashMap<String, String>> mList = new ArrayList<HashMap<String, String>>();
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_layout);
        gridView = (GridView) findViewById(R.id.gridView);

        for (int i = 0; i < mtTitle.length; i++) {

            HashMap<String, String> map = new HashMap<String, String>();
            map.put(TAG_PID, "" + mID[i]);
            map.put(TAG_NAME, mtTitle[i]);
            map.put(TAG_THUMBNAIL, "" + mThumbIds[i]);
            mList.add(map);
        }


        ListAdapter adapter = new SimpleAdapter(this, mList, R.layout.item_ui_services, new String[]{TAG_NAME, TAG_THUMBNAIL}, new int[]{R.id.textGrid, R.id.img_grid});
        gridView.setAdapter(adapter);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String name = mList.get(position).get(TAG_NAME).toString();
                String id = mList.get(position).get(TAG_PID);

                Intent intent = new Intent(ActivitymSrvices.this, ActivityProviderList.class);
                intent.putExtra(TAG_NAME, name);
                intent.putExtra(TAG_PID, id);
                startActivity(intent);
            }
        });
    }

}



