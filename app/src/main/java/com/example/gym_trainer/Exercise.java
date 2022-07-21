package com.example.gym_trainer;


import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;
import io.objectbox.relation.ToMany;

@Entity
public class Exercise {
   @Id
   public long id;
   private int ColperMint;
    private  String type;
    private String name;
    private boolean Flag;
    public ToMany<Day> day;
    public Exercise(int colperMint, String type, String name, boolean flage) {
        ColperMint = colperMint;
        this.type = type;
        this.name = name;
        Flag = flage;
    }

    public int getColperMint() {
        return ColperMint;
    }

    public void setColperMint(int colperMint) {
        ColperMint = colperMint;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean flag) {
        Flag = flag;
    }

}
