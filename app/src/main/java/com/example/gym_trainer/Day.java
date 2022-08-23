package com.example.gym_trainer;


import androidx.room.Entity;
import androidx.room.Junction;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

import java.util.List;

@Entity
public class Day{

    @PrimaryKey int dayId;
    int day;
    @Relation(parentColumn = "Exid",
            entity = Exercise.class,
            associateBy =@Junction(value = TrainSchedule.class,
            parentColumn = "dayId",
            entityColumn = "Exid"), entityColumn = "exerciseList")
     List<Exercise> exerciseList;
    public Day(int dayId, int day ) {
        this.dayId = dayId;
        this.day = day;
    }

    public int getId() {
        return dayId;
    }

    public void setId(int id) {
        this.dayId = id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Day{" +
                "id=" + dayId +
                ", day=" + day +
                '}';
    }
}
