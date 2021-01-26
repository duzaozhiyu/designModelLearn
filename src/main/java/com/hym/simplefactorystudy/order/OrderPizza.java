package com.hym.simplefactorystudy.order;

import com.hym.simplefactorystudy.SimpeFactory;
import com.hym.simplefactorystudy.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {


    public OrderPizza(){
        System.out.println("预定Pizza,请输入要预定的Pizza类型");
        do{
           boolean flag=orderPizza(getPizzaType()) ;
           if(!flag){
               System.out.println("没有这种类型的Pizza,预定结束");
               break;
           }
        }while(true);

    }

    private boolean orderPizza(String pizzaType){
       Pizza pizza= SimpeFactory.getPizza(pizzaType);
       if(null!=pizza){
           pizza.preparePizza();
           pizza.backPizza();
           //pizza.boxPizza();
           pizza.cutPizza();
           pizza.boxPizza();
           return true;
       }
       return false;
    }

    private String getPizzaType(){
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            String strLine=reader.readLine();
            return strLine;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
        return null;
    }
}
