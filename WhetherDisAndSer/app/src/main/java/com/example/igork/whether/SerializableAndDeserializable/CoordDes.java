package com.example.igork.whether.SerializableAndDeserializable;

import java.io.Serializable;

public class CoordDes implements Serializable{
    private double lon;
    private double lat;

    public CoordDes() {
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }


}
