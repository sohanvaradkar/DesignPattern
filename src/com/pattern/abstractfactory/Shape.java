package com.pattern.abstractfactory;

public interface Shape {
    void draw();
}
class Rectangle implements  Shape
{
    @Override
    public void draw() {
        System.out.println("Inside rectangle draw method");
    }
}
class Circle implements  Shape
{
    @Override
    public void draw() {
        System.out.println("Inside Circle draw method");
    }
}
class Square implements  Shape
{
    @Override
    public void draw() {
        System.out.println("Inside Square draw method");
    }
}
