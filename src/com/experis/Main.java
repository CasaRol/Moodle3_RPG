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

        Armor plateArmor = new IronMeshChest(5);
        System.out.println(plateArmor.getType());
        test.addArmor(plateArmor);

        Armor clothArmor = new FabricHat(5);
        System.out.println(clothArmor.getType());

        Armor leatherArmor = new LeatherLeggings(5);
        System.out.println(leatherArmor.getType());

        Weapon lmw = new LesserMagicWand(5);
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

        display.displayLeveling();

        display.createItems();

        //Armor showcasing - Begin


        //Armor showcasing - End





    }


}
