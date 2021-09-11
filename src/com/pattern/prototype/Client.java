package com.pattern.prototype;

public class Client {
    public static void main(String[] args) {
        ShapeCachee.loadCache();

        Shape clonedShape=(Shape) ShapeCachee.getShape("1");
        System.out.println(" Shape : "+clonedShape.getType());

        Shape clonedShape2=(Shape) ShapeCachee.getShape("2");
        System.out.println(" Shape : "+clonedShape2.getType());

        Shape clonedShape3=(Shape) ShapeCachee.getShape("3");
        System.out.println(" Shape : "+clonedShape3.getType());
    }
}