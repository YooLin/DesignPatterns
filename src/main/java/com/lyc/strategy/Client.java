package com.lyc.strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        context.invoke();
        context = new Context(new ConcreteStrategy2());
        context.invoke();
    }
}