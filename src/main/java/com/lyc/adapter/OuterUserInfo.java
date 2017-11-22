package com.lyc.adapter;

import java.util.Map;

/**
 * 作者：lyc
 * 日期：2017/10/4
 * 描述：类适配器（继承）
 */
public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map officeInfo = super.getUserOfficeInfo();
    private Map homeInfo = super.getUserHomeInfo();

    @Override
    public String getUserName() {
        return (String) baseInfo.get("username");
    }

    @Override
    public String getHomeAddress() {
        return (String) homeInfo.get("address");
    }

    @Override
    public String getMobileNumber() {
        return (String) baseInfo.get("mobile");
    }

    @Override
    public String getOfficeTelNumber() {
        return (String) officeInfo.get("officeTelephone");
    }

    @Override
    public String getJobPostion() {
        return (String) officeInfo.get("position");
    }

    @Override
    public String getHomeTelNumber() {
        return (String) homeInfo.get("homeTelephone");
    }
}
