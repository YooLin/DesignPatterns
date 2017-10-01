package com.lyc.templet;

/**
 * @Author YooLin
 * @Date 2017/8/9 15:44
 * @Description 悍马模板
 * 模板模式：定义一个操作中的算法的框架，而将一些步骤延迟到子类中。
 * 使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
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
        this.alarm();
        this.stop();
    }

}
