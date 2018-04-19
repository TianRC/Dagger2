package com.trc.dagger2.app;

import com.trc.dagger2.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by trc on 2018/4/19.
 */

@Module
public class ApplicationModule {

    @Singleton
    @Provides
    public Gson providesGson() {
        return new Gson();
    }

}
