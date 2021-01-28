package com.experis;

import com.experis.amor.ClothArmor;
import com.experis.amor.LeatherArmor;
import com.experis.amor.PlateArmor;
import com.experis.heros.Warrior;
import com.experis.weapons.TwoHandedSword;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Warrior warrior = new Warrior();

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

        //leveling showcased - End

        //Armor showcasing - Begin

        warrior.addArmorBody(new PlateArmor(1));
        warrior.addArmorHead(new ClothArmor(5));
        warrior.addArmorLegs(new LeatherArmor(3));


        System.out.println("Warrior details (armored):");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));



        warrior.addWeapon(new TwoHandedSword(5));

        warrior.attack();

        //Armor showcasing - End





    }
}
