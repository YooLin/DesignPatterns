package com.lyc.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author YooLin
 * @Date 2017/8/6 18:10
 * @Description 单例工厂模式 使用工厂模式实现单例
 */
public class SingleTonFactory {
    private static volatile Person instance = null;

    public static Person getInstance(){
        //double check 双重检查
        if (instance==null){
            synchronized (SingleTonFactory.class){
                if (instance==null){
                    //反射创建私有构造器的类
                    try {
                        Class<?> clazz = Class.forName(Person.class.getName());
                        Constructor<?> constructor = clazz.getDeclaredConstructor();
                        //设置构造器可访问
                        constructor.setAccessible(true);
                        instance = (Person) constructor.newInstance();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return instance;
    }

    public static void main(String[] args){
        for (int i=1;i<=30;i++){
            Person person = SingleTonFactory.getInstance();
            System.out.println(person);
        }
    }
}
