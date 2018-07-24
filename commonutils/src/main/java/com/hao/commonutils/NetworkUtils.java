package com.hao.commonutils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
* @作者 hao
* @创建日期 2018-7-24 17:26
* Description: 网络相关工具类
*/
public class NetworkUtils {

    /**
     * 检查网络是否连接
     * @param context 全局context
     * @return true 已连接 false 未连接
     */
    public static Boolean checkNetworkConnect(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if (mNetworkInfo != null) {
                return mNetworkInfo.isAvailable();
            }
        }

        return false;
    }
}
