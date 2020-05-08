package com.coolweathers.android.db;
import org.litepal.crud.DataSupport;

public class County extends DataSupport{
    
    private int id;
    
    private String CountyName;
    
    //最终使用的县城代码----对应天气id
    private String weatherId;
    
    //当前县城所属市区的id值
    private int cityID;
    
    

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public String getCountyName() {
        return CountyName;
    }
    
    

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getWeatherId() {
        return weatherId;
    }
    


    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getCityID() {
        return cityID;
    }}
