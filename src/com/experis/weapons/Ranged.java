package com.experis.weapons;

public abstract class Ranged implements Weapon {

       int baseDamage = 5;
       int scale = 3;
       String type = "Ranged";

       public String getType() {
              return this.type;
       }
}
