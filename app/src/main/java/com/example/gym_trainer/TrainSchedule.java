package com.example.gym_trainer;

import androidx.room.Entity;

@Entity(primaryKeys = {"dayId","Exid"})
public class TrainSchedule {
    public int dayId;
    public int Exid;

}
