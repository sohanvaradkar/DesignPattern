package com.pattern.prototype;

import java.util.Hashtable;

public class ShapeCachee {
    private static Hashtable<String,Shape> shapeMap=new Hashtable<>();

    public static Shape getShape(String shapeId)
    {

        Shape shapedCache=shapeMap.get(shapeId);
        return (Shape) shapedCache.clone();
    }

    public static void loadCache(){
     Circle circle=new Circle();
     circle.setId("1");
     shapeMap.put(circle.getId(),circle);

     Square square=new Square();
     square.setId("2");
     shapeMap.put(square.getId(),square);

     Rectangle rectangle=new Rectangle();
     rectangle.setId("3");
     shapeMap.put(rectangle.getId(),rectangle);
    }
}
