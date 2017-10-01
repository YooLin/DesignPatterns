package com.lyc.prototype;

import java.util.Random;

public class Client {
    private static int MAX_COUNT = 60;//发送账单的数量（实际从数据库中获取）

    public static void main(String[] args) {
        final Mail mail = new Mail(new AdvTemplate(), MAX_COUNT);//模板一般是从数据库中取出，这里简单模拟
        sendMail(mail);
    }

    /**
     * 使用多线程解决发送大量邮件场景
     *
     * @param mail
     */
    private static void sendMail(Mail mail) {
        MyRunnable runnable = new MyRunnable(mail);
        Thread A = new Thread(runnable);
        A.setName("A");

        Thread B = new Thread(runnable);
        B.setName("B");

        Thread C = new Thread(runnable);
        C.setName("C");

        A.start();
        B.start();
        C.start();
    }

    static class MyRunnable implements Runnable {
        private Mail mail;

        public MyRunnable(Mail mail) {
            this.mail = mail;
        }

        @Override
        public void run() {
            while (mail.getSendCount() > 0) {
                mail.setAppellation(getRandomString(5) + "先生（女士）");
                mail.setReceiver(getRandomString(5) + "@" + getRandomString(8) + ".com");
                mail.sendMail();
            }
        }
    }

    private static String getRandomString(int maxLength) {
        String str = "0123456789abcdefghijklmeopqrstuvxyzABCDEFGHIJKLMEOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= maxLength; i++)
            sb.append(str.charAt(new Random().nextInt(str.length())));
        return sb.toString();
    }
}
