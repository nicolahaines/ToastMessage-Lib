package com.example.sdkapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//import com.example.sdklib.ToastApp;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ToastApp.toastMsg(MainActivity.this,"Hello");
    }
}