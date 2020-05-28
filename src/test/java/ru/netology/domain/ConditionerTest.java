package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(-15);
        conditioner.setCurrentTemperature(20);
        int excepted = 20;
        assertEquals(excepted, conditioner.getCurrentTemperature());
    }


    @Test
    void setMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(-15);
        conditioner.setCurrentTemperature(15);
        int excepted = 25;
        assertEquals(excepted,conditioner.getMaxTemperature());
    }

    @Test
    void setMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(-15);
        conditioner.setCurrentTemperature(10);
        int excepted = -15;
        assertEquals(excepted, conditioner.getMinTemperature());
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(-15);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        int excepted = 21;
        assertEquals(excepted, conditioner.getCurrentTemperature());
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(-15);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        int excepted = 19;
        assertEquals(excepted, conditioner.getCurrentTemperature());

    }


}
