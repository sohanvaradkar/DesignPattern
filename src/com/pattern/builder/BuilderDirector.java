package com.pattern.builder;

public class BuilderDirector {
    MealBuilderInterface builderInterface;

    public void construct(MealBuilderInterface builder)
    {
        builderInterface=builder;
        builderInterface.buildBurger();
        builderInterface.buildDrink();
        builderInterface.getMeal();

    }
}
