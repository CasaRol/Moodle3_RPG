package com.experis.weapons;

public abstract class Magic implements Weapon {

    int baseDamage = 25;
    int scale = 2;
    String type = "Magic";

    public String getType() {
        return this.type;
    }
}
