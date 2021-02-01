package com.experis;

import com.experis.amor.*;
import com.experis.heros.*;
import com.experis.weapons.*;

public class display {

    HeroFactory heroFactory = new HeroFactory();
    ArmorFactory armorFactory = new ArmorFactory();
    WeaponFactory weaponFactory = new WeaponFactory();

    public void displayLeveling() {
        Hero warrior = heroFactory.getHero("WARRIOR");
        Hero mage = heroFactory.getHero("MAGE");
        Hero ranger = heroFactory.getHero("RANGER");

        System.out.println("Warrior details (plain):");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));

        System.out.println(" ");
        warrior.setExp(1207);
        System.out.println("Rewarding given: 1207exp");
        System.out.println(" ");

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

        System.out.println(" ");
        mage.setExp(1207);
        System.out.println("Rewarding given: 1207exp");
        System.out.println(" ");

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

        System.out.println(" ");
        ranger.setExp(1207);
        System.out.println("Rewarding given: 1207exp");
        System.out.println(" ");

        System.out.println("Ranger details (leveled):");
        System.out.println("HP: " + ranger.getHealth());
        System.out.println("Str: " + ranger.getStrength());
        System.out.println("Dex: " + ranger.getDexterity());
        System.out.println("Int: " + ranger.getIntelligence());
        System.out.println("Lvl: " + ranger.getLevel());
        System.out.println("XP to next: " + (ranger.getMaxExp() - ranger.getExp()));
    }

    public void createItems() {

        System.out.println("ARMOR");

        Armor cloth = armorFactory.getArmor("FABRIC_HAT", 5);
        System.out.println("Item stats for: " + cloth.getName());
        System.out.println("Armor type: " + cloth.getType());
        System.out.println("Armor level: " + cloth.getLevel());
        System.out.println("Bonus HP: +" + cloth.getSCALE_HEALTH());
        System.out.println("Bonus Str: +" + cloth.getSCALE_STRENGTH());
        System.out.println("Bonus Dex: +" + cloth.getSCALE_DEXTERITY());
        System.out.println("Bonus intel: +" + cloth.getSCALE_INTELLIGENCE());

        System.out.println(" ");

        Armor leather = armorFactory.getArmor("LEATHER_LEGGINGS", 10);
        System.out.println("Item stats for: " + leather.getName());
        System.out.println("Armor type: " + leather.getType());
        System.out.println("Armor level: " + leather.getLevel());
        System.out.println("Bonus HP: +" + leather.getSCALE_HEALTH());
        System.out.println("Bonus Str: +" + leather.getSCALE_STRENGTH());
        System.out.println("Bonus Dex: +" + leather.getSCALE_DEXTERITY());
        System.out.println("Bonus intel: +" + leather.getSCALE_INTELLIGENCE());

        System.out.println(" ");

        Armor plate = armorFactory.getArmor("IRON_MESH_CHEST", 15);
        System.out.println("Item stats for: " + plate.getName());
        System.out.println("Armor type: " + plate.getType());
        System.out.println("Armor level: " + plate.getLevel());
        System.out.println("Bonus HP: +" + plate.getSCALE_HEALTH());
        System.out.println("Bonus Str: +" + plate.getSCALE_STRENGTH());
        System.out.println("Bonus Dex: +" + plate.getSCALE_DEXTERITY());
        System.out.println("Bonus intel: +" + plate.getSCALE_INTELLIGENCE());

        System.out.println(" ");

        System.out.println("WEAPONS");

        Weapon sword = weaponFactory.getWeapon("TWO_HANDED_SWORD", 5);

        System.out.println("Item stats for: " + sword.getName());
        System.out.println("Weapon type: " + sword.getType());
        System.out.println("Weapon level: " + sword.getLevel());
        System.out.println("Weapon damage: " + sword.getTotalDamage());

        System.out.println(" ");

        Weapon bow = weaponFactory.getWeapon("PHILOSOPHER", 20);

        System.out.println("Item stats for: " + bow.getName());
        System.out.println("Weapon type: " + bow.getType());
        System.out.println("Weapon level: " + bow.getLevel());
        System.out.println("Weapon damage: " + bow.getTotalDamage());

        System.out.println(" ");

        Weapon wand = weaponFactory.getWeapon("LESSER_MAGIC_WAND", 15);

        System.out.println("Item stats for: " + wand.getName());
        System.out.println("Weapon type: " + wand.getType());
        System.out.println("Weapon level: " + wand.getLevel());
        System.out.println("Weapon damage: " + wand.getTotalDamage());
    }

    public void addItemsToHero() {

        System.out.println("ADDING ITEMS TO HERO'S");

        Hero warrior = heroFactory.getHero("WARRIOR");
        Hero mage= heroFactory.getHero("MAGE");
        Hero ranger = heroFactory.getHero("RANGER");

        System.out.println("Warrior details - Before:");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));

        System.out.println("Adding iron mesh chest");
        warrior.addArmor(armorFactory.getArmor("IRON_MESH_CHEST", 2));
        System.out.println("Adding fabric hat");
        warrior.addArmor(armorFactory.getArmor("FABRIC_HAT", 5));
        System.out.println("Adding leather leggings");
        warrior.addArmor(armorFactory.getArmor("LEATHER_LEGGINGS", 1));

        System.out.println("Warrior details - After:");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));

        System.out.println(" ");

        System.out.println("Mage details - Before:");
        System.out.println("HP: " + mage.getHealth());
        System.out.println("Str: " + mage.getStrength());
        System.out.println("Dex: " + mage.getDexterity());
        System.out.println("Int: " + mage.getIntelligence());
        System.out.println("Lvl: " + mage.getLevel());
        System.out.println("XP to next: " + (mage.getMaxExp() - mage.getExp()));

        System.out.println("Adding iron mesh chest");
        mage.addArmor(armorFactory.getArmor("IRON_MESH_CHEST", 2));
        System.out.println("Adding fabric hat");
        mage.addArmor(armorFactory.getArmor("FABRIC_HAT", 5));
        System.out.println("Adding leather leggings");
        mage.addArmor(armorFactory.getArmor("LEATHER_LEGGINGS" , 1));

        System.out.println("Mage details - After:");
        System.out.println("HP: " + mage.getHealth());
        System.out.println("Str: " + mage.getStrength());
        System.out.println("Dex: " + mage.getDexterity());
        System.out.println("Int: " + mage.getIntelligence());
        System.out.println("Lvl: " + mage.getLevel());
        System.out.println("XP to next: " + (mage.getMaxExp() - mage.getExp()));

        System.out.println(" ");

        System.out.println("Ranger details - Before:");
        System.out.println("HP: " + ranger.getHealth());
        System.out.println("Str: " + ranger.getStrength());
        System.out.println("Dex: " + ranger.getDexterity());
        System.out.println("Int: " + ranger.getIntelligence());
        System.out.println("Lvl: " + ranger.getLevel());
        System.out.println("XP to next: " + (ranger.getMaxExp() - ranger.getExp()));

        System.out.println("Adding iron mesh chest");
        ranger.addArmor(armorFactory.getArmor("IRON_MESH_CHEST", 2));
        System.out.println("Adding fabric hat");
        ranger.addArmor(armorFactory.getArmor("FABRIC_HAT", 5));
        System.out.println("Adding leather leggings");
        ranger.addArmor(armorFactory.getArmor("LEATHER_LEGGINGS", 1));

        System.out.println("Ranger details - After:");
        System.out.println("HP: " + ranger.getHealth());
        System.out.println("Str: " + ranger.getStrength());
        System.out.println("Dex: " + ranger.getDexterity());
        System.out.println("Int: " + ranger.getIntelligence());
        System.out.println("Lvl: " + ranger.getLevel());
        System.out.println("XP to next: " + (ranger.getMaxExp() - ranger.getExp()));
    }

    public void changeEquipment() {
        Hero warrior = heroFactory.getHero("WARRIOR");
        warrior.addArmor(armorFactory.getArmor("IRON_MESH_CHEST" ,1));

        System.out.println("Warrior details - Level 1 Armor:");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));

        System.out.println("Adding iron mesh chest");
        warrior.addArmor(armorFactory.getArmor("IRON_MESH_CHEST", 20));

        System.out.println("Warrior details - Level 20 Armor:");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));

        System.out.println("Switching out chest to lower level chest");
        warrior.addArmor(armorFactory.getArmor("IRON_MESH_CHEST", 1));

        System.out.println("Warrior details - Level 1 Armor:");
        System.out.println("HP: " + warrior.getHealth());
        System.out.println("Str: " + warrior.getStrength());
        System.out.println("Dex: " + warrior.getDexterity());
        System.out.println("Int: " + warrior.getIntelligence());
        System.out.println("Lvl: " + warrior.getLevel());
        System.out.println("XP to next: " + (warrior.getMaxExp() - warrior.getExp()));
    }

    public void attacking() {
        Hero mage = heroFactory.getHero("MAGE");

        mage.attack();

        Weapon weapon = weaponFactory.getWeapon("LESSER_MAGIC_WAND", 5);
        mage.addWeapon(weapon);

        System.out.println("Giving Mage '" + weapon.getName() + "' level " + weapon.getLevel() + "!");

        System.out.println("Attacking again...");
        mage.attack();
    }

}