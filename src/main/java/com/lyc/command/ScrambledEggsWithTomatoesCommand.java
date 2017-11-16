package com.lyc.command;

/**
 * User：lyc
 * Date：2017-11-16
 * Time：14:16
 * Description：西红柿炒鸡蛋命令类
 */
public class ScrambledEggsWithTomatoesCommand extends BaseCommand {
    public ScrambledEggsWithTomatoesCommand(Kitchen kitchen,Long count) {
        super(kitchen,count);
    }

    @Override
    public void execute() {
        kitchen.scrambledEggsWithTomatoes(count);
    }
}
