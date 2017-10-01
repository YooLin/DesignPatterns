package com.lyc.proxy.extend.aop;

/**
 * @Author YooLin
 * @Date 2017/8/11 20:55
 * @Description 前置通知实现类
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("自定义前置通知执行了...");
    }
}
