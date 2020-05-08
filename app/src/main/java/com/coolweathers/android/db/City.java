package com.coolweathers.android.db;
import org.litepal.crud.DataSupport;


public class City extends DataSupport{

    //id
    private int id;
    //城市名字
    private String cityName;
    //城市代码
    private int cityCode;
    
    //当前城市所属省份的id代码值
    private int provinceID;
    
    

    public void setProvinceID(int provinceID) {
        this.provinceID = provinceID;
    }

    public int getProvinceID() {
        return provinceID;
    };
    
   
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getCityCode() {
        return cityCode;
    }
    
    

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

        

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }}
