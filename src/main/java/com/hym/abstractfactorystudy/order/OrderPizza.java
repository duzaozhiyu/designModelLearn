package com.hym.abstractfactorystudy.order;

import com.hym.abstractfactorystudy.factory.AbstractFactory;
import com.hym.abstractfactorystudy.factory.BJFactory;
import com.hym.abstractfactorystudy.factory.LDFactory;
import com.hym.abstractfactorystudy.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {


    public OrderPizza(AbstractFactory factory) {
        System.out.println("预定Pizza,请输入要预定的Pizza类型");
        do {
            boolean flag = orderPizza(factory.getClass(), getPizzaType());
            if (!flag) {
                System.out.println("没有这种类型的Pizza,预定结束");
                break;
            }
        } while (true);

    }

    private boolean orderPizza(Class c, String pizzaType) {
        AbstractFactory factory = null;
        if (c.getSimpleName().equals("LDFactory")) {
            factory = new LDFactory();
        }
        if (c.getSimpleName().equals("BJFactory")) {
            factory = new BJFactory();
        }
        Pizza pizza = factory.createPizza(pizzaType);
        if (null != pizza) {
            pizza.preparePizza();
            pizza.backPizza();

            pizza.cutPizza();
            pizza.boxPizza();
            return true;
        }
        return false;
    }

    private String getPizzaType() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String strLine = reader.readLine();
            return strLine;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        return null;
    }
}
