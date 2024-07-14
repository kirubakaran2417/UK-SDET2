package oops;

public class Car {

    //Properties of the car
    String colour;
    String model;
    int speed;

    //constructor to initialize the car
    Car(String colour, String model, int speed){
        this.colour = colour;
        this.model = model;
        this.speed = speed;
    }

    //behaviour of the car5
    void drive(){
        System.out.println(model+" is driving at "+speed+" km/h");
    }

    void stop(){
        System.out.println(model+" is stopped");
    }
}
