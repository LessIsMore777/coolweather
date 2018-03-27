package com.nihuan.coolweather.gson;

/**
 * Created by NiHuan on 2018/3/26.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
