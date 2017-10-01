package com.lyc.factory;

/**
 * @Author YooLin
 * @Date 2017/8/10 16:48
 * @Description 定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。
 */
public abstract class AbstractFactory {

    public abstract <T extends Human>T createHuman(Class<T> clazz);
}
