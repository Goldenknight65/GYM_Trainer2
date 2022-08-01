package com.example.gym_trainer;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DbInerface {
    @Query("SELECT day FROM Day")
    int [] getAllDay();

    @Update
    public void updateFlag(Day... day);

    @Insert
    public void insertDay(Day... day);
}
