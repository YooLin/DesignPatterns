package com.lyc.proxy.extend.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author YooLin
 * @Date 2017/8/11 20:47
 * @Description 动态代理：
 */
public class Client {
    public static void main(String[] args){
        final IGamePlayer player = new GamePlayer("林义聪");
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(player.getClass().getClassLoader(), player.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equalsIgnoreCase("login")){
                    System.out.println("账号被登录...");
                }
                return method.invoke(player, args);
            }
        });
        proxy.login("lyc","123");
        proxy.killBoss();
        proxy.upgrade();
    }
}
