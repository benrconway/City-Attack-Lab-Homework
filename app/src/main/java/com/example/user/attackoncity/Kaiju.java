package com.example.user.attackoncity;

/**
 * Created by user on 06/09/2017.
 */

public abstract class Kaiju {

    String name;
    int healthValue;
    int attackValue;

    public Kaiju(String name){
        this.name = name;
        this.healthValue = 1_000;
        this.attackValue = 200;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    abstract String roar();

}
