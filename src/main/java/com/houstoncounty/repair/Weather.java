package com.houstoncounty.repair;

public class Weather {
    String city;
    String temperatureLow;
    String temperatureHigh;
    String precipitation;
    String date;

    public Weather(String city, String temperatureLow, String temperatureHigh, String precipitation, String date) {
        this.city = city;
        this.temperatureLow = temperatureLow;
        this.temperatureHigh = temperatureHigh;
        this.precipitation = precipitation;
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public String getTemperatureLow() {
        return temperatureLow;
    }

    public String getTemperatureHigh() {
        return temperatureHigh;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public String getDate() {
        return date;
    }
}
