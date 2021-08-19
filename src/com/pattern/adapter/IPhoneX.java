package com.pattern.adapter;

public class IPhoneX implements IPhone{
    @Override
    public void charge() {
        System.out.println(" Charging IPhone ");
    }
}
