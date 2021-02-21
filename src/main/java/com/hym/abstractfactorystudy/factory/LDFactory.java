package com.hym.abstractfactorystudy.factory;

import com.hym.abstractfactorystudy.pizza.*;

public class LDFactory implements AbstractFactory {
    public Pizza createPizza(String type) {
        if("grees".equals(type)){
            return new LDGreesPizza();
        }else if("milk".equals(type)){
            return new LDMilkPizza();
        }
        return null;
    }
}
