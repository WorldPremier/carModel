package com.tts;

public class Car {

    public int numberOfDoors;
    public String color;
    public String model;

    public void start(){
        System.out.println("Car starting");
    }

    public void stop(){
        System.out.println("Car stopping");
    }
    public void drive(){
        System.out.println("Car driving");
    }

    // constructor with arguments
    public Car(String color, int doors, String model)
    {
        this.color = color;
        this.numberOfDoors = doors;
        this.model = model;
    }
    // no-arg constructor
    public Car()
    {
        color = "White";
        numberOfDoors = 2;
    }



    // constructor with a single argument
    public Car(String color)
    {
        this.color = color;
        this.numberOfDoors = 4;
    }




}