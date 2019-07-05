package io.zipcoder.polymorphism;

public abstract class Pet {

    private String speak;
    private String name;

    public Pet(String speak, String name){

        this.speak= speak;
        this.name= name;
    }

    public String speak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public abstract String speak();
}
