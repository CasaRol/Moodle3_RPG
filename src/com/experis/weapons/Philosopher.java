package com.experis.weapons;

public class Philosopher extends Ranged {

    int level;
    String name;
    int totalDamage;

    public Philosopher(int level) {
        this.level = level;
        this.name = "The Philosopher";
        this.totalDamage = calculateDamage();
    }

    private int calculateDamage() {
        //calculates damage based on base stats and level
        return super.baseDamage + (super.scale * level);
    }

    @Override
    public int getDamage() {
        return super.baseDamage;
    }

    @Override
    public int getTotalDamage() {
        return this.totalDamage;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getLevel() {
        return this.level;
    }
}
