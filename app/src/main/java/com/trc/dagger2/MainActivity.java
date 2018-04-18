package com.trc.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    UserManager userManager;
    @Inject
    UserManager userManager1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerUserComponent
                .builder()
                .userModule1(new UserModule1("www.baidu.com--"))
                .build()
                .inject(this);
        userManager.provideService();
    }
}
