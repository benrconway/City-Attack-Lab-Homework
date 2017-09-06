package com.example.user.attackoncity;

/**
 * Created by user on 06/09/2017.
 */

public class Uboat extends Vehicle implements VehicularAttacks{

    public Uboat(String type, int healthValue, int attackValue, int weight){
        super(type, healthValue, attackValue, weight);
    }

    public void fire(Damageable target) {
        target.takeDamage(attackValue);
    }

    public void ram(Damageable target) {
        target.takeDamage(weight);
    }

}
