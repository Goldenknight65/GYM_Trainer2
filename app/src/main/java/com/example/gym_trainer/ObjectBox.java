package com.example.gym_trainer;

import android.content.Context;

import java.util.List;

import io.objectbox.Box;
import io.objectbox.BoxStore;

public class ObjectBox {
    private static BoxStore boxStore;

    public static void init(Context context) {
        boxStore = MyObjectBox.builder()
                .androidContext(context.getApplicationContext())
                .build();
    }

    public static BoxStore get() { return boxStore; }

    public List<Trainer> getTrainers(){
        Box<Trainer> TrainerBox =ObjectBox.get().boxFor(Trainer.class);
        return TrainerBox.getAll();
    }

    public Trainer getTrainer(int id){
        Box<Trainer> TrainerBox =ObjectBox.get().boxFor(Trainer.class);
        return TrainerBox.get(id);
    }

}
