package com.murallaromana.dam.segundo.ogandobritoosirisjuniorproyectopmdm;

import android.app.Application;
import android.os.SystemClock;

public class Myapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(8000);
    }
}
