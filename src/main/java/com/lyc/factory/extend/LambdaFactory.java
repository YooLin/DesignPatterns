package com.lyc.factory.extend;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * User：lyc
 * Date：2017-11-15
 * Time：18:06
 * Description：使用Lambda表达式实现简单工厂模式
 */
public class LambdaFactory {
    private static final Map<String, Optional<Supplier<Human>>> map = ImmutableMap.of("MAN", Optional.of(Man::new), "WOMAN", Optional.of(Woman::new));

    public static Human getInstance(String type) {
        if (type == null || type.length() == 0) {
            throw new IllegalArgumentException("请输入合法参数");
        }
        type = type.toUpperCase();
        if (!map.containsKey(type)) {
            throw new IllegalArgumentException("工厂无此类型");
        }
        return map.get(type)
                .orElseThrow(() -> new IllegalArgumentException("工厂找不到与之匹配的类型"))
                .get();
    }

    public static void main(String[] args) {
        Human man = LambdaFactory.getInstance("man");
        System.out.println(man);//com.lyc.factory.extend.Man@5fd0d5ae
        Human woman = LambdaFactory.getInstance("woman");
        System.out.println(woman);//com.lyc.factory.extend.Woman@2d98a335
        Human none = null;
        try {
            none = LambdaFactory.getInstance(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(none);//com.lyc.factory.extend.Woman@2d98a335
        Human no = LambdaFactory.getInstance("null");
        System.out.println(no);//com.lyc.factory.extend.Woman@2d98a335
    }
}
