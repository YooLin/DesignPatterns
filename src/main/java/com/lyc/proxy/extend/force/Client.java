package com.lyc.proxy.extend.force;

public class Client {
    public static void main(String[] args){
        IGamePlayer player = new GamePlayer("林义聪");
        IGamePlayer proxy = player.getProxy();
        proxy.login("lyc","123");
        proxy.killBoss();
        proxy.upgrade();
    }
}
