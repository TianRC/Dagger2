package com.trc.dagger2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.trc.dagger2.app.MyApplication;
import com.trc.dagger2.login.LoginActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

public class MainActivity extends AppCompatActivity {
    @Inject
    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerUserComponent
                .builder()
                .userModule1(new UserModule1("www.baidu.com"))
                .appComonent(((MyApplication) getApplication()).getAppComonent())
                .build()
                .inject(this);
        Log.d("MainActivity", "gson:" + gson);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }
}
