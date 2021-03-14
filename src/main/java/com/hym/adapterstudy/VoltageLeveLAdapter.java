package com.hym.adapterstudy;

/**
 *  类适配器模式
 */
public class VoltageLeveLAdapter extends VoltageTwoV implements VoltageFiveV {

    public int getVoltageVLevel() {
        int voltageTwo=getVoltageTowVLevel();
        System.out.println("转换为："+5+"V电压");
        int voltage=voltageTwo/44;
        return voltage;
    }
}
