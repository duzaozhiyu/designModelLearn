package com.hym.simplefactorystudy;

import com.hym.simplefactorystudy.pizza.GreesPizza;
import com.hym.simplefactorystudy.pizza.MilkPizza;
import com.hym.simplefactorystudy.pizza.Pizza;

public class SimpeFactory {

    public static Pizza getPizza(String pizzaType){
        if(pizzaType.equals("grees")){
            return new GreesPizza();
        }else if(pizzaType.equals("milk")){
            return new MilkPizza();
        }
        return null;
    }
}
