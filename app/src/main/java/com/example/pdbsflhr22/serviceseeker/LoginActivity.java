package com.example.pdbsflhr22.serviceseeker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity implements View.OnClickListener {

    Button btn_login;
    EditText Ed_username,Ed_password;
    TextView tv_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btn_login=findViewById(R.id.btn_login);
        Ed_username=findViewById(R.id.Ed_username);
        Ed_password=findViewById(R.id.Ed_password);
        tv_register=findViewById(R.id.tv_register);

        btn_login.setOnClickListener(this);
        tv_register.setOnClickListener(this);
    }

    public void mLogin(){

        final String str_username = Ed_username.getText().toString();
        final String str_password = Ed_password.getText().toString();


        if (TextUtils.isEmpty(str_username)) {
            Ed_username.setError("Can't be Empty");
            Ed_username.requestFocus();
            return;
        }if (TextUtils.isEmpty(str_password)) {
            Ed_password.setError("Can't be Empty");
            Ed_password.requestFocus();
            return;
        }



    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_login:
                mLogin();
                startActivity(new Intent(LoginActivity.this,SplashActivity.class));
                break;

            default:
                break;
        }
    }
}
