package com.example.gym_trainer;




class Trainer{
    private double waight;
    private double hight;
    private double age;
    private char gender;
    private double c;
    private int Flag;

    public Trainer(double waight, double hight, double age, char gender, double c, int Flag) {
        this.waight = waight;
        this.hight = hight;
        this.age = age;
        this.gender = gender;
        this.c = c;
        this.Flag = Flag;
    }

    public int getSteps() {
        return Flag;
    }

    public void setFlag(int Flag) {
        this.Flag = Flag;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
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
                ", waight=" + waight +
                ", hight=" + hight +
                ", age=" + age +
                ", gender=" + gender +
                ", c=" + c +
                ", steps=" + Flag +
                '}';
    }
}