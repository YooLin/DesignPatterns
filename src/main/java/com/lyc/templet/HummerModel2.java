package com.lyc.templet;

/**
 * @Author YooLin
 * @Date 2017/8/9 16:04
 * @Description 悍马2号模型
 */
public class HummerModel2 extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马2号模型启动...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马2号模型引擎轰鸣...");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马2号模型喇叭鸣叫...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马2号模型停车...");
    }
}
