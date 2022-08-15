package com.example.gym_trainer;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = Day.class,exportSchema = false,version = 1)
public class TrDatabase extends RoomDatabase {
private static  final String DB_NAME="day_db";
private static TrDatabase instance;

public static synchronized TrDatabase getInstance(Context context){
    if(instance==null){
        instance = Room.databaseBuilder(context.getApplicationContext(),TrDatabase.class,DB_NAME).fallbackToDestructiveMigration().build();

    }
    return  instance;
}
public DbInerface inter;
    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}
