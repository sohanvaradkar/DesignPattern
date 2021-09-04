package com.pattern.singleton;
//bill pugh solution
public class SingletonEager {

    private int data=0;

    private  SingletonEager()
    {}
private static class SingletonHelper{
    private static final SingletonEager uniqueInstance=new SingletonEager();
}
    public static SingletonEager getInstance()
    {

        return SingletonHelper.uniqueInstance;
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
