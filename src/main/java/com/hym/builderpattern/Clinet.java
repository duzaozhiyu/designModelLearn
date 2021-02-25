package com.hym.builderpattern;

public class Clinet {

    public static void main(String args[]){
       HouseDirector hd=new HouseDirector(new DatchaBuilder());
       hd.constructHouse();

       System.out.println("-------------------------------");
       hd=new HouseDirector(new ApartMentBuilder());
       hd.constructHouse();
    }
}
