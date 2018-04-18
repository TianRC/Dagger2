package com.trc.dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by trc on 2018/4/18.
 */
@Component(modules = {UserModule1.class})
public interface UserComponent {
    void inject(MainActivity mainActivity);
}
