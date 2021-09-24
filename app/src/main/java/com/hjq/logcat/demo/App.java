package com.hjq.logcat.demo;

import android.app.Application;

import com.hjq.logcat.LogcatConfig;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        LogcatConfig.LOGCAT_TEXT_DEFAULT = "Test";
    }


}
