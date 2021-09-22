package com.pattern.bridge;



public class Client {
    public static void main(String[] args) {
        System.out.println("***BRIDGE PATTERN***");
        //Coloring Green to Triangle
        System.out.println("\n Coloring Triangle");
        ColorInterface green=new GreenColor();
        Shape traingleShape=new Triangle(green);
        traingleShape.drawShape(20);
        traingleShape.modifyBorder(20,3);


        //Coloring Green to Triangle
        System.out.println("\n Coloring Rectangle");
        ColorInterface red=new RedColor();
        Shape rectangleShape=new Rectangle(red);
        traingleShape.drawShape(50);
        traingleShape.modifyBorder(50,2);
    }
}
