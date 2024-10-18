package com.Test;


import android.content.Context;
import android.widget.Toast;

class ToastClass {
    private final String url;
    private final String endPoint;

    public ToastClass() {
        ConfigClass c = new ConfigClass();
        url = c.getUrl();
        endPoint = c.getEndPoint();
    }

    public void showToastMessage(Context c) {
        Toast.makeText(c,url+endPoint, Toast.LENGTH_SHORT).show();
    }

}
