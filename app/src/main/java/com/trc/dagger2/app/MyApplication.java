package com.trc.dagger2.app;

import android.app.Application;

/**
 * Created by trc on 2018/4/19.
 */

public class MyApplication extends Application {
    private AppComonent appComonent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComonent = DaggerAppComonent.create();
    }

    public AppComonent getAppComonent() {
        return appComonent;
    }
}
