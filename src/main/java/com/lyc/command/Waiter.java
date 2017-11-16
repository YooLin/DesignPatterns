package com.lyc.command;

import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 * User：lyc
 * Date：2017-11-16
 * Time：14:20
 * Description：服务员类
 */
public class Waiter {
    private final LinkedList<BaseCommand> queue = new LinkedList<>();

    /**
     * 记录订单
     *
     * @param command 菜品命令
     */
    public Waiter noteOrder(BaseCommand command) {
        if (command.getClass().getName().equals(ScrambledEggsWithTomatoesCommand.class.getName())) {
            System.out.println("不好意思，今天的西红柿没了，要不换一个菜品吧！");
        } else {
            queue.offer(command);
            System.out.println("菜品" + command + "，数量：" + command.count + "，于" + LocalDateTime.now() + "记录");
        }
        return this;
    }

    /**
     * 通知厨房
     */
    public void notifyKitchen() {
        while (queue != null && queue.size() > 0) {
            queue.poll().execute();
        }
    }
}
