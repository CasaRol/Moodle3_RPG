package com.experis.heros;

public class Mage extends Hero{

    String type = "Mage";


    public Mage() {
        super(100, 2, 3, 10);
    }

    @Override
    public void attack() {
        //Attacking based on weapon type
        //could be done smarter
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
        //Updates stats when leveling up
        setLevel(level += 1);
        setHealth(health += 15);
        setStrength(strength += 1);
        setDexterity(dexterity += 2);
        setIntelligence(intelligence += 5);
    }
}
