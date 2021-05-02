package com.CYJ.proxypatternexample;

import android.util.Log;

public class Proxy implements IService{
    Service service;
    String name;

    public Proxy(String name){
        this.name = name;
        Log.d("Proxy", "Do Pre-Work before the Service Create " + name);
    }

    @Override
    public void DoSomething() {
        Log.d("Proxy", "Do Something on Proxy");
    }

    @Override
    public void MassiveMethod() {
        if(service == null) {
            service = new Service(name);
        }
        service.MassiveMethod();
    }
}

