package com.example.igork.whether.SerializableAndDeserializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main1 {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) throws  Exception{

        CoordDes ser = new CoordDes();
       //Cерелизация


        CityDes dataObj = new CityDes(1, "Одесса", 11, "Украина");
        String json = GSON.toJson(dataObj);
        System.out.println(json);

        CityDes dataObj1 = GSON.fromJson(json, CityDes.class);
        System.out.println(dataObj1.id);
        System.out.println(dataObj1.name);
        System.out.println(dataObj1.coord);
        System.out.println(dataObj1.country);

        Gson gson = new Gson();
        //String json = gson.toJson(dataObj);
        CityDes obj = gson.fromJson(json, CityDes.class);
        FileOutputStream oos1 = new FileOutputStream("ser1.txt");

        ser.setLon(34);
        ser.setLat(53);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ser.txt"));
        oos.writeObject(ser);
        oos.flush();
        oos.close();
        //Десерилизация
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ser.txt"));
        CoordDes serobj = (CoordDes) ois.readObject();
        System.out.println("Lon = " + serobj.getLon());
        System.out.println("Lat = " + serobj.getLat());
    }
}
