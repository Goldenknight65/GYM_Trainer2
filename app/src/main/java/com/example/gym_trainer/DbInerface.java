package com.example.gym_trainer;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DbInerface {
    @Query("SELECT day FROM Day")
    List<Day> getAllDay();

    @Query("Select exercise from day")
    List<Exercise> getExercises();

    @Update
    public void updateFlag(Day... day);
    
    @Insert
    public void insertDay(Day... day);



}
