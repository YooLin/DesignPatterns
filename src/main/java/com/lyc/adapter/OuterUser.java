package com.lyc.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：lyc
 * 日期：2017/10/4
 * 描述：
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        Map map = new HashMap();
        map.put("username", "外包员工姓名：...");
        map.put("mobile", "外包员工手机号：...");
        return map;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map map = new HashMap();
        map.put("officeTelephone", "外包员工公司电话：...");
        map.put("position", "外包员工职位级别：...");
        return map;
    }

    @Override
    public Map getUserHomeInfo() {
        Map map = new HashMap();
        map.put("address", "外包员工家庭地址：...");
        map.put("homeTelephone", "外包员工家庭座机：...");
        return map;
    }
}
