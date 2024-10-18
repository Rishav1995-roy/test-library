package com.Test;


import android.content.Context;
import android.widget.Toast;

public class ToastClass {
    private String url;
    private String endPoint;
    private String message;

    private ToastClass() {
        ConfigClass c = new ConfigClass();
        url = c.getUrl();
        endPoint = c.getEndPoint();
    }

    public ToastClass(String message) {
        this.message = message;
    }

    public void showToastMessage(Context c) {
        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();
    }

}
