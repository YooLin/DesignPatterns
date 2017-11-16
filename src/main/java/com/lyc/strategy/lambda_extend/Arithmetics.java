package com.lyc.strategy.lambda_extend;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

/**
 * User：lyc
 * Date：2017-11-16
 * Time：13:35
 * Description：算法枚举
 */
public enum Arithmetics {
    ADD(BigDecimal::add), SUB(BigDecimal::subtract);

    private BinaryOperator<BigDecimal> operator;

    Arithmetics(BinaryOperator<BigDecimal> operator) {
        this.operator = operator;
    }

    public BigDecimal calculate(BigDecimal x, BigDecimal y) {
        return this.operator.apply(x, y);
    }

    public static void main(String[] args) {
        System.out.println(Arithmetics.ADD.calculate(new BigDecimal("1.23"), new BigDecimal("6.78")));//8.01
        System.out.println(Arithmetics.SUB.calculate(new BigDecimal("1.23"), new BigDecimal("6.78")));//-5.55
    }
}