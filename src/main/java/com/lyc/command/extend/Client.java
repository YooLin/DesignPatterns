package com.lyc.command.extend;

import java.util.function.BiConsumer;

/**
 * @Author YooLin
 * @Date 2017/8/29 14:48
 * @Description 命令模式
 * TODO 无法指定菜单数量
 */
public class Client {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();
        System.out.println("=====开始营业=====");
        BiConsumer<Kitchen, Long> beefRice = FunctionCastUtil.asConsumer(Kitchen::beefRice);
        BiConsumer<Kitchen, Long> beerDuckAndScrambledEggsWithTomatoes = FunctionCastUtil.asConsumer(Kitchen::beerDuck)
                .andThen(Kitchen::scrambledEggsWithTomatoes);
        //两份牛肉饭&一份啤酒鸭&一份西红柿炒蛋
        waiter.noteOrder(beefRice,2L);
        waiter.noteOrder(beerDuckAndScrambledEggsWithTomatoes,1L);
        System.out.println("点单完成，通知厨房做饭<<<<<<<");
        waiter.notifyKitchen(kitchen);
    }
}
