package com.lyc.proxy;

/**
 * @Author YooLin
 * @Date 2017/8/11 19:05
 * @Description 代理模式/委托模式：为其他对象提供一种代理以控制对这个对象的访问
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer player;

    public GamePlayerProxy(IGamePlayer player) {//指定被代理对象
        this.player = player;
    }

    @Override
    public void login(String username, String password) {
        this.player.login(username,password);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void upgrade() {
        this.player.upgrade();
    }
}
