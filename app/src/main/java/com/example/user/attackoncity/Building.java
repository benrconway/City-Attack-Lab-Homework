package com.example.user.attackoncity;

/**
 * Created by user on 06/09/2017.
 */

public class Building implements Damageable {
    int healthValue;

    public Building(){
        this.healthValue = 200;
    }

    public void takeDamage(int damage){
        this.healthValue -= damage;
    }
}
