package com.pattern.builder;

interface Item {
    String name();
    Packing packing();
    float price();
}
 abstract class Burger implements Item{



     @Override
     public Packing packing() {
         return new Wrapper();
     }

     @Override
     public abstract float price() ;
     }
 }
 class VegBurger extends Burger
 {

     @Override
     public String name() {
         return "Veg Burger";
     }

     @Override
     public float price() {
         return 25.0f;
     }
 }
 class ChickenBurger extends Burger{

     @Override
     public String name() {
         return "ChickenBurger";
     }

     @Override
     public float price() {
         return 30.f;
     }
 }
     abstract class  ColdDrink implements Item
 {


     @Override
     public Packing packing() {
         return new  Bottle();
     }

     @Override
     public abstract float price();
 }
 class Pepsi extends  ColdDrink
 {
     @Override
     public float price() {
         return 1.50f;
     }
     @Override
     public String name() {
         return "Pepsi";
     }
 }
 class Coke extends ColdDrink
 {

     @Override
     public String name() {
         return "Coke";
     }

     @Override
     public float price() {
         return 2.0f;
     }
 }
 interface  Packing{
    String pack();
 }
 class  Wrapper implements Packing
 {
     @Override
     public String pack() {
         return "Wrapper";
     }
 }
 class Bottle implements Packing
 {
     @Override
     public String pack() {
         return "Bottle";
     }
 }