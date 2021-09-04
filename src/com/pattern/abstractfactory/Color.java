package com.pattern.abstractfactory;

public interface Color {
    void fill();
}
class Green implements Color
{
    @Override
    public void fill() {
        System.out.println(" Inside Green fill Method ");
    }
}
class Red implements Color
{
    @Override
    public void fill() {
        System.out.println(" Inside Red fill Method ");
    }
}
class Blue implements Color
{
    @Override
    public void fill() {
        System.out.println(" Inside Blue fill Method ");
    }
}
