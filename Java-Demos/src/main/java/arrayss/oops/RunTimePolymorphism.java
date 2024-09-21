package arrayss.oops;


class Animal{
    void sound(){
        System.out.println("Animal making a sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barking");
    }
}

class Cow extends Animal{
    void sound(){
        System.out.println("Cow mooing");
    }
}
public class RunTimePolymorphism {

    public static void main(String[] args) {
        Animal animal=new Animal();//animal reference and object
        Animal myDOg=new Dog();//Animal reference but dog object
        Animal myCow=new Cow();//Animal reference but cow object
        animal.sound();
        myDOg.sound();
        myCow.sound();
    }
}
