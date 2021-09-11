package com.pattern.prototype;

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void draw();

    public String getType()
    {
        return type;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id= id;
    }
    public Object clone()
    {
        Object clone=null;
        try {
            clone=super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return  clone;
    }
}
class  Rectangle extends Shape
{
    public Rectangle(){
        type="rectangle";
    }

    @Override
    void draw() {
        System.out.println("inside rectangle draw method ");
    }
}
class  Square extends Shape
{
    public Square(){
        type="square";
    }

    @Override
    void draw() {
        System.out.println("inside Square draw method ");
    }
}
class  Circle extends Shape
{
    public Circle(){
        type="circle";
    }

    @Override
    void draw() {
        System.out.println("inside Circle draw method ");
    }
}
