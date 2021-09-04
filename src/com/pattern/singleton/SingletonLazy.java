package com.pattern.singleton;

public class SingletonLazy {
    private static SingletonLazy uniqueInstance=null;
    private int data=0;

    private  SingletonLazy()
    {}

public static SingletonLazy getInstance()
    {
        if (uniqueInstance==null)
            uniqueInstance=new SingletonLazy();

        return uniqueInstance;
    }

    public  void setData(int myData)
    {
        data=myData;
    }
    public int getData()
    {
        return data;
    }
}
