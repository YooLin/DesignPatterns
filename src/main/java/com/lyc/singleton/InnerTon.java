package com.lyc.singleton;

/**
 * @Author YooLin
 * @Date 2017/8/5 20:26
 * @Description 使用静态内部类实现单例
 * 使用JVM本身机制保证了线程安全
 * 由于SingletonHolder是私有的，除了 getInstance()之外没有办法访问它，因此它是懒汉式的
 * 读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK版本
 */
public class InnerTon {
    private static class SingletonHolder{
        private static final InnerTon instance = new InnerTon();
    }

    private InnerTon(){}

    public static InnerTon getInstance(){
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException("空指针异常啊！！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= 20; i++) {
            System.out.println(InnerTon.getInstance());
        }
    }
}
