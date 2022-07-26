package com.example.gym_trainer;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Exercise {
   @Id
   public long id;
   private String name;
   private String type;
   private int flag;
   private int col;

    public Exercise(long id, String name, String type, int flag, int col) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.flag = flag;
        this.col = col;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
