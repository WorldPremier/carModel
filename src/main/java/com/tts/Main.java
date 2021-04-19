package com.tts;

import java.util.ArrayList;

class Main {

    public static class InstanceCounter{
        private static int numInstances = 0;
    }



    public static void main(String[] args) {

        System.out.println("==== Static Class ====");
        System.out.println(InstanceCounter.numInstances);



        System.out.println("==== Dot Method=====");
        ArrayList<String> theList = new ArrayList<>();

        theList.add("First");
        theList.add("Second");

        int size = theList.size();

        System.out.println(size);

        String val = theList.get(1);

        System.out.println(val);

        System.out.println("===== Car ======");

//        Car car = new Car();
//        car.color = "blue";
//        car.numberOfDoor = 4;
//        car.model = "Prius";


        Car car = new Car("blue", 4, "Prius");

        car.start();
        car.stop();
        car.drive();

//        System.out.println(car.color);
//        System.out.println(car.numberOfDoors);
//        System.out.println(car.model);
//
//
//
//        System.out.println("==== Car 1 ===");
//        Car car1 = new Car();
//        System.out.println(car1.color);
//        System.out.println(car1.numberOfDoors);
//
//
//        System.out.println("===== Car 2 ======");
//        Car car2 = new Car("Red");
//
//        System.out.println(car2.color);
//        System.out.println(car2.numberOfDoors);

        System.out.println("=== Class modified ===");
        Car sporty = new Car("Red",2);
        sporty.start();
        sporty.drive();

        System.out.println();

        Car family = new Car();
        family.setColor("Gold");
        family.setNumberOfDoors(4);
        family.start();
        family.drive();
        System.out.println(family.getColor());
        System.out.println(family.getNumberOfDoors());
        System.out.println();

        System.out.println("====Overloading===");

        family.drive();
        family.drive(300);
        family.drive(600,75);
        family.drive("California");














    }
}