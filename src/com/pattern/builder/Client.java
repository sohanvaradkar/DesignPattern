package com.pattern.builder;

public class Client {
    public static void main(String[] args) {
        System.out.println("**Builder Design Pattern **");
        Director director=new Director();

        BuilderInterface carBuilder=new car();
        BuilderInterface motorBuilder=new MotorCycle();

        //Making a Car
        director.construct(carBuilder);
        Product p1=carBuilder.getVehicle();
        p1.show();

        //Making a  MotorCycle
        director.construct(motorBuilder);
        Product p2=motorBuilder.getVehicle();
        p2.show();
    }
}
