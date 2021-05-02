package com.CYJ.proxypatternexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Proxy proxy;
    Proxy proxy2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proxy = new Proxy("proxy1");
        proxy2 = new Proxy("proxy2");
        proxy.MassiveMethod();
        proxy2.MassiveMethod();

//        proxy.DoSomething();
    }
}

