package com.lyc.command;

/**
 * User：lyc
 * Date：2017-11-16
 * Time：14:15
 * Description：牛肉饭命令类
 */
public class BeefRiceCommand extends BaseCommand {
    public BeefRiceCommand(Kitchen kitchen, Long count) {
        super(kitchen, count);
    }

    @Override
    public void execute() {
        kitchen.beefRice(count);
    }
}
