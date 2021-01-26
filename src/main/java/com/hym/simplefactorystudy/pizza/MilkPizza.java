package com.hym.simplefactorystudy.pizza;

public class MilkPizza extends Pizza {
    public void preparePizza() {
        System.out.println("准备制作"+getPizzaName()+"的材料");
    }
}
