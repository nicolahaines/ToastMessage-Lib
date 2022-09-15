package com.example.toastapplibrary;
import android.widget.Toast;


import android.content.Context;

public class ToastMessage {
    
        public static void s(Context c, String message){

            Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

        }
    }

