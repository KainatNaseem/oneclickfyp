package com.example.pdbsflhr22.serviceseeker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class BeforeLogin extends Activity implements View.OnClickListener {

    Button btn_login, btn_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_login);

        btn_login=findViewById(R.id.btn_login);
        btn_signup=findViewById(R.id.btn_signup);

        btn_login.setOnClickListener(this);
        btn_signup.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                startActivity(new Intent(BeforeLogin.this,LoginActivity.class));
                break;

            case R.id.btn_signup:
                startActivity(new Intent(BeforeLogin.this,Create_Account.class));
                break;

            default:
                break;
        }
    }
}
