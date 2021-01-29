package com.experis;

import com.experis.amor.*;
import com.experis.heros.Hero;
import com.experis.heros.Warrior;
import com.experis.weapons.LesserMagicWand;
import com.experis.weapons.Weapon;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Hero test = new Warrior();
        test.addWeapon(new LesserMagicWand(5));

        System.out.println("test details:");
        System.out.println("HP: " + test.getHealth());
        System.out.println("Str: " + test.getStrength());
        System.out.println("Dex: " + test.getDexterity());
        System.out.println("Int: " + test.getIntelligence());
        System.out.println("Lvl: " + test.getLevel());
        System.out.println("XP to next: " + (test.getMaxExp() - test.getExp()));

        Armor plateArmor = new IronMeshChest(19);

        test.addArmor(plateArmor);
        System.out.println("ARMOR " + test.getBody().getPlacement());

        System.out.println("test details: ");
        System.out.println("HP: " + test.getHealth());
        System.out.println("Str: " + test.getStrength());
        System.out.println("Dex: " + test.getDexterity());
        System.out.println("Int: " + test.getIntelligence());
        System.out.println("Lvl: " + test.getLevel());
        System.out.println("XP to next: " + (test.getMaxExp() - test.getExp()));

        Armor newPlate = new IronMeshChest(1);
        test.addArmor(newPlate);

        System.out.println("test details:");
        System.out.println("HP: " + test.getHealth());
        System.out.println("Str: " + test.getStrength());
        System.out.println("Dex: " + test.getDexterity());
        System.out.println("Int: " + test.getIntelligence());
        System.out.println("Lvl: " + test.getLevel());
        System.out.println("XP to next: " + (test.getMaxExp() - test.getExp()));

        Armor clothArmor = new FabricHat(5);
        System.out.println(clothArmor.getType());

        Armor leatherArmor = new LeatherLeggings(5);
        System.out.println(leatherArmor.getType());

        Weapon lmw = new LesserMagicWand(5);

        test.addWeapon(lmw);

        System.out.println(test.getWeapon().getName());
        System.out.println(test.getWeapon().getLevel());

        test.attack();
        test.setExp(1000);
        System.out.println(test.getLevel());

        /*

        test.attack();
        System.out.println("________________________________________________________________________________");

        display display = new display();

        display.displayLeveling();

        display.createItems();

        display.addItemsToHero();



         */



    }


}
