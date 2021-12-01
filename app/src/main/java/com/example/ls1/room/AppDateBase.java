package com.example.ls1.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.ls1.Model.TaskModel;

@Database(entities = {TaskModel.class}, version = 1)
public abstract class AppDateBase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
