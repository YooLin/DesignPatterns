package com.lyc.abstractfactory;

/**
 * @Author YooLin
 * @Date 2017/8/9 11:02
 * @Description 抽象工厂模式：为创建一组相关或相互依赖的对象提供一个接口，而且无须指定它们的具体类
 * 注意：有几类产品就应该有几个相应的生成方法
 */
public abstract class AbstractCreator {
    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
