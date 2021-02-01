package com.experis.heros;

public class HeroFactory {

    public Hero getHero(String type) {
        if(type == null) {
            return null;
        }

        if(type.equalsIgnoreCase("WARRIOR")) {
            return new Warrior();
        } else if(type.equalsIgnoreCase("MAGE")){
            return new Mage();
        } else if(type.equalsIgnoreCase("RANGER")) {
            return new Ranger();
        }

        return null;
    }
}
