package com.lyc.build.extend;

public class BMWModel extends CarModel {
    @Override
    protected void engineBoom() {
        System.out.println("宝马引擎响起...");
    }

    @Override
    protected void start() {
        System.out.println("宝马启动...");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马鸣笛...");
    }

    @Override
    protected void stop() {
        System.out.println("宝马刹车...");
    }
}
