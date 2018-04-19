package com.trc.dagger2.app;

import com.trc.dagger2.Gson;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by trc on 2018/4/19.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface AppComonent {
    Gson gson();
}
