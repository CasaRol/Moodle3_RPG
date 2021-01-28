package com.experis.heros;

public class Mage extends Hero{


    public Mage() {
        super(100, 2, 3, 10);
    }

    @Override
    public void levelUp() {
        setLevel(level += 1);
        setHealth(health += 15);
        setStrength(strength += 1);
        setDexterity(dexterity += 2);
        setIntelligence(intelligence += 5);
    }
}
