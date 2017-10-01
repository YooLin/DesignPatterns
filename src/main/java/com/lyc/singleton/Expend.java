package com.lyc.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Author YooLin
 * @Date 2017/8/5 20:05
 * @Description 产生两个实例的拓展单例
 */
public class Expend {
    private static final int INSTANCE_COUNT = 2;
    //获取线程安全的ArrayList
    private static List<Expend> instanceList = Collections.synchronizedList(new ArrayList<Expend>(INSTANCE_COUNT));

    static {
        for (int i = 0; i < INSTANCE_COUNT; i++)
            instanceList.add(new Expend());
    }

    private Expend() {
    }

    public static Expend getInstance() {
        return instanceList.get(new Random().nextInt(INSTANCE_COUNT));
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(Expend.getInstance());
        }
    }
}
