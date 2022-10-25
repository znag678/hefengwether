package com.example.hengfengwether.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {
    private int id;

    private int countryname;

    private int countrycode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountryname() {
        return countryname;
    }

    public void setCountryname(int countryname) {
        this.countryname = countryname;
    }

    public int getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(int countrycode) {
        this.countrycode = countrycode;
    }
}
