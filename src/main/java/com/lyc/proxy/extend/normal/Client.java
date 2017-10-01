package com.lyc.proxy.extend.normal;

public class Client {
    public static void main(String[] args) throws Exception {
        IGamePlayer proxy = new GamePlayProxy("林义聪");//创建一个名为林义聪的代理类
        proxy.login("lyc","123");
        proxy.killBoss();
        proxy.upgrade();
    }
}
