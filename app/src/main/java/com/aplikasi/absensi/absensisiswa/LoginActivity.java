package com.aplikasi.absensi.absensisiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signup(View view) {

        Intent intent   =   new Intent();
        intent.setClass(getApplicationContext(), Register.class);
        startActivity(intent);
    }
}