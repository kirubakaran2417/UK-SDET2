package basics;

public class Person {

    int age;
    String name;
    int height;

    public void playing(){
        System.out.println(name+" playing");
    }

    public void eating(){
        System.out.println(name+" eating");
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.age = 10;
        person.height =6;
        person.name = "John";
        person.playing();
        person.eating();
        Person person2 = new Person();
        person2.age = 10;
        person2.height =6;
        person2.name = "chetan";
        person2.playing();
        person2.eating();
    }
}
