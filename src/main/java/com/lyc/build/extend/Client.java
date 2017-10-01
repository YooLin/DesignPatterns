package com.lyc.build.extend;

public class Client {
    public static void main(String[] args){
        Director director = new Director();
        System.out.println("====奔驰车系====");
        CarModel benzA = director.buildBenzA();
        benzA.run();
        System.out.println("奔驰A系列展示完毕。。。");
        CarModel benzB = director.buildBenzB();

        benzB.run();
        System.out.println("奔驰B系列展示完毕。。。");
        CarModel benzC = director.buildBenzC();
        benzC.run();
        System.out.println("奔驰C系列展示完毕。。。");
        System.out.println("====宝马车系====");
        CarModel bmwA = director.buildBMWA();
        bmwA.run();
        System.out.println("宝马A系列展示完毕。。。");
        CarModel bmwB = director.buildBMWB();
        bmwB.run();
        System.out.println("宝马B系列展示完毕。。。");
    }
}
