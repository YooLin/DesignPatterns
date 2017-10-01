package com.lyc.prototype.improve;

import com.lyc.prototype.AdvTemplate;

/**
 * @Author YooLin
 * @Date 2017/8/29 16:19
 * @Description 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * 注意：
 * 1.clone方法表示复制指定对象生成一个新的对象，有浅拷贝与深拷贝之分；
 * 2.clone方法创建的对象不会执行该对象的构造方法；
 * 3.Cloneable接口只是起一个标示作用，在JVM中具有该标记的对象才“有可能被拷贝”；
 * 4.覆盖clone方法从“有可能被拷贝”转换为“可以被拷贝”；
 * 5.clone拷贝是在内存二进制流的拷贝，重新分配一个内存块，要比直接new一个对象性能好点，
 * 因此一般在一个循环体内产生大量对象时使用。
 */
public class Mail implements Cloneable {
    private String receiver;//收件人
    private String subject;//邮件名称
    private String appellation;//称谓
    private String context;//邮件内容
    private String tail;//邮件尾部

    public Mail(AdvTemplate template) {
        this.subject = template.getAdvSubject();
        this.context = template.getAdvContext();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    public Mail clone() throws CloneNotSupportedException {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
