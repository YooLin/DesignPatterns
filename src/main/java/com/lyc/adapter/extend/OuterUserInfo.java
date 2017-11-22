package com.lyc.adapter.extend;

import java.util.Map;

/**
 * 作者：lyc
 * 日期：2017/10/4
 * 描述：对象适配器（组合）常用
 */
public class OuterUserInfo implements IUserInfo {
    private IOuterUserBaseInfo baseInfo;
    private IOuterUserOfficeInfo officeInfo;
    private IOuterUserHomeInfo homeInfo;

    private Map baseMap;
    private Map officeMap;
    private Map homeMap;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserOfficeInfo officeInfo, IOuterUserHomeInfo homeInfo) {
        this.baseInfo = baseInfo;
        this.officeInfo = officeInfo;
        this.homeInfo = homeInfo;

        this.baseMap = baseInfo.getUserBaseInfo();
        this.officeMap = officeInfo.getUserOfficeInfo();
        this.homeMap = homeInfo.getUserHomeInfo();
    }


    @Override
    public String getUserName() {
        return (String) baseMap.get("username");
    }

    @Override
    public String getHomeAddress() {
        return (String) homeMap.get("address");
    }

    @Override
    public String getMobileNumber() {
        return (String) baseMap.get("mobile");
    }

    @Override
    public String getOfficeTelNumber() {
        return (String) officeMap.get("officeTelephone");
    }

    @Override
    public String getJobPostion() {
        return (String) officeMap.get("position");
    }

    @Override
    public String getHomeTelNumber() {
        return (String) homeMap.get("homeTelephone");
    }
}