package com.lyc.filter_chain;

import java.util.Random;

public enum Level {
    SINGLE(1), MARRIED(2), WIDOW(3);//妇女类型 1-未婚 2-已婚 3-寡妇

    private int type;

    Level(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static Level randomType() {
        int random = new Random().nextInt(3)+1;
        for (Level level : Level.values()) {
            if (level.getType() == random)
                return level;
        }
        return null;
    }

    public static Level valueOf(int type) {
        for (Level level : Level.values()) {
            if (level.getType() == type)
                return level;
        }
        return null;
    }
}
