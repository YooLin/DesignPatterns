package com.lyc.abstractfactory;

/**
 * @Author YooLin
 * @Date 2017/8/9 11:04
 * @Description 一级产品A
 */
public class ProductA1 extends AbstractProductA {
    @Override
    public void information() {
        System.out.println("This is primary product A");
    }
}
