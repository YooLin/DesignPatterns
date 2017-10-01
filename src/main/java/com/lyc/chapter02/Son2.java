package com.lyc.chapter02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son2 extends Father2 {

    //不是覆盖父类的doSomething方法而是重载继承自父类的doSomething方法
    public Collection doSomething(HashMap map) {
        System.out.println("子类重载被执行......");
        return map.values();
    }

    public static void main(String[] args){
        Father2 father = new Father2();
        father.doSomething(new HashMap());
        Son2 son = new Son2();
        son.doSomething(new HashMap());
    }
}
