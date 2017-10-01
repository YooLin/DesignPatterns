package com.lyc.templet.extend;

/**
 * @Author YooLin
 * @Date 2017/8/9 15:49
 * @Description 悍马1号模型 开启喇叭
 */
public class HummerModel1 extends HummerModel {

    private boolean alarmFlag = true;//默认开启

    @Override
    protected void start() {
        System.out.println("悍马1号模型启动...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马1号模型引擎轰鸣...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马1号模型喇叭鸣叫...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马1号模型停车...");
    }

    //钩子方法，悍马1号模型开启喇叭
    @Override
    protected boolean isAlarm() {
        return alarmFlag;
    }

    //手动设置是否响喇叭
    public void setAlarm(boolean isAlarm){
        alarmFlag = isAlarm;
    }
}
