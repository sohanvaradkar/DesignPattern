package com.pattern.singleton;

public class SingletonSync {
    private static SingletonSync uniqueInstance=null;
    private int data=0;

    private  SingletonSync()
    {}

    public static SingletonSync getInstance()
    {
        if (uniqueInstance==null)
            uniqueInstance=new SingletonSync();

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
