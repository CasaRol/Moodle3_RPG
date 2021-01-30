package com.experis.weapons;

public class TwoHandedSword extends Melee{

    int level;
    String name;
    int totalDamage;

    public TwoHandedSword(int level) {
        this.level = level;
        this.name = "2-handed longSword";
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
        return totalDamage;
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
