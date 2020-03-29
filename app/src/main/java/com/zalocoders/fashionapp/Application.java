package com.zalocoders.fashionapp;

import com.zalocoders.fashionapp.Models.SharedPreferenceHelper;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferenceHelper.initialize(this);
    }
}
