package com.experis;

import com.experis.amor.*;
import com.experis.heros.Hero;
import com.experis.heros.Mage;
import com.experis.heros.Ranger;
import com.experis.heros.Warrior;
import com.experis.weapons.LesserMagicWand;
import com.experis.weapons.Philosopher;
import com.experis.weapons.TwoHandedSword;
import com.experis.weapons.Weapon;

public class display {

    private final Hero warrior = new Warrior();
    private final Hero mage= new Mage();
    private final Hero ranger = new Ranger();

    public void displayLeveling() {
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

    public void createItems() {

        System.out.println("ARMOR");

        Armor cloth = new FabricHat(5);
        System.out.println("Item stats for: " + cloth.getName());
        System.out.println("Armor type: " + cloth.getType());
        System.out.println("Armor level: " + cloth.getLevel());
        System.out.println("Bonus HP: +" + cloth.getSCALE_HEALTH());
        System.out.println("Bonus Str: +" + cloth.getSCALE_STRENGTH());
        System.out.println("Bonus Dex: +" + cloth.getSCALE_DEXTERITY());
        System.out.println("Bonus intel: +" + cloth.getSCALE_INTELLIGENCE());

        System.out.println(" ");

        Armor leather = new LeatherLeggings(10);
        System.out.println("Item stats for: " + leather.getName());
        System.out.println("Armor type: " + leather.getType());
        System.out.println("Armor level: " + leather.getLevel());
        System.out.println("Bonus HP: +" + leather.getSCALE_HEALTH());
        System.out.println("Bonus Str: +" + leather.getSCALE_STRENGTH());
        System.out.println("Bonus Dex: +" + leather.getSCALE_DEXTERITY());
        System.out.println("Bonus intel: +" + leather.getSCALE_INTELLIGENCE());

        System.out.println(" ");

        Armor plate = new IronMeshChest(15);
        System.out.println("Item stats for: " + plate.getName());
        System.out.println("Armor type: " + plate.getType());
        System.out.println("Armor level: " + plate.getLevel());
        System.out.println("Bonus HP: +" + plate.getSCALE_HEALTH());
        System.out.println("Bonus Str: +" + plate.getSCALE_STRENGTH());
        System.out.println("Bonus Dex: +" + plate.getSCALE_DEXTERITY());
        System.out.println("Bonus intel: +" + plate.getSCALE_INTELLIGENCE());

        System.out.println(" ");

        System.out.println("WEAPONS");

        Weapon sword = new TwoHandedSword(5);

        System.out.println("Item stats for: " + sword.getName());
        System.out.println("Weapon type: " + sword.getType());
        System.out.println("Weapon level: " + sword.getLevel());
        System.out.println("Weapon damage: " + sword.getTotalDamage());

        System.out.println(" ");

        Weapon bow = new Philosopher(20);

        System.out.println("Item stats for: " + bow.getName());
        System.out.println("Weapon type: " + bow.getType());
        System.out.println("Weapon level: " + bow.getLevel());
        System.out.println("Weapon damage: " + bow.getTotalDamage());

        System.out.println(" ");

        Weapon wand = new LesserMagicWand(15);

        System.out.println("Item stats for: " + wand.getName());
        System.out.println("Weapon type: " + wand.getType());
        System.out.println("Weapon level: " + wand.getLevel());
        System.out.println("Weapon damage: " + wand.getTotalDamage());

    }

    public void addItemsToHero() {
        System.out.println("Warrior details - Before:");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));

        warrior.addArmor(new IronMeshChest(5));
        //warrior.addArmor(new FabricHat(20));

        System.out.println("Warrior details - After:");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));
    }


}
