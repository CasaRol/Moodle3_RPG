package com.experis.heros;

public class Mage extends Hero{

    String type = "Mage";


    public Mage() {
        super(100, 2, 3, 10);
    }

    @Override
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
        setHealth(health += 15);
        setStrength(strength += 1);
        setDexterity(dexterity += 2);
        setIntelligence(intelligence += 5);
    }
}
