package com.pattern.adapter;

public class OnePlus implements AndroidPhone{
    @Override
    public void charge() {
        System.out.println("Charging Oneplus");
    }
}
