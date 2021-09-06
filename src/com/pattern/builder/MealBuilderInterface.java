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
            meal.add(new VegBurger());
    }

    @Override
    public void buildDrink() {
            meal.add(new Coke());
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
        nonVegMeal.
    }

    @Override
    public void buildDrink() {

    }

    @Override
    public Meal getMeal() {
        return null;
    }
}
