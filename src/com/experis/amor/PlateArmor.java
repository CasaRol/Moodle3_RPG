package com.experis.amor;

public class PlateArmor implements Armor {

    private int level;
    private int health;
    private int strength;
    private int dexterity;
    private int intelligence;

    private final int SCALE_HEALTH = 12;
    private final int SCALE_STRENGTH = 2;
    private final int SCALE_DEXTERITY = 1;
    private final int SCALE_INTELLIGENCE = 0;

    public PlateArmor(int level) {
        this.level = level;
        this.health = 30;
        this.strength = 3;
        this.dexterity = 1;
        this.intelligence = 0;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public int getDexterity() {
        return this.dexterity;
    }

    @Override
    public int getIntelligence() {
        return this.intelligence;
    }

    @Override
    public int getSCALE_HEALTH() {
        return this.SCALE_HEALTH;
    }

    @Override
    public int getSCALE_STRENGTH() {
        return this.SCALE_STRENGTH;
    }

    @Override
    public int getSCALE_DEXTERITY() {
        return this.SCALE_DEXTERITY;
    }

    @Override
    public int getSCALE_INTELLIGENCE() {
        return this.SCALE_INTELLIGENCE;
    }


}
