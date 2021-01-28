package com.experis;

import com.experis.amor.ClothArmor;
import com.experis.amor.LeatherArmor;
import com.experis.amor.PlateArmor;
import com.experis.heros.Hero;
import com.experis.heros.Mage;
import com.experis.heros.Ranger;
import com.experis.heros.Warrior;
import com.experis.weapons.LesserMagicWand;
import com.experis.weapons.TwoHandedSword;
import com.experis.weapons.Weapon;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Hero test = new Warrior();
        test.addWeapon(new LesserMagicWand(5));

        LesserMagicWand lmw = new LesserMagicWand(5);
        System.out.println("Item stats for: " + lmw.getName());
        System.out.println("Weapon type: " + lmw.getType());
        System.out.println("Weapon level: " + lmw.getLevel());
        System.out.println("Damage: " + lmw.getDamage());

        test.addWeapon(lmw);

        System.out.println(test.getWeapon().getName());
        System.out.println(test.getWeapon().getLevel());

        test.attack();
        test.setExp(1000);
        System.out.println(test.getLevel());

        test.attack();
        System.out.println("________________________________________________________________________________");
        display display = new display();

        display.diplayLeveling();

        //Armor showcasing - Begin
/*
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

 */

        //Armor showcasing - End





    }


}
