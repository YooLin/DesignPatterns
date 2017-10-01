package com.lyc.prototype.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author YooLin
 * @Date 2017/8/29 16:37
 * @Description 深拷贝
 */
public class DeepCopy implements Cloneable {
    /*
    这里不能是用List，因为List方法的clone方法无法访问（protected），
    而ArrayList实现了Cloneable接口
    注意：要使用clone方法，类的成员变量上不要增加final关键字
     */
    private ArrayList<String> list = new ArrayList<>();

    @Override
    public DeepCopy clone() throws CloneNotSupportedException {
        DeepCopy deepCopy = null;
        try {
            deepCopy = (DeepCopy) super.clone();
            deepCopy.list = (ArrayList<String>) this.list.clone();//对私有的类变量进行独立的拷贝
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepCopy;
    }

    public void setValue(String value) {
        this.list.add(value);
    }

    public List<String> getValue() {
        return this.list;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopy deepCopy = new DeepCopy();
        deepCopy.setValue("lyc");
        DeepCopy copy = deepCopy.clone();
        copy.setValue("YooLin");
        System.out.println(deepCopy.getValue());//lyc
    }
}
