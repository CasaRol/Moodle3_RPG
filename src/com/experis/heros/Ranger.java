package com.experis.heros;

public class Ranger extends Hero{

    String type = "Ranger";

    public Ranger() {
        super(120, 5, 10, 2);
    }

    @Override
    public void attack() {
        if(this.weapon == null) {
            System.out.println(this.type + " attacks for " + damage + "HP using 'Bare Fists' (Equip weapon to deal damage)");
        } else {
            if(weapon.getType().equalsIgnoreCase("Melee")) {
                System.out.println(this.type + " attacks for " + (damage + (1.5 * this.strength)) + "HP using " + this.weapon.getType());
            } else if(weapon.getType().equalsIgnoreCase("Ranged")) {
                System.out.println(this.type + " attacks for " + (damage + Math.round(2 * this.dexterity)) + "HP using " + this.weapon.getType());
            } else if(weapon.getType().equalsIgnoreCase("Magic")) {
                System.out.println(this.type + " attacks for " + (damage + Math.round(3 * this.intelligence)) + "HP using " + this.weapon.getType());
            }
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
