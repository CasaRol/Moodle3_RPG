package com.experis.heros;

public class Warrior extends Hero {


    public Warrior() {
        super(150, 10, 3, 1);
    }


    @Override
    public void levelUp() {
        setLevel(level += 1);
        setHealth(health += 30);
        setStrength(strength += 5);
        setDexterity(dexterity += 2);
        setIntelligence(intelligence += 1);
    }
}
