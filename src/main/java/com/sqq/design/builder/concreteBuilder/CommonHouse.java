package com.sqq.design.builder.concreteBuilder;

import com.sqq.design.builder.absBuilder.HouseBuilder;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("Common Basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("Common Wall");
    }

    @Override
    public void roofed() {
        System.out.println("Common roofed");
    }
}
