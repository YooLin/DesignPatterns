package com.lyc.templet.extend;

public class Client {

    public static void main(String[] args){
        HummerModel hummer1 = new HummerModel1();
        HummerModel hummer2 = new HummerModel2();
        hummer1.run();
        System.out.println("==================");
        hummer2.run();
    }
}
