package com.pattern.builder;

public class Phone {
    private String OS;
    private int ram;
    private String processor;
    private double screensize;
    private int battery;

    public Phone(String OS, int ram, String processor, double screensize, int battery) {
        this.OS = OS;
        this.ram = ram;
        this.processor = processor;
        this.screensize = screensize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screensize=" + screensize +
                ", battery=" + battery +
                '}';
    }
}
