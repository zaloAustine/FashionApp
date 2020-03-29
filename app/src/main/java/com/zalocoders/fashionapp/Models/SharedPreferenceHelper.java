package com.zalocoders.fashionapp.Models;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

public class SharedPreferenceHelper {

    private static SharedPreferences preferences;
    private static SharedPreferences.Editor editor;
    private static class Keys{
        private static int PRIVATE_MODE = 0;
        private static final String PREF_NAME = "fashionPref";

    }


    public static void initialize(Context con) {
        if (null == preferences) {
            preferences = con.getSharedPreferences(Keys.PREF_NAME, Keys.PRIVATE_MODE);
        }
        if (null == editor) {
            editor = preferences.edit();
        }
    }

    public static String getId(){
        return preferences.getString("id", null);
    }


    public static void setID(String id){
        Gson g = new Gson();
        editor.putString("id", id);
        editor.commit();
    }
}
