package com.example.igork.whether.SerializableAndDeserializable;



public class CityDes {
    public int id;
    public String name;
    public int coord;
    public String country;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCoord() {
        return coord;
    }

    public String getCountry() {
        return country;
    }

    public CityDes(int id, String name, int coord, String country) {
        this.id = id;
        this.name = name;
        this.coord = coord;
        this.country = country;
    }


}
