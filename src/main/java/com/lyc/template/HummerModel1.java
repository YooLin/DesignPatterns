package com.lyc.template;

/**
 * @Author YooLin
 * @Date 2017/8/9 15:49
 * @Description 悍马1号模型 子类实现具体的基本方法
 */
public class HummerModel1 extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马1号模型启动...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马1号模型引擎轰鸣...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马1号模型喇叭鸣叫...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马1号模型停车...");
    }
}
