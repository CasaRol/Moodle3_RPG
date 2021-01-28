package com.experis.weapons;

public class TwoHandedSword extends Melee{

    int level;
    int baseDamage;
    String type;
    int totalDamage;

    public TwoHandedSword(int level) {
        this.level = level;
        this.baseDamage = 15;
        this.type = "2-handed longSword";
        this.totalDamage = calculateDamage();
    }

    private int calculateDamage() {
        return baseDamage + (2 * level);
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getDamage() {
        return this.totalDamage;
    }

    @Override
    public int getTotalDamage() {
        return totalDamage;
    }


}
