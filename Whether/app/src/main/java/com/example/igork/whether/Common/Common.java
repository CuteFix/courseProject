package com.example.igork.whether.Common;

import android.location.Location;

import com.google.android.gms.location.LocationRequest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Common {

    public static final String APP_ID = "98ce83373ce572bb7493f091c9586721";
    public static Location current_location=null;

    public static String convertUnixToDate(long dt) {
        Date date  = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long dt) {
        Date date  = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formatted = sdf.format(date);
        return formatted;
    }
}