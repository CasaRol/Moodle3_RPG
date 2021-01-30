package com.experis.heros;

public class Ranger extends Hero{

    String type = "Ranger";

    public Ranger() {
        super(120, 5, 10, 2);
    }

    public void attack() {
        if(this.weapon == null) {
            System.out.println(this.type + " attacks for " + damage + "HP using 'Bare Fists' (Equip weapon to deal damage)");
        } else {
            System.out.println(this.type + " attacks for " + damage + "HP using " + this.weapon.getType());
        }
    }

    @Override
    public void levelUp() {
        setLevel(level += 1);
        setHealth(health += 20);
        setStrength(strength += 2);
        setDexterity(dexterity += 5);
        setIntelligence(intelligence += 1);
    }
}
