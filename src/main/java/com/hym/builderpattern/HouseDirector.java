package com.hym.builderpattern;

public class HouseDirector {

    private Builder builder=null;
    public HouseDirector(Builder builder){
        this.builder=builder;
    }

    public HouseProduct constructHouse(){
        builder.buildGround();
        builder.bulidWall();
        builder.buildRoof();
        return builder.getHouseProduct();
    }
}
