package com.experis.amor;

public class LeatherLeggings extends LeatherArmor {

    String placement;
    String name;

    public LeatherLeggings(int level) {
        super(level);
        this.placement = "LEGS";
        this.name = "Leather leggings";
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
