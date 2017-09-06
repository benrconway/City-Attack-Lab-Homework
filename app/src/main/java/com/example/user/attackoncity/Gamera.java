package com.example.user.attackoncity;

/**
 * Created by user on 06/09/2017.
 */

public class Gamera extends Kaiju {

    public Gamera(String name){
        super(name);
    }

    public String roar(){
        return "Beakly Gnashing (but really loud)!";
    }

    public void attack(Damageable target){
        target.takeDamage(attackValue);
    }

    public String travel() {
        return "Gamera swims silently into an ambush position!";
    }
}
