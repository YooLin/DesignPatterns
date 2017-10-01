package com.lyc.proxy;

public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        System.out.println(name+"玩家，登录成功，欢迎进入xx游戏...");
    }

    @Override
    public void killBoss() {
        System.out.println(name+"玩家成功杀死BOSS...");
    }

    @Override
    public void upgrade() {
        System.out.println(name+"玩家，恭喜您，又升一级...");
    }
}
