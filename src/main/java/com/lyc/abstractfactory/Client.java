package com.lyc.abstractfactory;

public class Client {
    public static void main(String[] args) {
        Creator1 creator1 = new Creator1();
        Creator2 creator2 = new Creator2();
        AbstractProductA productA1 = creator1.createProductA();
        AbstractProductB productB1 = creator1.createProductB();
        AbstractProductA productA2 = creator2.createProductA();
        AbstractProductB productB2 = creator2.createProductB();
        productA1.information();
        productB1.information();
        productA2.information();
        productB2.information();
    }
}
