package com.lyc.abstractfactory;

/**
 * @Author YooLin
 * @Date 2017/8/9 11:04
 * @Description 二级产品A
 */
public class ProductA2 extends AbstractProductA {
    @Override
    public void information() {
        System.out.println("This is secondary product A");
    }
}
