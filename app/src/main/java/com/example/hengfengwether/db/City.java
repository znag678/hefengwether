package com.example.hengfengwether.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;

    private int cityname;

    private int citycode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityname() {
        return cityname;
    }

    public void setCityname(int cityname) {
        this.cityname = cityname;
    }

    public int getCitycode() {
        return citycode;
    }

    public void setCitycode(int citycode) {
        this.citycode = citycode;
    }
}
