package com.lyc.command;

/**
 * User：lyc
 * Date：2017-11-16
 * Time：14:17
 * Description：啤酒鸭命令类
 */
public class BeerDuckCommand extends BaseCommand {
    public BeerDuckCommand(Kitchen kitchen,Long count) {
        super(kitchen,count);
    }

    @Override
    protected void execute() {
        kitchen.beerDuck(count);
    }
}
