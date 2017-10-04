package com.lyc.strategy.extend;

/**
 * 策略枚举
 */
public enum Arithmetic {
    ADD("+") {
        @Override
        protected int calculate(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        protected int calculate(int a, int b) {
            return a - b;
        }
    };

    private String type;

    public String getType() {
        return type;
    }

    Arithmetic(String type) {
        this.type = type;
    }

    protected abstract int calculate(int a, int b);
}
