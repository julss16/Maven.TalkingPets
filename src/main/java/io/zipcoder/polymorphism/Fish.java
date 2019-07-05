package io.zipcoder.polymorphism;

public class Fish extends Pet {

    public Fish(String speak, String name) {
        super(speak, name);
    }

    @Override
    public String speak(){

        return "bloop";
    }
}
