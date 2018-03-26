package com.nihuan.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 与服务器交互获取数据
 * 回调函数来处理服务器响应
 * Created by NiHuan on 2018/3/26.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
