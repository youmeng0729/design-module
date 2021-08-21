package com.sqq.design.builder;

import com.sqq.design.builder.concreteBuilder.CommonHouse;
import com.sqq.design.builder.concreteBuilder.HighHouse;
import com.sqq.design.builder.director.HouseDirector;
import com.sqq.design.builder.product.House;

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        HighHouse highBuilding = new HighHouse();
        houseDirector.setHouseBuilder(highBuilding);
        houseDirector.constructHouse();
    }
}
