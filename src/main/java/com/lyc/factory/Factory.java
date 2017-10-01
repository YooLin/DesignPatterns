package com.lyc.factory;

/**
 * @Author YooLin
 * @Date 2017/8/6 18:00
 * @Description 通用工厂模式
 */
public class Factory extends AbstractFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> clazz) {
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
        Human human1 = new Factory().createHuman(YellowHuman.class);
        Human human2 = new Factory().createHuman(WhiteHuman.class);
        Human human3 = new Factory().createHuman(BlackHuman.class);
        human1.talk();
        human2.talk();
        human3.talk();
    }
}
