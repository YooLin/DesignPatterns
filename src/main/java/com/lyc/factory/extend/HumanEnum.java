package com.lyc.factory.extend;

import java.util.function.Supplier;

/**
 * User：lyc
 * Date：2017-11-16
 * Time：10:17
 * Description：
 */
public enum HumanEnum {
    MAN(Man::new), WOMAN(Woman::new);

    private final Supplier<Human> human;

    HumanEnum(Supplier<Human> human) {
        this.human = human;
    }

    public Supplier<Human> getHuman() {
        return this.human;
    }
}
