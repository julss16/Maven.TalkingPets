package io.zipcoder.polymorphism;

public class Fish extends Pet {

    public Fish(){
        this.name= "";
        this.pet= "Fish";
    }

    public Fish(String speak, String name) {
        super(speak, name);
    }

    @Override
    public String speak(){

        return "bloop";
    }
}
