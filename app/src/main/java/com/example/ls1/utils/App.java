package com.example.ls1.utils;

import android.app.Application;

import androidx.room.Room;

import com.example.ls1.room.AppDateBase;

public class App extends Application {
    public static App instance;

    private AppDateBase database;


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = Room.databaseBuilder(this, AppDateBase.class,"database").allowMainThreadQueries()
                .build();
    }

    public AppDateBase getDatabase() {
        return database;
    }

    public static App getInstance() {
        return instance;
    }
}
