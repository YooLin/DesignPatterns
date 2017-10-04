package com.lyc.strategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void invoke(){
        this.strategy.operate();
    }
}
