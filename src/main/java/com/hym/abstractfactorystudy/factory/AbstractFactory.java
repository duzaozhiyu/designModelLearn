package com.hym.abstractfactorystudy.factory;

import com.hym.abstractfactorystudy.pizza.Pizza;

public interface AbstractFactory {
   Pizza createPizza(String type);
}
