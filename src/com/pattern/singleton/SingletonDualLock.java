package com.pattern.singleton;

public class SingletonDualLock {
    private volatile  static SingletonDualLock uniqueInstance=null;
    private int data=0;

    private  SingletonDualLock()
    {}

    public static SingletonDualLock getInstance()
    {
        if (uniqueInstance==null)
            synchronized (SingletonDualLock.class) {
                if (uniqueInstance==null)
                uniqueInstance = new SingletonDualLock();
            }
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
