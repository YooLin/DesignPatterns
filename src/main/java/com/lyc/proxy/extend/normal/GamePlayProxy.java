package com.lyc.proxy.extend.normal;

/**
 * @Author YooLin
 * @Date 2017/8/11 20:08
 * @Description 普通代理模式：需要知道代理类的存在并使用代理类来进行访问，而不能直接使用真实对象来访问！
 */
public class GamePlayProxy implements IGamePlayer {

    private IGamePlayer player;

    public GamePlayProxy(String name) {
        try {
            this.player = new GamePlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String username, String password) {
        this.player.login(username, password);
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
