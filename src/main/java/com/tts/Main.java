package com.tts;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

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

        System.out.println(car.color);
        System.out.println(car.numberOfDoors);
        System.out.println(car.model);



        System.out.println("==== Car 1 ===");
        Car car1 = new Car();
        System.out.println(car1.color);
        System.out.println(car1.numberOfDoors);


        System.out.println("===== Car 2 ======");
        Car car2 = new Car("Red");

        System.out.println(car2.color);
        System.out.println(car2.numberOfDoors);







    }
}