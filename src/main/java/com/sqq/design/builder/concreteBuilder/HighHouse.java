package com.sqq.design.builder.concreteBuilder;

import com.sqq.design.builder.absBuilder.HouseBuilder;

public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("HighHouse Basic");
    }

    @Override
    public void buildWalls() {
        System.out.println("HighHouse Wall");
    }

    @Override
    public void roofed() {
        System.out.println("HighHouse roofed");
    }
}
