package com.lyc.proxy.extend.force;

public class GamePlayer implements IGamePlayer {

    private IGamePlayer proxy;
    private String name;

    public GamePlayer(String name) {
        this.proxy = new GamePlayerProxy(this);//指定代理对象
        this.name = name;
    }

    @Override
    public void login(String username, String password) {
        if (isProxy())
            System.out.println(this.name + "玩家，登录成功，欢迎进入xx游戏...");
        else
            System.out.println("请使用指定的代理对象访问");
    }

    @Override
    public void killBoss() {
        if (isProxy())
            System.out.println(this.name + "玩家成功杀死BOSS...");
        else
            System.out.println("请使用指定的代理对象访问");
    }

    @Override
    public void upgrade() {
        if (isProxy())
            System.out.println(this.name + "玩家，恭喜您，又升一级...");
        else
            System.out.println("请使用指定的代理对象访问");
    }

    @Override
    public IGamePlayer getProxy() {
        return this.proxy;
    }

    private boolean isProxy() {
        return this.proxy != null;
    }
}
