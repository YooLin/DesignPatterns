package com.lyc.command;

/**
 * User：lyc
 * Date：2017-11-16
 * Time：14:12
 * Description：命令基类
 */
public abstract class BaseCommand {
    protected Kitchen kitchen;
    protected long count;//点菜数量

    public BaseCommand(Kitchen kitchen, long count) {
        this.kitchen = kitchen;
        this.count = count;
    }

    protected abstract void execute();
}
