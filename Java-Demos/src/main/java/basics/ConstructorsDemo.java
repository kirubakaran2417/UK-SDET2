package basics;

public class ConstructorsDemo {

    //constructors-used to initialize objects
    //constructor name and class name should be same
    //constructor can have parameters
    //constructor should not have return type

    int age;
    String name;

    ConstructorsDemo(int a,String b){
       age=a;
       name=b;
    }

    public static void main(String[] args) {
       //creating the object
        ConstructorsDemo c1=new ConstructorsDemo(25,"gopi");
        System.out.println(c1.age);
        System.out.println(c1.name);

    }
}
