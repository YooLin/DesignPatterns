package com.lyc.proxy.extend.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author YooLin
 * @Date 2017/8/11 20:58
 * @Description 通用动态代理框架
 * 自定义方法动态创建代理对象
 */
public class DynamicProxy {
    public static <T> T newProxyInstance(final Subject subject) {
        //寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true) {//如果是指定的切点，则执行定义的前置通知
            //执行前置通知
            new BeforeAdvice().exec();
        }
        //执行目标并返回结果
        return (T) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(subject, args);
            }
        });
    }
}
