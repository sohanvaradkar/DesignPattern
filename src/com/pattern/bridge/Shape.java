package com.pattern.bridge;

abstract class Shape {
    protected ColorInterface color;

    protected Shape(ColorInterface c)
    {
        this.color=c;
    }
    abstract void drawShape(int border);
    abstract void modifyBorder(int border,int increment);
}

class Triangle extends Shape{
    protected Triangle(ColorInterface c)
    {
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This is Triangle with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("now we are changing the border legnth "+increment+"times");
        border=border+increment;
        drawShape(border);
    }

}

class Rectangle extends Shape{
    protected Rectangle(ColorInterface c)
    {
        super(c);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This is Rectangle with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("now we are changing the border legnth "+increment+"times");
        border=border+increment;
        drawShape(border);
    }

}
