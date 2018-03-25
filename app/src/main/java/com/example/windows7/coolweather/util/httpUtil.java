package com.example.windows7.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by windows7 on 2018/3/24.
 */

public class httpUtil {
    public static void sengOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
