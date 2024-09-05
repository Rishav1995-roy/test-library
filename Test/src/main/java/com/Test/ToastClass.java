package com.Test;


import android.content.Context;
import android.widget.Toast;

public class ToastClass {

    public void showToastMessage(String message, Context c) {
        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();
    }
}
