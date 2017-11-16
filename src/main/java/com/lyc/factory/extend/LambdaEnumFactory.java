package com.lyc.factory.extend;

import java.util.Objects;

/**
 * User：lyc
 * Date：2017-11-15
 * Time：18:06
 * Description：使用Lambda表达式+枚举实现简单工厂模式+开闭原则
 */
public class LambdaEnumFactory {
    public static Human getInstance(HumanEnum humanEnum) {
        if (Objects.isNull(humanEnum) || Objects.isNull(humanEnum.getHuman())) {
            throw new IllegalArgumentException("工厂找不到与之匹配的类型");
        }
        return humanEnum.getHuman().get();
    }

    public static void main(String[] args) {
        Human man = LambdaEnumFactory.getInstance(HumanEnum.MAN);
        System.out.println(man);//com.lyc.factory.extend.Man@5fd0d5ae
        Human woman = LambdaEnumFactory.getInstance(HumanEnum.WOMAN);
        System.out.println(woman);//com.lyc.factory.extend.Woman@2d98a335
        Human none = LambdaEnumFactory.getInstance(null);
        System.out.println(none);//Exception in thread "main" java.lang.IllegalArgumentException: 工厂找不到与之匹配的类型
    }
}
