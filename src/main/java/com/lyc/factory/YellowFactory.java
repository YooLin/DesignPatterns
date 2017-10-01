package com.lyc.factory;

public class YellowFactory extends AbstractMutiFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }

    public static void main(String[] args) {
        YellowFactory yellowFactory = new YellowFactory();
        Human human = yellowFactory.createHuman();
        human.talk();
    }
}
