package com.hao.commonutils;

/**
* @作者 hao
* @创建日期 2018-7-24 17:26
* Description: 字符串相关方法
*/
public class StringUtils {

    /**
     * 是否为空
     * @param str 字符串
     * @return true 空 false 非空
     */
    public static Boolean isEmpty(String str) {
        if(str == null || str.equals("")) {
            return true;
        }

        return false;
    }
}
