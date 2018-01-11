package com.lyc.factory;

public class WhiteFactory extends AbstractMutiFactory{
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }

    public static void main(String[] args) {
        AbstractMutiFactory whiteFactory = new WhiteFactory();
        Human human = whiteFactory.createHuman();
        human.talk();
    }
}
