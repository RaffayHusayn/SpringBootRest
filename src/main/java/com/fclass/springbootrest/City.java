package com.fclass.springbootrest;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
    @Id
    private String name;
    private int temperature;
    private String precipitation;

    public void setName(String c){
        this.name = c;
    }
    public void setTemperature(int t){
        this.temperature = t;
    }
    public void setPrecipitation(String p){
        this.precipitation = p;
    }
    public String getName(){
        return name;
    }
    public int getTemperature(){
        return temperature;
    }
    public String getPrecipitation(){
        return precipitation;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temp=" + temperature +
                ", city='" + name + '\'' +
                ", precipitation='" + precipitation + '\'' +
                '}';
    }
}
