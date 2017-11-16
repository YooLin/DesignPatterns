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
        BiConsumer<Kitchen, Long> kitchenLongBiConsumer = FunctionCastUtil.asConsumer(Kitchen::beefRice)
                .andThen(Kitchen::beerDuck)
                .andThen(Kitchen::scrambledEggsWithTomatoes);
        waiter.noteOrder(kitchenLongBiConsumer);
        System.out.println("点单完成，通知厨房做饭<<<<<<<");
        waiter.notifyKitchen(kitchen);
    }
}
