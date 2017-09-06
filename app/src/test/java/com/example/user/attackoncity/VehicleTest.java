package com.example.user.attackoncity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 06/09/2017.
 */

public class VehicleTest {

    Tank tank;
    Uboat uboat;

    @Before
    public void before(){
        tank = new Tank("Matilda", 500, 88);
        uboat = new Uboat("Hilda", 300, 102);
    }

    @Test
    public void vehiclesExist(){
        assertEquals("Matilda", tank.getType());
        assertEquals("Hilda", uboat.getType());
    }

    @Test
    public void vehiclesHaveHealth(){
        assertEquals(500, tank.getHealthValue());
        assertEquals(300, uboat.getHealthValue());
    }

    @Test
    public void vehiclesHaveFirePower(){
        assertEquals(88, tank.getAttackValue());
        assertEquals(102, uboat.getAttackValue());
    }
}
