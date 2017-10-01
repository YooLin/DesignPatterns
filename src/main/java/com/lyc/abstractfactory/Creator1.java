package com.lyc.abstractfactory;

/**
 * @Author YooLin
 * @Date 2017/8/9 10:54
 * @Description 一级工厂 生产一级产品
 * 注意：有M个等级就应该有M个相应的工厂
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
