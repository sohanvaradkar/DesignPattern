package com.pattern.prototype;

import java.util.Random;

public class BasicCar {
   protected   String modelName;
     int price;

    public String getModelName() {
        return modelName;
    }

    public BasicCar setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }


    public static int  setPrice() {
        int price=0;
        Random random=new Random();
        int p= random.nextInt(100000);
        price = p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException{
        BasicCar clone=null;
        try {
            clone= (BasicCar) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}

class Ford extends BasicCar implements Cloneable{
    public Ford(String m)
    {
        modelName=m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
class Nano extends BasicCar  implements Cloneable{
    public Nano(String m)
    {
        modelName=m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }
}
