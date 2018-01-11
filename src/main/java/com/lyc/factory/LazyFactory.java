package com.lyc.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author YooLin
 * @Date 2017/8/6 18:18
 * @Description 延迟加载的工厂模式, 降低对象产生和销毁所带来的开销
 */
public class LazyFactory {
    private static final Map<String, Human> prMap = new HashMap<>();//缓存
    private static Human human = null;

    public static synchronized Human createHuman(String type) {
        if (prMap.containsKey(type)) {
            //如果缓存中存在指定类型的Human，直接获取并返回
            human = prMap.get(type);
        } else {
            //不存在，创建一个相应类型的Human，然后将创建的Human放入缓存中，以便下次使用
            switch (type) {
                case "black":
                    human = new BlackHuman();
                    break;
                case "white":
                    human = new WhiteHuman();
                    break;
                case "yellow":
                    human = new YellowHuman();
                    break;
                default:
                    break;
            }
            if (human != null) {
                prMap.put(type, human);
            }
        }
        return human;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 20; i++) {
            System.out.println("===========" + i + "===============");
            Human black = LazyFactory.createHuman("black");
            Human white = LazyFactory.createHuman("white");
            Human yellow = LazyFactory.createHuman("yellow");
            System.out.println("black:" + black);
            System.out.println("white:" + white);
            System.out.println("yellow:" + yellow);
            System.out.println("===========" + i + "===============");
        }
    }
}
