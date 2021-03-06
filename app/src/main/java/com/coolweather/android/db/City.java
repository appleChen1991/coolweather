package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chenlei on 2018/3/6.
 */

public class City extends DataSupport {

    private int id;

    private String ciyName;

    private int cityCode;

    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiyName() {
        return ciyName;
    }

    public void setCiyName(String ciyName) {
        this.ciyName = ciyName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}
