package com.experis.heros;

public class Ranger extends Hero{

    public Ranger(int health, int strength, int dexterity, int intelligence) {
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
