package com.lyc.adapter;

import java.util.Map;

/**
 * 作者：lyc
 * 日期：2017/10/4
 * 描述：外包员工信息接口
 */
public interface IOuterUser {
    Map getUserBaseInfo();

    Map getUserOfficeInfo();

    Map getUserHomeInfo();
}
