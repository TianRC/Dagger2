package com.trc.dagger2.login;

import com.trc.dagger2.UserModule1;
import com.trc.dagger2.ano.ActivityScoped;
import com.trc.dagger2.app.AppComonent;

import dagger.Component;

/**
 * Created by trc on 2018/4/19.
 */

@ActivityScoped
@Component(modules = {UserModule1.class} ,dependencies = AppComonent.class)
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
