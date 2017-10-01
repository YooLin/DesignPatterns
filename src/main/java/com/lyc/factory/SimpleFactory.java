package com.lyc.factory;

/**
 * @Author YooLin
 * @Date 2017/8/6 18:00
 * @Description 简单工厂模式，也叫静态工厂模式
 */
public class SimpleFactory {
    public static <T extends Human> T createHuman(Class<T> clazz){
        T t = null;
        try {
            t = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static void main(String[] args){
        Human human1 = SimpleFactory.createHuman(YellowHuman.class);
        Human human2 = SimpleFactory.createHuman(WhiteHuman.class);
        Human human3 = SimpleFactory.createHuman(BlackHuman.class);
        human1.talk();
        human2.talk();
        human3.talk();
    }
}
