package com.lyc.proxy.extend.force;

/**
 * @Author YooLin
 * @Date 2017/8/11 20:29
 * @Description 强制代理模式：必须通过真实对象指定代理对象后才能访问，否则不允许访问
 * 代理的目的：在目标对象方法的基础上作增强，这种增强的本质通常就是对目标对象的方法进行拦截和过滤，例如，
 * 代理类可以为真实对象预处理消息、过滤消息、消息转发、事后处理消息等操作
 */
public class GamePlayerProxy implements IGamePlayer,IProxy {

    private IGamePlayer player;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
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
        this.count();
    }

    //返回代理对象
    @Override
    public IGamePlayer getProxy() {
        return this;//代理对象也可以再被代理
    }

    //代练需要费用
    @Override
    public void count() {
        System.out.println("代练费收您5元/级...");
    }
}
