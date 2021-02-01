package com.experis.amor;

public class ArmorFactory {

    public Armor getArmor(String type, int level) {
        if(type == null) {
            return null;
        }

        if(type.equalsIgnoreCase("FABRIC_HAT")) {
            return new FabricHat(level);
        } else if(type.equalsIgnoreCase("IRON_MESH_CHEST")) {
            return new IronMeshChest(level);
        } else if(type.equalsIgnoreCase("LEATHER_LEGGINGS")) {
            return new LeatherLeggings(level);
        }

        return null;
    }
}
