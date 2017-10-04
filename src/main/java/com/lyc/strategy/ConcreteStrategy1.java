package com.lyc.strategy;

public class ConcreteStrategy1 implements IStrategy {
    @Override
    public void operate() {
        System.out.println("策略1");
    }
}
