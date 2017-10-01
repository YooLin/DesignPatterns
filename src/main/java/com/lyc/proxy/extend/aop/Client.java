package com.lyc.proxy.extend.aop;

public class Client {
    public static void main(String[] args){
        Subject subject = new RealSubject();
        Subject proxy = DynamicProxy.newProxyInstance(subject);
        proxy.doSomething("end");
    }
}
