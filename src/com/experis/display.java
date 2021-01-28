package com.experis;

import com.experis.heros.Hero;
import com.experis.heros.Mage;
import com.experis.heros.Ranger;
import com.experis.heros.Warrior;

public class display {

    private Hero warrior = new Warrior();
    private Hero mage= new Mage();
    private Hero ranger = new Ranger();

    public void diplayLeveling() {
        //Leveling showcased - Begin
        System.out.println("Warrior details (plain):");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));

        warrior.setExp(1207);

        System.out.println("Warrior details (leveled):");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));

        System.out.println("__________________");

        System.out.println("Mage details (plain):");
        System.out.println("HP: " + mage.getHealth());
        System.out.println("Str: " + mage.getStrength());
        System.out.println("Dex: " + mage.getDexterity());
        System.out.println("Int: " + mage.getIntelligence());
        System.out.println("Lvl: " + mage.getLevel());
        System.out.println("XP to next: " + (mage.getMaxExp() - mage.getExp()));

        mage.setExp(1207);

        System.out.println("Mage details (leveled):");
        System.out.println("HP: " + mage.getHealth());
        System.out.println("Str: " + mage.getStrength());
        System.out.println("Dex: " + mage.getDexterity());
        System.out.println("Int: " + mage.getIntelligence());
        System.out.println("Lvl: " + mage.getLevel());
        System.out.println("XP to next: " + (mage.getMaxExp() - mage.getExp()));

        System.out.println("__________________");

        System.out.println("Ranger details (plain):");
        System.out.println("HP: " + ranger.getHealth());
        System.out.println("Str: " + ranger.getStrength());
        System.out.println("Dex: " + ranger.getDexterity());
        System.out.println("Int: " + ranger.getIntelligence());
        System.out.println("Lvl: " + ranger.getLevel());
        System.out.println("XP to next: " + (ranger.getMaxExp() - ranger.getExp()));

        ranger.setExp(1207);

        System.out.println("Ranger details (leveled):");
        System.out.println("HP: " + ranger.getHealth());
        System.out.println("Str: " + ranger.getStrength());
        System.out.println("Dex: " + ranger.getDexterity());
        System.out.println("Int: " + ranger.getIntelligence());
        System.out.println("Lvl: " + ranger.getLevel());
        System.out.println("XP to next: " + (ranger.getMaxExp() - ranger.getExp()));

        //leveling showcased - End

    }
}
