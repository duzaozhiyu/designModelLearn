package com.hym.abstractfactorystudy.pizza;

public abstract class Pizza {

    protected  String pizzaName;

    public void setPizzaName(String nameType){
        this.pizzaName=nameType;
    }

    public String getPizzaName(){
        return pizzaName;
    }

    public abstract void preparePizza();

    public void backPizza(){

            System.out.println("制作Pizza");

    }

    public void cutPizza(){
        System.out.println("裁切Pizza");
    }

    public void boxPizza(){
        System.out.println("打包Pizza");
    }
}
