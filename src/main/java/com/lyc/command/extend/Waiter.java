package com.lyc.command.extend;

import com.lyc.command.ScrambledEggsWithTomatoesCommand;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.function.BiConsumer;

/**
 * User：lyc
 * Date：2017-11-16
 * Time：14:20
 * Description：服务员类
 */
public class Waiter {
    private final LinkedList<BiConsumer<Kitchen, Long>> queue = new LinkedList<>();

    /**
     * 记录订单
     *
     * @param command 菜品命令
     */
    public void noteOrder(BiConsumer<Kitchen, Long> command) {
        if (command.getClass().getName().equals(ScrambledEggsWithTomatoesCommand.class.getName())) {
            System.out.println("不好意思，今天的西红柿没了，要不换一个菜品吧！");
        } else {
            queue.offer(command);
            System.out.println("菜品" + command + "，于" + LocalDateTime.now() + "记录");
//            System.out.println("菜品" + command + "，数量：" + command.count + "，于" + LocalDateTime.now() + "记录");
        }
    }

    /**
     * 通知厨房
     */
    public void notifyKitchen(Kitchen kitchen) {
        while (queue.peek() != null) {
            queue.poll().accept(kitchen, 1L);
        }
    }
}
