package com.Test;


import android.content.Context;
import android.widget.Toast;

class ToastClass {

    private void showToastMessage(String message, Context c) {
        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();
    }

    public void showTest(String message, Context c) {
        showToastMessage(message, c);
    }
}
