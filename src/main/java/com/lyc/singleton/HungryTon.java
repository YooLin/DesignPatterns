package com.lyc.singleton;

/**
 * @Author YooLin
 * @Date 2017/8/10 16:50
 * @Description 单例模式：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 * 饿汉式
 */
public class HungryTon {
    private static final HungryTon instance = new HungryTon();

    private HungryTon(){}

    public static HungryTon getInstance(){
        return instance;
    }
}
