package basics;

public class Methods {

    //block of code that enclosed with curly braces
    //it should have return type
    //a method can return a value or it can be a void

    //how to write a method
    /*
    Access modifier
    return type-void or primitive type or class name
    method name
    parameters
    body
    return
     */

    //if it is a non static method you should call using object
    //if it is a static method you should call using class name
    public void display(){
        System.out.println("Hello World");
    }

    public int add(){
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }


    //how to call methods
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.display();
        int c = obj.add();
        System.out.println(c);
    }

}
