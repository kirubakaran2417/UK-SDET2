package arrayss.oops;

abstract class Vehicle2{
    abstract void startEngine();
}

class Cars extends Vehicle2{

    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
}

class Truck2 extends Vehicle2{
    void startEngine(){
        System.out.println("Truck engine started");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Vehicle2 v = new Cars();
        v.startEngine();

        Vehicle2 v1 = new Truck2();
        v1.startEngine();
    }

}
