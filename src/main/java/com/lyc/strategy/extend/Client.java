package com.lyc.strategy.extend;

public class Client {
    public static void main(String[] args) {
        System.out.println(Arithmetic.ADD.calculate(1,7));
        System.out.println(Arithmetic.SUB.calculate(1,7));
    }
}