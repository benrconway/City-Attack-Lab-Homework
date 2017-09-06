package com.example.user.attackoncity;

/**
 * Created by user on 06/09/2017.
 */

public class Mothra extends Kaiju {

    public Mothra(String name){
        super(name);
    }

    public String roar(){
        return "The terrifying roar of an angry wind... full of dust!";
    }

    public void attack(Damageable target){
        target.takeDamage(attackValue);
    }

    public String travel(){
        return "Soft wings fill your view as Mothra soars across the skies";
    }
}
