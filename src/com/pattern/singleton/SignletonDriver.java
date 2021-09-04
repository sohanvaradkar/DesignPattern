package com.pattern.singleton;

public class SignletonDriver {
    public static void main(String[] args) {
        SingletonLazy singletonLazy=SingletonLazy.getInstance();
        singletonLazy.setData(55);

        System.out.println("First Instance "+singletonLazy);
        System.out.println("First Instance Data Value "+singletonLazy.getData());

        singletonLazy=null;
        singletonLazy=SingletonLazy.getInstance();
      //  singletonLazy.setData(22);

        System.out.println("Second Instance "+singletonLazy);
        System.out.println("Second Instance Data Value "+singletonLazy.getData());

    }
}
