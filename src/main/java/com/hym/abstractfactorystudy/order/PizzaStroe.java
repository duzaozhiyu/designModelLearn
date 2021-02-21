package com.hym.abstractfactorystudy.order;

import com.hym.abstractfactorystudy.factory.BJFactory;

public class PizzaStroe {

    public static void main(String []args){
         new OrderPizza(new BJFactory());
    }
}
