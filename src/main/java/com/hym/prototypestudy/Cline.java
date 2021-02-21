package com.hym.prototypestudy;

public class Cline {
    public static void main(String args[]){
        DeepCloneApple dca=new DeepCloneApple("胖迪",20,new Apple("小苹果","Red",true));
        System.out.println(dca.toString()+dca.hashCode());
        System.out.println("--------------------");
        DeepCloneApple dcaClone= null;
        try {
            dcaClone = (DeepCloneApple) dca.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(dcaClone.toString()+dcaClone.hashCode());

        System.out.println("----------------------");
        //深度克隆
        DeepCloneApple dcaCloneTow=(DeepCloneApple)dca.deepClone();
        System.out.println(dcaCloneTow.toString()+dcaCloneTow.hashCode());
    }
}
