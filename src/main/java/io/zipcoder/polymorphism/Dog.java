package io.zipcoder.polymorphism;

public class Dog extends Pet{


    public Dog(String speak, String name) {
        super(speak, name);
    }

    @Override
    public String speak(){

        return "bark!";
    }
}
