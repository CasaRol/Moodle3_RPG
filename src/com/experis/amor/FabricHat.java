package com.experis.amor;

public class FabricHat extends ClothArmor {

    private String placement;
    private String name;

    public FabricHat(int level) {
        super(level);
        this.placement = "HEAD";
        this.name = "Fabric hat";
    }

    public String getPlacement() {
        return this.placement;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
