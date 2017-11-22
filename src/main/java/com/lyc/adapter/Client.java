package com.lyc.adapter;

public class Client {
    public static void main(String[] args) {
        IUserInfo userInfo = new UserInfo();
        IUserInfo outerUserInfo = new OuterUserInfo();

        System.out.println(userInfo.getUserName());
        System.out.println(outerUserInfo.getUserName());
    }
}