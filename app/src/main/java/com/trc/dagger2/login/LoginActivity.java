package com.trc.dagger2.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.trc.dagger2.Gson;
import com.trc.dagger2.R;
import com.trc.dagger2.app.MyApplication;

import javax.inject.Inject;

/**
 * Created by trc on 2018/4/19.
 */

public class LoginActivity extends AppCompatActivity {
    @Inject
    Gson gson;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        DaggerLoginComponent.builder()
                .appComonent(((MyApplication) getApplication()).getAppComonent())
                .build().inject(this);
        Log.d("LoginActivity", "gson:" + gson);
    }
}
