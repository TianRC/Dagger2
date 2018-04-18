package com.trc.dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by trc on 2018/4/18.
 */

public class ApiService {
    @Inject
    public ApiService(String url) {
        Log.d("ApiService", "ApiService构造方法"+url);
    }

    public void register() {
        Log.d("ApiService", "注册");
    }

}
