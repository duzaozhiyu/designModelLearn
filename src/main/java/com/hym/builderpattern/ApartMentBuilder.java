package com.hym.builderpattern;

public class ApartMentBuilder extends Builder {

    public void bulidWall() {
        this.hp.setWall("30米宽高");
        System.out.println("建造公寓的墙为"+this.hp.wall);
    }

    public void buildGround() {
        this.hp.setGround("5米深");
        System.out.println("建造公寓的墙为"+this.hp.getGround());
    }

    public void buildRoof() {
        this.hp.setRoof("平顶");
        System.out.println("建造公寓的墙为"+this.hp.getRoof());
    }

}
