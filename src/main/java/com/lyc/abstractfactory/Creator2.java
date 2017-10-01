package com.lyc.abstractfactory;

/**
 * @Author YooLin
 * @Date 2017/8/9 10:55
 * @Description 二级工厂 生产二级产品
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
