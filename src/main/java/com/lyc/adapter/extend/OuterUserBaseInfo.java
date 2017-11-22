package com.lyc.adapter.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：lyc
 * 日期：2017/10/4
 * 描述：
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    @Override
    public Map getUserBaseInfo() {
        Map map = new HashMap();
        map.put("username", "外包员工姓名：...");
        map.put("mobile", "外包员工手机号：...");
        return map;
    }
}
