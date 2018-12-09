package com.example.igork.whether.Retrofit;

import com.example.igork.whether.Model.WeatherForecastResult;
import com.example.igork.whether.Model.WeatherResult;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWheatherMap {
    @GET("weather")
    io.reactivex.Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                              @Query("lon") String lng,
                                                              @Query("appid") String appid,
                                                              @Query("units") String unit);

    @GET("weather")
    io.reactivex.Observable<WeatherResult> getWeatherByCity(@Query("q") String CityName,
                                                              @Query("appid") String appid,
                                                              @Query("units") String unit);


    @GET("forecast")
    io.reactivex.Observable<WeatherForecastResult> getForecastWeatherByLatLng(@Query("lat") String lat,
                                                                              @Query("lon") String lng,
                                                                              @Query("appid") String appid,
                                                                              @Query("units") String unit);

}

