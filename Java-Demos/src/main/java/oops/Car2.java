package oops;

public class Car2 extends Vehicle {

    int numberofDoors;


    Car2(int speed,String brand,int numberOfDoors){
        super(brand,speed);//used to call the constructor
        this.numberofDoors=numberOfDoors;
    }
    void openTrunk(){

        super.torque=225;
        System.out.println("the trunk is open");
    }
}
