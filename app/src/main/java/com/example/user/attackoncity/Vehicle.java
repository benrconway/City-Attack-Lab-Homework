package com.example.user.attackoncity;

/**
 * Created by user on 06/09/2017.
 */

public abstract class Vehicle implements Damageable{
    String type;
    int healthValue;
    int attackValue;
    int weight;

    public Vehicle(String type, int healthValue, int attackValue, int weight){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.weight = weight;
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
//
//    public void setHealthValue(int attackValue) {
//        this.healthValue -= attackValue;
//    }
    public void takeDamage(int damage){
        this.healthValue -= damage;
    }
}

