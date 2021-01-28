package com.experis.amor;

public abstract class PlateArmor implements Armor {

    private int level;
    private String type;
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
        this.type = "Plate Armor";
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

    @Override
    public int getSCALE_HEALTH() {
        return this.SCALE_HEALTH * level;
    }

    @Override
    public int getSCALE_STRENGTH() {
        return this.SCALE_STRENGTH * level;
    }

    @Override
    public int getSCALE_DEXTERITY() {
        return this.SCALE_DEXTERITY * level;
    }

    @Override
    public int getSCALE_INTELLIGENCE() {
        return this.SCALE_INTELLIGENCE * level;
    }

    @Override
    public String getPlacement() {
        return null;
    }


}
