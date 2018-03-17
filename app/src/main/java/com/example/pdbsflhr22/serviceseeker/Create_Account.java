package com.example.pdbsflhr22.serviceseeker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Create_Account extends Activity implements View.OnClickListener {

    EditText ed_fname,ed_lastname,ed_phone,ed_cnic,ed_gender,ed_address,ed_qualification,ed_services,ed_exp,ed_company;
    TextView tv_login;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createe_account);


        btn_register=findViewById(R.id.btn_register);
        ed_fname = findViewById(R.id.ed_fname);
        ed_lastname=findViewById(R.id.ed_lastname);
        ed_phone=findViewById(R.id.ed_phone);
        ed_cnic=findViewById(R.id.ed_cnic);
        ed_gender=findViewById(R.id.ed_gender);
        ed_address=findViewById(R.id.ed_address);
        ed_qualification = findViewById(R.id.ed_qualification);
        ed_services=findViewById(R.id.ed_services);
        ed_exp=findViewById(R.id.ed_exp);
        ed_company=findViewById(R.id.ed_company);
        tv_login=findViewById(R.id.tv_login);
        tv_login.setOnClickListener(this);
        btn_register.setOnClickListener(this);

    }


    public void mSignUp(){

        final String str_fname = ed_fname.getText().toString();
        final String str_lastname= ed_lastname.getText().toString();
        final String str_phone = ed_phone.getText().toString();
        final String str_cnic = ed_cnic.getText().toString();
        final String str_gender = ed_gender.getText().toString();
        final String str_address = ed_address.getText().toString();
        final String str_qualification= ed_qualification.getText().toString();
        final String str_services= ed_services.getText().toString();
        final String str_exp = ed_exp.getText().toString();
        final String str_company= ed_company.getText().toString();



        if (TextUtils.isEmpty(str_fname)) {
            ed_fname.setError("Can't be Empty");
            ed_fname.requestFocus();
            return;
        }if (TextUtils.isEmpty(str_lastname)) {
            ed_lastname.setError("Email Field Can't be Empty");
            ed_lastname.requestFocus();
            return;
        }if (TextUtils.isEmpty(str_phone)) {
            ed_phone.setError("Can't be Empty");
            ed_phone.requestFocus();
            return;
        }if (TextUtils.isEmpty(str_cnic)) {
            ed_cnic.setError("Can't be Empty");
            ed_cnic.requestFocus();
            return;
        }if (TextUtils.isEmpty(str_gender)) {
            ed_gender.setError("Can't be Empty");
            ed_gender.requestFocus();
            return;
        }if (TextUtils.isEmpty(str_address)) {
            ed_address.setError("Can't be Empty");
            ed_address.requestFocus();
            return;
        }if (TextUtils.isEmpty(str_qualification)) {
            ed_qualification.setError("Can't be Empty");
            ed_qualification.requestFocus();
            return;
        }if (TextUtils.isEmpty(str_services)) {
            ed_services.setError("Email Field Can't be Empty");
            ed_services.requestFocus();
            return;
        }if (TextUtils.isEmpty(str_exp)) {
            ed_exp.setError("Can't be Empty");
            ed_company.requestFocus();
            return;
        }if (TextUtils.isEmpty(str_company)) {
            ed_company.setError("Can't be Empty");
            ed_company.requestFocus();
            return;
        }

        Toast.makeText(this, ""+ed_qualification.getText().toString(), Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,LoginActivity.class));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.tv_login:
                startActivity(new Intent(this,LoginActivity.class));
                finish();
                break;

            case R.id.btn_register:
                mSignUp();
                break;

            default:
                break;
        }
    }
}

