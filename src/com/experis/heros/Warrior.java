package com.experis.heros;

public class Warrior extends Hero {

    String type = "Warrior";


    public Warrior() {
        super(150, 10, 3, 1);
    }

    public void attack() {
        if(this.weapon == null) {
            System.out.println(this.type + " attacked for " + damage + "HP using 'Bare Fists' (Equip weapon to deal damage)");
        } else {
            System.out.println(this.type + " attacked for " + damage + "HP using " + this.weapon.getType());
        }
    }


    @Override
    public void levelUp() {
        setLevel(level += 1);
        setHealth(health += 30);
        setStrength(strength += 5);
        setDexterity(dexterity += 2);
        setIntelligence(intelligence += 1);
    }
}
