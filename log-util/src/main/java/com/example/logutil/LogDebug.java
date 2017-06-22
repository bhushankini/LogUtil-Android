package com.example.logutil;

import android.util.Log;

/**
 * Created by bkini on 6/22/17.
 */

public class LogDebug  {
    private static final String TAG = "MONSANTO_LOG";
    public static void d(String message){
        Log.d(TAG,message);
    }
}
