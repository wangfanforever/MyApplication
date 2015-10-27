package com.example.wang.myapplication;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by wang on 2015-10-27.
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
