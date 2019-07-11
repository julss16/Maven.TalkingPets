package io.zipcoder.polymorphism;

 public class Cat extends Pet {

    public Cat(){
        this.name= "";
        this.pet= "Cat";
    }

     public Cat(String speak, String name) {
         super(speak, name);
     }

     @Override
     public String speak(){

         return "meow";
     }
 }
