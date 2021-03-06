package com.example.newdatafetchfromapi;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {
    static RequestQueue mRequestQueue;
    private static VolleySingleton mInstance;

    private VolleySingleton(Context context) {
        mRequestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    public static synchronized VolleySingleton getInstance(Context context) {

        if (mInstance == null) {
            mInstance = new VolleySingleton(context);
        }

        return mInstance;

    }

    public static RequestQueue getRequestQueue() {
        return mRequestQueue;
    }

}
