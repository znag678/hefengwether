package com.example.hengfengwether.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;     //id

    private String provincename;        //名字

    private int provincecode;       //代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public int getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(int provincecode) {
        this.provincecode = provincecode;
    }
}
