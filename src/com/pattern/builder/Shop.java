package com.pattern.builder;

public class Shop {
    public static void main(String[] args) {
        Phone p=new PhoneBuilder().setOS("mac").setBattery(3000).getPhone();
        System.out.println(p);
    }
}
