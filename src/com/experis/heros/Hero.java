package com.experis.heros;

import com.experis.amor.Armor;
import com.experis.weapons.Weapon;

public abstract class Hero {

    int health;
    int strength;
    int dexterity;
    int intelligence;
    int level;
    double exp;
    double maxExp;
    Weapon weapon;
    Armor head;
    Armor body;
    Armor legs;
    int damage;


    public Hero(int health, int strength, int dexterity, int intelligence) {
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.level = 1;
        this.exp = 0;
        this.maxExp = 100;
        /*
        this.weapon = null;
        this.head = null;
        this.body = null;
        this.legs = null;

         */
    }

    public void levelUp() {
        this.level += 1;
    }

    public void attack() {
        System.out.println("Hero attacked for " + damage + "HP using " + this.weapon.getType());
    }

    private void addArmorStats(Armor armor, String placement) {

        int health = 0;
        int strength = 0;
        int intelligence = 0;
        int dexterity = 0;
        int level = armor.getLevel();

        if(placement.equalsIgnoreCase("BODY")) {
            health = armor.getHealth() + (level * armor.getSCALE_HEALTH());
            setHealth(this.health += health);

            strength = armor.getStrength() + (level * armor.getSCALE_STRENGTH());
            setStrength(this.strength += strength);

            intelligence = armor.getIntelligence() + (level * armor.getSCALE_INTELLIGENCE());
            setIntelligence(this.intelligence += intelligence);

            dexterity = armor.getDexterity() + (level * armor.getSCALE_DEXTERITY());
            setDexterity(this.dexterity += dexterity);
        }

        if(placement.equalsIgnoreCase("HEAD")) {
            health = (int) (armor.getHealth() + Math.floor((level * armor.getSCALE_HEALTH()) * 0.8));
            setHealth(this.health += health);

            strength = (int) (armor.getStrength() + Math.floor((level * armor.getSCALE_STRENGTH()) * 0.8));
            setStrength(this.strength += strength);

            intelligence = (int) (armor.getIntelligence() + Math.floor((level * armor.getSCALE_INTELLIGENCE()) * 0.8));
            setIntelligence(this.intelligence += intelligence);

            dexterity = (int) (armor.getDexterity() + Math.floor((level * armor.getSCALE_DEXTERITY()) * 0.8));
            setDexterity(this.dexterity += dexterity);
        }

        if(placement.equalsIgnoreCase("LEGS")) {
            health = (int) (armor.getHealth() + Math.floor((level * armor.getSCALE_HEALTH()) * 0.6));
            setHealth(this.health += health);

            strength = (int) (armor.getStrength() + Math.floor((level * armor.getSCALE_STRENGTH()) * 0.6));
            setStrength(this.strength += strength);

            intelligence = (int) (armor.getIntelligence() + Math.floor((level * armor.getSCALE_INTELLIGENCE()) * 0.6));
            setIntelligence(this.intelligence += intelligence);

            dexterity = (int) (armor.getDexterity() + Math.floor((level * armor.getSCALE_DEXTERITY()) * 0.6));
            setDexterity(this.dexterity += dexterity);
        }
    }

    private void addWeaponStats(Weapon weapon) {
        this.damage = (int) Math.round(weapon.getTotalDamage() + (strength * 1.5));
    }

    public void addWeapon(Weapon weapon) {
        System.out.println("Hero damage before = " + this.damage);
        addWeaponStats(weapon);
        System.out.println("Hero damage = " + this.damage);
        this.weapon = weapon;
    }

    public void addArmorHead(Armor armor) {
        addArmorStats(armor, "HEAD");
        this.head = armor;

    }

    public void addArmorBody(Armor armor) {
        addArmorStats(armor, "BODY");
        this.body = armor;
    }

    public void addArmorLegs(Armor armor) {
        addArmorStats(armor, "LEGS");
        this.legs = armor;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        if(exp > maxExp) {

            while (exp >= maxExp) {
                this.exp = (exp -= maxExp);

                levelUp();

                setMaxExp(Math.round(maxExp * 1.1));

            }
        } else {
            this.exp += exp;
        }
    }

    public double getMaxExp() {
        return maxExp;
    }

    public void setMaxExp(double maxExp) {
        this.maxExp = maxExp;
    }
}
