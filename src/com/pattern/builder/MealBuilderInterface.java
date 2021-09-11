package com.pattern.builder;

public interface MealBuilderInterface {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
class VegMealBuilder implements  MealBuilderInterface{
private  Meal meal=new Meal();
    @Override
    public void buildBurger() {
            meal.addItem(new VegBurger());
    }

    @Override
    public void buildDrink() {
            meal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
class NonVegMealBuilder implements MealBuilderInterface{
private Meal nonVegMeal=new Meal();
    @Override
    public void buildBurger() {
        nonVegMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}
