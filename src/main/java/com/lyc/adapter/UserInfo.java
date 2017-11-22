package com.lyc.adapter;

/**
 * 作者：lyc
 * 日期：2017/10/4
 * 描述：
 */
public class UserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        return "lyc";
    }

    @Override
    public String getHomeAddress() {
        return "Shanghai";
    }

    @Override
    public String getMobileNumber() {
        return "18018961679";
    }

    @Override
    public String getOfficeTelNumber() {
        return null;
    }

    @Override
    public String getJobPostion() {
        return "internship";
    }

    @Override
    public String getHomeTelNumber() {
        return null;
    }
}
