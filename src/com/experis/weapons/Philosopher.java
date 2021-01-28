package com.experis.weapons;

public class Philosopher extends Ranged {

    int level;
    String name;
    int totalDamage;

    public Philosopher(int level) {
        this.level = level;
        this.name = "2-handed longSword";
        this.totalDamage = calculateDamage();
    }

    private int calculateDamage() {
        return super.baseDamage + (2 * level);
    }

    @Override
    public int getDamage() {
        return super.baseDamage;
    }

    @Override
    public int getTotalDamage() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getLevel() {
        return 0;
    }
}
