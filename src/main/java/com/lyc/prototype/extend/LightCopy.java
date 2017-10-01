package com.lyc.prototype.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author YooLin
 * @Date 2017/8/29 16:37
 * @Description 浅拷贝：clone方法只拷贝本对象，其对象内部的数组、引用对象等都不拷贝，
 * 还是指向原生对象的内部元素地址
 * 注意：
 * 原型模式中，引用的成员变量必须满足两个条件才不会被拷贝，
 * 一是类的成员变量，而不是方法内变量；
 * 二是必须是一个可变的引用对象，而不是一个原始类型或不可变对象。
 */
public class LightCopy implements Cloneable {
    private List<String> list = new ArrayList<>();

    @Override
    protected LightCopy clone() throws CloneNotSupportedException {
        LightCopy lightCopy = null;
        try {
            lightCopy = (LightCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return lightCopy;
    }

    public void setValue(String value) {
        this.list.add(value);
    }

    public List<String> getValue() {
        return this.list;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        LightCopy lightCopy = new LightCopy();
        lightCopy.setValue("lyc");
        LightCopy copy = lightCopy.clone();
        copy.setValue("YooLin");
        System.out.println(lightCopy.getValue());//[lyc,YooLin]
    }
}
