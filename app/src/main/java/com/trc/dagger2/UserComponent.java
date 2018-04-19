package com.trc.dagger2;

import com.trc.dagger2.ano.ActivityScoped;
import com.trc.dagger2.app.AppComonent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by trc on 2018/4/18.
 */
@ActivityScoped
@Component(modules = {UserModule1.class} ,dependencies = {AppComonent.class})
public interface UserComponent {
    void inject(MainActivity mainActivity);
}
