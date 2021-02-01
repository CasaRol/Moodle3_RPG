package com.experis.weapons;

public class WeaponFactory {

    public Weapon getWeapon(String type, int level) {
        if(type == null) {
            return null;
        }

        if(type.equalsIgnoreCase("TWO_HANDED_SWORD")) {
            return new TwoHandedSword(level);
        } else if(type.equalsIgnoreCase("LESSER_MAGIC_WAND")) {
            return new LesserMagicWand(level);
        } else if(type.equalsIgnoreCase("PHILOSOPHER")) {
            return new Philosopher(level);
        }

        return null;
    }
}
