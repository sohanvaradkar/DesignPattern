package com.pattern.prototype;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String,BasicCar> hashtable=new Hashtable<>();

    public static BasicCar getCar(String carName) throws CloneNotSupportedException {
        BasicCar basicCar=hashtable.get(carName);
        return (BasicCar) basicCar.clone();
    }

    public static void loadCache()
    {
        BasicCar nano_base=new Nano("green nano");
        nano_base.price=100000;
        hashtable.put("green nano",nano_base);

        BasicCar ford_base=new Nano("ford yellow");
        ford_base.price=500000;
        hashtable.put("ford yellow",ford_base);


    }
}
