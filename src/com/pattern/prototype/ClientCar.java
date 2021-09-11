package com.pattern.prototype;

public class ClientCar {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(" **prototype demo** ");
        BasicCarCache.loadCache();

        BasicCar bc1= (BasicCar) BasicCarCache.getCar("green nano");
        bc1.price= bc1.price+BasicCar.setPrice();
        System.out.println("Car is "+bc1.getModelName()+" and its price is rs "+bc1.price);

        bc1= (BasicCar) BasicCarCache.getCar("ford yellow");
        bc1.price= bc1.price+BasicCar.setPrice();
        System.out.println("Car is "+bc1.getModelName()+" and its price is rs "+bc1.price);
    }
}
