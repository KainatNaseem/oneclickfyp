package com.example.pdbsflhr22.serviceseeker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SelectionActivity extends Activity implements View.OnClickListener {

    Button btn_seeker, btn_provider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        btn_seeker=findViewById(R.id.btn_seeker);
        btn_provider=findViewById(R.id.btn_provider);

        btn_seeker.setOnClickListener(this);
        btn_provider.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_seeker:
                startActivity(new Intent(this,ActivitymSrvices.class));
                break;

            case R.id.btn_provider:
                startActivity(new Intent(this,BeforeLogin.class));
                break;

            default:
                break;
        }
    }
}
