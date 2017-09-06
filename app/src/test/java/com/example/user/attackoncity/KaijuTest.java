package com.example.user.attackoncity;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 06/09/2017.
 */

public class KaijuTest {

    Gamera gamera;
    Mothra mothra;
    Tank tank;
    Uboat uboat;

    @Before
    public void before(){
        gamera = new Gamera("Joanne");
        mothra = new Mothra("Kevin");
        tank = new Tank("Matilda", 500, 88);
        uboat = new Uboat("Hilda", 300, 102);
    }

    @Test
    public void monstersExist(){
        assertEquals("Joanne", gamera.getName());
        assertEquals("Kevin", mothra.getName());
    }

    @Test
    public void monstersHaveHealth(){
        assertEquals(1000, gamera.getHealthValue());
    }

    @Test
    public void monstersHaveAttackPower(){
        assertEquals(200, gamera.getAttackValue());
    }

    @Test
    public void monstersCanRoar(){
        assertEquals("Beakly Gnashing (but really loud)!", gamera.roar());
        assertEquals("The terrifying roar of an angry wind... full of dust!", mothra.roar());
    }

    @Test
    public void monstersCanTravel(){
        assertEquals("Gamera swims silently into an ambush position!", gamera.travel());
        assertEquals("Soft wings fill your view as Mothra soars across the skies", mothra.travel());
    }

    @Test
    public void monstersCanAttackVehicles(){
        gamera.attack(uboat);
        mothra.attack(tank);
        assertEquals(300, tank.getHealthValue());
        assertEquals(100, uboat.getHealthValue());
    }
}
