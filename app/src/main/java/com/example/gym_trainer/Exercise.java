package com.example.gym_trainer;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Exercise {

 @PrimaryKey
 public int Exid;
   private String name;
   private String type;
   private int flag;
   private int col;

    public Exercise(int id, String name, String type, int flag, int col) {
        this.Exid = id;
        this.name = name;
        this.type = type;
        this.flag = flag;
        this.col = col;
    }

    public long getExid() {
        return Exid;
    }

    public void setExid(int exid) {
        this.Exid = exid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
