package com.hym.builderpattern;

public abstract class Builder {

    protected HouseProduct hp=new HouseProduct();

    public abstract void bulidWall();

    public abstract void buildGround();

    public abstract void buildRoof();

    public  HouseProduct getHouseProduct(){
        return this.hp;
    }
}
