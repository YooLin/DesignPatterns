package com.lyc.prototype.improve;

import com.lyc.prototype.AdvTemplate;

import java.util.Random;

public class Client {
    private static int MAX_COUNT = 60;//发送账单的数量（实际从数据库中获取）

    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail(new AdvTemplate());//模板一般是从数据库中取出，这里简单模拟
        mail.setTail("XXX银行版权所有");
        for (int i=1;i<=MAX_COUNT;i++){
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandomString(5) + "先生（女士）");
            cloneMail.setReceiver(getRandomString(5) + "@" + getRandomString(8) + ".com");
            sendMail(i, cloneMail);
        }
    }

    private static void sendMail(int i, Mail cloneMail) {
        System.out.println("线程：" + Thread.currentThread().getName() + "\t发送第" + i + "封邮件\t标题：" + cloneMail.getSubject() + "\t前收件人：" + cloneMail.getReceiver() + "\t后收件人：" + cloneMail.getReceiver() + "\t...发送成功！");
    }

    private static String getRandomString(int maxLength) {
        String str = "0123456789abcdefghijklmeopqrstuvxyzABCDEFGHIJKLMEOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= maxLength; i++)
            sb.append(str.charAt(new Random().nextInt(str.length())));
        return sb.toString();
    }
}
