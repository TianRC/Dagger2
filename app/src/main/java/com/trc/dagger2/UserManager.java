package com.trc.dagger2;

import android.util.Log;

/**
 * Created by trc on 2018/4/18.
 */

public class UserManager {
    private ApiService apiService;

    public UserManager(ApiService apiService) {
        this.apiService = apiService;
    }

    public void provideService() {
        Log.d("UserManager--", "provideService");
    }

}
