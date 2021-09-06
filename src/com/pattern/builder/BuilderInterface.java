package com.pattern.builder;

public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();
}
class car implements BuilderInterface
{
    private Product product=new Product();

    @Override
    public void buildBody() {
        product.add("this is body of car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}

class MotorCycle implements BuilderInterface
{
private Product product=new Product();
    @Override
    public void buildBody() {
         product.add("this is body of MotorCycle");
    }

    @Override
    public void insertWheels() {
        product.add("Two wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("one  HeadLights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
