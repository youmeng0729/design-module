package com.sqq.design.builder.absBuilder;

import com.sqq.design.builder.product.House;

public abstract class HouseBuilder {
    private House house = new House();

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public House buildHouse() {
        return house;
    }

}
