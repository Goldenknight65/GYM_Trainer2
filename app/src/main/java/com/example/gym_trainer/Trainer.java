package com.example.gym_trainer;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;



@Entity
class Trainer{
    @Id
    private int id =0;
    private double waight;
    private double hight;
    private double age;
    private char gender;
    private double c;
    private int steps;

    public Trainer(int id, double waight, double hight, double age, char gender, double c, int steps) {
        this.id = id;
        this.waight = waight;
        this.hight = hight;
        this.age = age;
        this.gender = gender;
        this.c = c;
        this.steps = steps;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWaight(double waight) {
        this.waight = waight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWaight() {
        return waight;
    }

    public double getHight() {
        return hight;
    }

    public double getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", waight=" + waight +
                ", hight=" + hight +
                ", age=" + age +
                ", gender=" + gender +
                ", c=" + c +
                ", steps=" + steps +
                '}';
    }
}