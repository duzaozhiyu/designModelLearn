package com.hym.prototypestudy;

import java.io.Serializable;

/**
 *  用于克隆测试
 */
public class Apple implements  Cloneable, Serializable {
    private String nameType;
    private String color;
    private boolean isWillDown;
    public Apple(String nameType,String color,boolean isWillDown){
        this.nameType=nameType;
        this.color=color;
        this.isWillDown=isWillDown;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return nameType+"、"+color+"、"+isWillDown;
    }
}
