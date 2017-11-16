package com.lyc.command.extend;

import java.util.function.BiConsumer;

/**
 * User：lyc
 * Date：2017-11-16
 * Time：15:30
 * Description：
 */
public class FunctionCastUtil {
    public static <T, U> BiConsumer<T, U> asConsumer(BiConsumer<T, U> consumer) {
        return consumer;
    }
}
