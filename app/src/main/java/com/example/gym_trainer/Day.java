package com.example.gym_trainer;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Day{
@Id long id;
    int day;

    public Day(long id, int day) {
        this.id = id;
        this.day = day;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
