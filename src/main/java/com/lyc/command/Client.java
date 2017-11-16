package com.lyc.command;

/**
 * @Author YooLin
 * @Date 2017/8/29 14:48
 * @Description 命令模式
 */
public class Client {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();

        System.out.println("=====开始营业=====");
        System.out.println("第一桌>>>>>>>>>>>>一份牛肉饭，两份啤酒鸭");
        waiter.noteOrder(new BeefRiceCommand(kitchen, 1L))
                .noteOrder(new BeerDuckCommand(kitchen, 2L));
        System.out.println("第二桌>>>>>>>>>>>>一份西红柿炒鸡蛋，三份牛肉饭");
        waiter.noteOrder(new ScrambledEggsWithTomatoesCommand(kitchen, 1L))
                .noteOrder(new BeefRiceCommand(kitchen, 3L));
        System.out.println("点单完成，通知厨房做饭<<<<<<<");
        waiter.notifyKitchen();
    }
}
