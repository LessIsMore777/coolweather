package com.nihuan.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by NiHuan on 2018/3/26.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
