package io.zipcoder.polymorphism;

public abstract class Pet {

     String name;
     String pet;


    public Pet() {
        this.name = "";
        this.pet= "";
    }

    public Pet(String name, String pet){

        this.name= name;
        this.pet= pet;
    }

    public String speak() {
        return "Everything is awesome!";
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }


}
