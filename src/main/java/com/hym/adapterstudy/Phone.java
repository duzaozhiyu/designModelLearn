package com.hym.adapterstudy;

public class Phone {

    public void charge(VoltageFiveV vla){
        int v=vla.getVoltageVLevel();
       if(v==5){
           System.out.println("手机充电，电压为："+v);
       }else{
           System.out.println("手机充电，电压不符合");
       }

    }
}
