package com.coolweathers.android.db;
import org.litepal.crud.DataSupport;

public class Province extends DataSupport{
    
    //id
    private int id;
    //省份名字
    private String provinceName;
    //省份代码
    private int provinceCode;
    

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }
    

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {
        return provinceName;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }}
