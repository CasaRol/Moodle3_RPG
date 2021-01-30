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
    int damage = 0;
    String type;


    public Hero(int health, int strength, int dexterity, int intelligence) {
        this.health = health;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.level = 1;
        this.exp = 0;
        this.maxExp = 100;
    }

    public void levelUp() {
        this.level += 1;
    }

    public void attack() {
        //Redundant method body content as method is overwritten by all Hero's
        System.out.println("Overwritten method this should not print");
    }

    private void addArmorStats(Armor armor, String placement) {


        //Removing current stats from armor
        removeArmorStats(placement);


        int health;
        int strength;
        int intelligence;
        int dexterity;

        //Setting new stats
        if(placement.equalsIgnoreCase("BODY")) {
            health = armor.getHealth() + armor.getSCALE_HEALTH();
            setHealth(this.health += health);

            strength = armor.getStrength() + armor.getSCALE_STRENGTH();
            setStrength(this.strength += strength);

            intelligence = armor.getIntelligence() + armor.getSCALE_INTELLIGENCE();
            setIntelligence(this.intelligence += intelligence);

            dexterity = armor.getDexterity() + armor.getSCALE_DEXTERITY();
            setDexterity(this.dexterity += dexterity);
        }

        if(placement.equalsIgnoreCase("HEAD")) {
            health = (int) (armor.getHealth() + (Math.floor(armor.getSCALE_HEALTH()) * 0.8));
            setHealth(this.health += health);

            strength = (int) (armor.getStrength() + (Math.floor(armor.getSCALE_STRENGTH()) * 0.8));
            setStrength(this.strength += strength);

            intelligence = (int) (armor.getIntelligence() + (Math.floor(armor.getSCALE_INTELLIGENCE()) * 0.8));
            setIntelligence(this.intelligence += intelligence);

            dexterity = (int) (armor.getDexterity() + (Math.floor(armor.getSCALE_DEXTERITY()) * 0.8));
            setDexterity(this.dexterity += dexterity);
        }

        if(placement.equalsIgnoreCase("LEGS")) {
            health = (int) (armor.getHealth() + (Math.floor(armor.getSCALE_HEALTH()) * 0.6));
            setHealth(this.health += health);

            strength = (int) (armor.getStrength() + (Math.floor(armor.getSCALE_STRENGTH()) * 0.6));
            setStrength(this.strength += strength);

            intelligence = (int) (armor.getIntelligence() + (Math.floor(armor.getSCALE_INTELLIGENCE()) * 0.6));
            setIntelligence(this.intelligence += intelligence);

            dexterity = (int) (armor.getDexterity() + (Math.floor(armor.getSCALE_DEXTERITY()) * 0.6));
            setDexterity(this.dexterity += dexterity);
        }
    }

    private void addWeaponStats(Weapon weapon) {
        //Removing current weapon stats from Hero
        removeWeaponStats();

        this.damage += (int) Math.round(weapon.getTotalDamage() + (strength * 1.5));
    }

    public void addWeapon(Weapon weapon) {
        addWeaponStats(weapon);
        this.weapon = weapon;
    }

    public void addArmor(Armor armor) {
        if(armor.getPlacement().equalsIgnoreCase("HEAD")) {
            addArmorStats(armor, "HEAD");
            this.head = armor;
        } else if(armor.getPlacement().equalsIgnoreCase("BODY")) {
            addArmorStats(armor, "BODY");
            this.body = armor;
        } else if(armor.getPlacement().equalsIgnoreCase("LEGS")) {
            addArmorStats(armor, "LEGS");
            this.legs = armor;
        } else {
            //Should never reach this
            System.out.println("Incompatible armor type");
        }

    }

    private void removeArmorStats(String placement) {
        if(placement.equalsIgnoreCase("HEAD")) {
            if(head != null) {
                System.out.println("HEAD FOUND EQUIPPED");
                this.health -= (int) (head.getHealth() + (Math.floor(head.getSCALE_HEALTH()) * 0.8));
                this.strength -= (int) (head.getStrength() + (Math.floor(head.getSCALE_STRENGTH()) * 0.8));
                this.intelligence -= (int) (head.getIntelligence() + (Math.floor(head.getSCALE_INTELLIGENCE()) * 0.8));
                this.dexterity -= (int) (head.getDexterity() + (Math.floor(head.getSCALE_DEXTERITY()) * 0.8));
            }
        } else if(placement.equalsIgnoreCase("BODY")) {
            if(body != null) {
                System.out.println("BODY FOUND EQUIPPED");
                this.health -= (body.getHealth() + body.getSCALE_HEALTH());
                this.strength -= (body.getStrength() + body.getSCALE_STRENGTH());
                this.intelligence -= (body.getIntelligence() + body.getSCALE_INTELLIGENCE());
                this.dexterity -= (body.getDexterity() + body.getSCALE_DEXTERITY());
            }
        } else if(placement.equalsIgnoreCase("LEGS")) {
            if(legs != null) {
                System.out.println("LEGS FOUND EQUIPPED");
                this.health -= (int) (legs.getHealth() + (Math.floor(legs.getSCALE_HEALTH()) * 0.6));
                this.strength -= (int) (legs.getStrength() + (Math.floor(legs.getSCALE_STRENGTH()) * 0.6));
                this.intelligence -= (int) (legs.getIntelligence() + (Math.floor(legs.getSCALE_INTELLIGENCE()) * 0.6));
                this.dexterity -= (int) (legs.getDexterity() + (Math.floor(legs.getSCALE_DEXTERITY()) * 0.6));
            }
        }
    }

    private void removeWeaponStats() {
        if(this.weapon != null) {
            this.damage -= (int) Math.round(this.weapon.getTotalDamage() + (strength * 1.5));
        }
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

                //Re-calculating damage for character as long as weapon is equipped
                if(this.weapon != null) {
                    addWeaponStats(this.weapon);
                }

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

    //Redundant test methods below here

    public Weapon getWeapon() {
        return this.weapon;
    }

    public String getWeaponName() {
        return this.weapon.getName();
    }

    public Armor getBody() {
        return this.body;
    }
}