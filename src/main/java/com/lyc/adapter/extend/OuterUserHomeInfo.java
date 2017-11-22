package com.lyc.adapter.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：lyc
 * 日期：2017/10/4
 * 描述：
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    @Override
    public Map getUserHomeInfo() {
        Map map = new HashMap();
        map.put("address", "外包员工家庭地址：...");
        map.put("homeTelephone", "外包员工家庭座机：...");
        return map;
    }
}
