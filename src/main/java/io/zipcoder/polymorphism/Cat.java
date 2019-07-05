package io.zipcoder.polymorphism;

 public class Cat extends Pet {


     public Cat(String speak, String name) {
         super(speak, name);
     }

     @Override
     public String speak(){

         return "meow";
     }
 }
