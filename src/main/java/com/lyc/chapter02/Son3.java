package com.lyc.chapter02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son3 extends Father3 {

    @Override
    public HashMap doSomething(Map map) {
        System.out.println("子类覆盖父类的方法被执行...");
        return (HashMap) super.doSomething(map);
    }

    //不是覆盖父类的doSomething方法而是重载继承自父类的doSomething方法
    public HashMap doSomething(HashMap map) {
        System.out.println("子类重载被执行......");
        return map;
    }

    public static void main(String[] args){
        Father2 father = new Father2();
        father.doSomething(new HashMap());
        Son3 son = new Son3();
        son.doSomething(new HashMap());
    }
}
