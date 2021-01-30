package com.experis.weapons;

public class LesserMagicWand extends Magic{

    int level;
    String name;
    int totalDamage;

    public LesserMagicWand(int level) {
        this.level = level;
        this.name = "Lesser Magic Wand";
        this.totalDamage = calculateDamage();
    }

    //Should maybe be on the interface or abstract class but not sure how
    private int calculateDamage() {
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
