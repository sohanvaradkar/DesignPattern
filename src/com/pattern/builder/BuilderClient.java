package com.pattern.builder;

public class BuilderClient {
    public static void main(String[] args) {
        System.out.println("** Meal Pattern Demo***");

        BuilderDirector director=new BuilderDirector();

        MealBuilderInterface vegMealBuilder=new VegMealBuilder();
        MealBuilderInterface nonVegMealBuilder=new NonVegMealBuilder();

        //Making VegMeal
        director.construct(vegMealBuilder);
        Meal vegMeal=vegMealBuilder.getMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost "+vegMeal.getCost());

        //Making NonVegMeal
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal= nonVegMealBuilder.getMeal();

        System.out.println(" \n Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost "+nonVegMeal.getCost());

    }
}
