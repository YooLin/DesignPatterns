package com.lyc.chapter02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father {

    //不是覆盖父类的doSomething方法而是重载继承自父类的doSomething方法
    public Collection doSomething(Map map) {
        System.out.println("子类重载被执行......");
        return map.values();
    }

    public static void main(String[] args){
        Father father = new Father();
        father.doSomething(new HashMap());
        Son son = new Son();
        son.doSomething(new HashMap());
    }
}
