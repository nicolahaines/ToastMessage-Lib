package com.example.sdklib;
import android.widget.Toast;
import android.content.Context;
public class ToastApp {
    public static void toastMsg(Context c, String message){
     Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
      //  Toast.makeText(getApplicationContext(), "STRING MESSAGE", 5000).show();
    }
}
