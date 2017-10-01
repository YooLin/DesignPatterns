package com.lyc.proxy;

public class Client {
    public static void main(String[] args){
        IGamePlayer player = new GamePlayer("林义聪");
        IGamePlayer proxy = new GamePlayerProxy(player);
        proxy.login("lyc","123");
        proxy.killBoss();
        proxy.upgrade();
    }
}
