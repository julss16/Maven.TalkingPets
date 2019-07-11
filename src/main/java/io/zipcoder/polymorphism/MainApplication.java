package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {


    public static void main(String[] args){

        ArrayList<Pet> pets= new ArrayList<Pet>();
        Integer numberOfPets= null;
        Scanner scanner= new Scanner(System.in);




    while( numberOfPets== null){
        try {

            System.out.println("How many pets do you own?");
            numberOfPets = scanner.nextInt();
            if (numberOfPets <= 0) {
                System.out.println("Are you sure??");
                numberOfPets = null;
            } else if (numberOfPets >= 10) {
                System.out.println("Could I have one?");
                numberOfPets = null;
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid input! Try again.");

        }
    }

    String petName;
    String petType;

    for (int i=0; i <= numberOfPets; i++) {
        System.out.println("What is pet" + i + "'s name?");
        petName = scanner.nextLine();
        System.out.println("What kind of pet is it?");
        petType = scanner.nextLine();

        if ("dog".equals(petType.toLowerCase())) {
            Dog dog = new Dog(petName, petType);
            pets.add(dog);
        } else if ("cat".equals(petType.toLowerCase())) {
            Cat cat = new Cat(petName, petType);
            pets.add(cat);
        } else if ("fish".equals(petType.toLowerCase())) {
            Fish fish = new Fish(petName, petType);
            pets.add(fish);
        } else {
            System.out.println("Is that a real animal? Nice try! Try again :)");
            i--;
        }
    }



    }





    }


