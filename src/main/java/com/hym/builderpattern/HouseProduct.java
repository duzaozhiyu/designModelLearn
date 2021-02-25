package com.hym.builderpattern;

public  class HouseProduct {

    String wall;

    String ground;

    String roof;

    public HouseProduct(String wall,String ground,String roof){
        this.wall=wall;
        this.ground=ground;
        this.roof=roof;
    }

    public HouseProduct(){

    };

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}
