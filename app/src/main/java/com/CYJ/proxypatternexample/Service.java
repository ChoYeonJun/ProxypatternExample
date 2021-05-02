package com.CYJ.proxypatternexample;

import android.util.Log;

public class Service implements IService{
    @Override
    public void DoSomething() {
        Log.d("Proxy", "Do Something in Service Class");
    }

public Service(String name){
    Log.d("Proxy", name + ": Do real work");
}
    @Override
    public void MassiveMethod() {
        try
        {
            Log.d("Proxy", "MassiveMethod");

            for(int i=0;i<100;i++){
                Integer integer = Integer.valueOf(i);
                Thread.sleep(100);
            }
        }catch(Exception e){}

    }
}

