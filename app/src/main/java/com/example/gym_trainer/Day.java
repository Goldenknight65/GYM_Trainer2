package com.example.gym_trainer;


import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Day{

    @PrimaryKey int id;
    int day;
    Exercise [] exercise;

    public Day(int id, int day, Exercise[] exercise) {
        this.id = id;
        this.day = day;
        this.exercise = exercise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Exercise[] getExercise() {
        return exercise;
    }

    public void setExercise(Exercise[] exercise) {
        this.exercise = exercise;
    }
}
