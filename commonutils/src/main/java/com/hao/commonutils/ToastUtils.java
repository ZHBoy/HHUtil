package com.hao.commonutils;

import android.content.Context;
import android.widget.Toast;

/**
* @作者 hao
* @创建日期 2018-7-24 17:26
* Description: Toast相关方法
*/
public class ToastUtils {

    /**
     * 显示short message
     * @param context 全局context
     * @param resId string string资源id
     */
    public static void showShort(Context context, int resId) {
        Toast.makeText(context, resId, Toast.LENGTH_SHORT).show();

    }

    /**
     * 显示short message
     * @param context 全局context
     * @param message 显示msg
     */
    public static void showShort(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 显示long message
     * @param context 全局context
     * @param resId string string资源id
     */
    public static void showLong(Context context, int resId) {
        Toast.makeText(context, resId, Toast.LENGTH_LONG).show();
    }

    /**
     * 显示long message
     * @param context 全局context
     * @param message 显示msg
     */
    public static void showLong(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
