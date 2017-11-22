package com.lyc.adapter.extend;

/**
 * 作者：lyc
 * 日期：2017/10/4
 * 描述：
 */
public class Client {
    public static void main(String[] args) {
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();

        IUserInfo userInfo = new UserInfo();
        System.out.println(userInfo.getMobileNumber());
        userInfo = new OuterUserInfo(baseInfo,officeInfo,homeInfo);
        System.out.println(userInfo.getMobileNumber());
    }
}
