package basics;

public class Student {

    String name;
    int age;
    String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    //create total marks
    public int totalMarks(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public static void main(String[] args) {

        Student s1 = new Student("John", 20, "123 Main St");
        s1.display();

        System.out.println("Total marks: " +  s1.totalMarks(80, 90, 100));
    }
}
