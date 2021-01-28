package com.experis.weapons;

public abstract class Melee implements Weapon {

    int baseDamage = 15;
    int scale = 2;
    String type = "Melee";

    public String getType() {
        return this.type;
    }


}
