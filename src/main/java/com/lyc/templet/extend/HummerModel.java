package com.lyc.templet.extend;

/**
 * @Author YooLin
 * @Date 2017/8/9 15:44
 * @Description 模板模式 悍马模板
 */
public abstract class HummerModel {

    protected abstract void start();//基本方法：由子类具体实现，在模板方法被调用

    protected abstract void engineBoom();//基本方法

    protected abstract void alarm();//基本方法

    protected abstract void stop();//基本方法

    //为防止模板方法被覆盖加上final关键字修饰
    protected final void run() {//模板方法：调用基本方法实现固定操作
        this.start();
        this.engineBoom();
        if (isAlarm()) {
            //开启喇叭后才可以鸣叫
            this.alarm();
        }
        this.stop();
    }

    //是否开启喇叭，默认不开启
    protected boolean isAlarm() {
        return false;
    }
}
