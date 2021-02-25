package com.hym.builderpattern;

public class DatchaBuilder extends Builder {
    public void bulidWall() {
        this.hp.setWall("30米宽高");
        System.out.println("建造乡间邸宅的墙为"+this.hp.getWall());
    }

    public void buildGround() {
        this.hp.setGround("10米深");
        System.out.println("建造乡间邸宅的地基"+this.hp.getGround());
    }

    public void buildRoof() {
        this.hp.setRoof("三角顶");
        System.out.println("建造乡间邸宅的屋顶"+this.hp.getRoof());
    }

}
