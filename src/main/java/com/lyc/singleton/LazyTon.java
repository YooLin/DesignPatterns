package com.lyc.singleton;

/**
 * @Author YooLin
 * @Date 2017/8/5 20:17
 * @Description 懒汉式
 */
public class LazyTon {
    private static volatile LazyTon instance = null;

    private LazyTon(){}

    public static LazyTon getInstance(){
        //双重检查（double-check）
        if (instance==null){
            synchronized (LazyTon.class){
                if (instance == null){
                    instance = new LazyTon();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(LazyTon.getInstance());
        }
    }
}
