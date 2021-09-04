package com.pattern.singleton;
//bill pugh solution
public class MakeACaptain {
    public  MakeACaptain(){}

    private static class SingletonHelper
    {
        private static final MakeACaptain captain=new MakeACaptain();
    }
    public  static MakeACaptain getCaptain()
    {
        return SingletonHelper.captain;
    }

    public static void main(String[] args) {
        System.out.println("**Singleton Pattern Demo**");
        System.out.println("Making New Captain");
        MakeACaptain c1=MakeACaptain.getCaptain();
        System.out.println("Trying to make Another captain for Team");
        MakeACaptain c2=MakeACaptain.getCaptain();

        if (c1==c2)
            System.out.println("c1 and c2 is same instance");
    }
}
