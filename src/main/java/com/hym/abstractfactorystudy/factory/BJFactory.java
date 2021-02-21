package com.hym.abstractfactorystudy.factory;

import com.hym.abstractfactorystudy.pizza.BJGreesPizza;
import com.hym.abstractfactorystudy.pizza.BJMilkPizza;
import com.hym.abstractfactorystudy.pizza.Pizza;

public class BJFactory implements AbstractFactory {
    public Pizza createPizza(String type) {
        if("grees".equals(type)){
            return new BJGreesPizza();
        }else if("milk".equals(type)){
            return new BJMilkPizza();
        }
        return null;
    }
}
