package com.blucore.searchtvshows;

import android.app.Application;

import com.blucore.searchtvshows.web.WebServices;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new WebServices();
    }
}
