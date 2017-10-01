package com.lyc.proxy.extend.normal;

public class GamePlayer implements IGamePlayer {

    private String name;

    //普通代理模式不允许直接使用真实对象，而是要通过代理对象来完成指定的操作
    public GamePlayer(IGamePlayer proxy,String name) throws Exception {
        //如果该真实对象没有指定代理对象则抛异常，不允许创建真实对象
        if (proxy==null)
            throw new Exception("不允许创建真实对象！");
        else {
            this.name = name;
        }
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
