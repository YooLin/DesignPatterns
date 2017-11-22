package com.lyc.adapter.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：lyc
 * 日期：2017/10/4
 * 描述：
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
    @Override
    public Map getUserOfficeInfo() {
        Map map = new HashMap();
        map.put("officeTelephone", "外包员工公司电话：...");
        map.put("position", "外包员工职位级别：...");
        return map;
    }
}
