package com.example.gym_trainer;

import android.content.Context;
import java.util.List;
import java.util.stream.DoubleStream;

import io.objectbox.Box;
import io.objectbox.BoxStore;


public class ObjectBox {

    public static BoxStore boxStore;

    public static void init(Context context) {
        boxStore = MyObjectBox.builder()
                .androidContext(context.getApplicationContext())
                .build();
    }

    Box<Trainer> TrainerBox =ObjectBox.get().boxFor(Trainer.class);

    public static BoxStore get() { return boxStore; }

    public List<Trainer> getTrainers(){
        return TrainerBox.getAll();
    }

    public Trainer getTrainer(int id){
        return TrainerBox.get(id);
    }

    public void  putTrainer(Trainer t){
        TrainerBox.put(t);
    }


}
