package com.nihuan.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by NiHuan on 2018/3/26.
 */

public class Province extends DataSupport{    //litepal中每一个实体类必须继承DataSupport
    private int id;
    private String provinceName;   //省名
    private int provinceCode;       //省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
