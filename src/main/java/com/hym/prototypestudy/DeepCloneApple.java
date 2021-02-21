package com.hym.prototypestudy;


import java.io.*;

/**
 * 通过重写Clone 实现深度克隆
 */
public class DeepCloneApple implements Serializable,Cloneable {

    private String nameType;
    private int num;
    private Apple apple;

    public DeepCloneApple(String nameType,int num,Apple apple){
        this.nameType=nameType;
        this.num=num;
        this.apple=apple;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloneApple dca=(DeepCloneApple) super.clone();
        dca.apple=(Apple)apple.clone();
        return dca;
    }

    //深度克隆方法
    protected Object deepClone(){
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;

        try{
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            Object obj= null;
            try {
                obj = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }
            return obj;
        }catch(IOException ioe){
            ioe.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return nameType+"、"+num+"、"+apple.toString();
    }
}
