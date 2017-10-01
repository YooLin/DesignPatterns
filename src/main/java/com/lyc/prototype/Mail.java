package com.lyc.prototype;

public class Mail {
    private String receiver;//收件人
    private String subject;//邮件名称
    private String appellation;//称谓
    private String context;//邮件内容
    private String tail;//邮件尾部
    private int sendCount;//发送邮件的数量

    public Mail(AdvTemplate template) {
        this.subject = template.getAdvSubject();
        this.context = template.getAdvContext();
        this.setTail("XXX银行版权所有");
    }

    public Mail(AdvTemplate template, int sendCount) {
        this(template);
        this.sendCount = sendCount;
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

    public int getSendCount() {
        return sendCount;
    }

    public void setSendCount(int sendCount) {
        this.sendCount = sendCount;
    }


    public synchronized void sendMail() {
        if (sendCount > 0) {
            System.out.println("线程：" + Thread.currentThread().getName() + "\t发送第" + this.sendCount + "封邮件\t标题：" + this.getSubject() + "\t前收件人：" + this.receiver + "\t后收件人：" + this.getReceiver() + "\t...发送成功！");
            sendCount--;
        }
    }
}
