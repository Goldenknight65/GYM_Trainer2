package com.example.gym_trainer;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Day.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DbInerface Dao();
}