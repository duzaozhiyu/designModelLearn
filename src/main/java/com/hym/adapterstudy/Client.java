package com.hym.adapterstudy;

public class Client {

    public static void main(String args[]){
        Phone phone =new Phone();
        phone.charge(new VoltageLeveLAdapter());
    }
}
