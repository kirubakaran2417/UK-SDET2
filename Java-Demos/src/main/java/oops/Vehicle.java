package oops;

public class Vehicle {

    String brand;
    int speed;

    int torque=221;

    Vehicle(String brand, int speed){
        this.brand=brand;
        this.speed=speed;
    }
    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
    }

    void start(){
        System.out.println(brand+" is started");
    }
}
