package com.experis.amor;

public class LeatherArmor implements Armor {

    private int level;
    private String type;
    private int health;
    private int strength;
    private int dexterity;
    private int intelligence;

    private final int SCALE_HEALTH = 8;
    private final int SCALE_STRENGTH = 1;
    private final int SCALE_DEXTERITY = 2;
    private final int SCALE_INTELLIGENCE = 0;

    public LeatherArmor(int level) {
        this.level = level;
        this.type = "Leather Armor";
        this.health = 20;
        this.strength = 1;
        this.dexterity = 3;
        this.intelligence = 0;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public String getType() {
        return this.type;
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

    public int getSCALE_HEALTH() {
        return SCALE_HEALTH * level;
    }

    public int getSCALE_STRENGTH() {
        return SCALE_STRENGTH * level;
    }

    public int getSCALE_DEXTERITY() {
        return SCALE_DEXTERITY * level;
    }

    public int getSCALE_INTELLIGENCE() {
        return SCALE_INTELLIGENCE * level;
    }
}
