package com.example.user.attackoncity;

/**
 * Created by user on 06/09/2017.
 */

public abstract class Vehicle {
    String type;
    int healthValue;
    int attackValue;

    public Vehicle(String type, int healthValue, int attackValue){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
