package com.experis.heros;

public class Ranger extends Hero{

    public Ranger() {
        super(120, 5, 10, 2);
    }

    @Override
    public void levelUp() {
        setLevel(level += 1);
        setHealth(health += 20);
        setStrength(strength += 2);
        setDexterity(dexterity += 5);
        setIntelligence(intelligence += 1);
    }
}
