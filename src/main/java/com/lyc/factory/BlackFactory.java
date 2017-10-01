package com.lyc.factory;

/**
 * @Author YooLin
 * @Date 2017/8/6 18:09
 * @Description 多工厂模式
 */
public class BlackFactory extends AbstractMutiFactory{
    @Override
    public Human createHuman() {

        return new BlackHuman();
    }
    public static void main(String[] args){
        BlackFactory blackFactory = new BlackFactory();
        Human human = blackFactory.createHuman();
        human.talk();
    }
}
