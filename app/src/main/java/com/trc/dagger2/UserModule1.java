package com.trc.dagger2;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by trc on 2018/4/18.
 */
@Module()
public class UserModule1 {
    //    @Provides
//    public ApiService provideApiService() {
//        Log.d("UserModule1", "provideApiService");
//        return new ApiService();
//    }
    private String url;

    public UserModule1(String url) {
        this.url = url;
    }

    @Provides
    public String provideUrl() {
        return url;
    }

    @Provides
    public UserManager provideUserManager(ApiService apiService) {
        Log.d("UserModule1", "provideUserManager");
        return new UserManager(apiService);
    }

}
