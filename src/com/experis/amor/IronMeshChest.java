package com.experis.amor;

public class IronMeshChest extends PlateArmor {

    String placement;
    String name;

    public IronMeshChest(int level) {
        super(level);
        this.placement = "BODY";
        this.name = "Iron Mesh";
    }

    @Override
    public String getPlacement() {
        return this.placement;
    }

    @Override
    public String getName() {
        return this.name;
    }


}
