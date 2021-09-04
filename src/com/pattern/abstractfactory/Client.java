package com.pattern.abstractfactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory=FactoryProducer.getFactory("SHAPE");
        Shape shape=factory.getShape("CIRCLE");
        shape.draw();

        Shape shape1=factory.getShape("SQUARE");
        shape1.draw();

        Shape shape2=factory.getShape("RECTANGLE");
        shape2.draw();


        AbstractFactory colorfactory=FactoryProducer.getFactory("COLOR");
        Color color=colorfactory.getColor("GREEN");
        color.fill();

        Color color1=colorfactory.getColor("RED");
        color1.fill();

        Color color2=colorfactory.getColor("BLUE");
        color2.fill();
    }
}
