package basics;

public class Robot {

    //attributes of robot
    String name;
    String modelnumber;
    int yearmade;

    public Robot(String name, String modelnumber, int yearmade) {
        this.name = name;
        this.modelnumber = modelnumber;
        this.yearmade = yearmade;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Model Number: " + modelnumber);
        System.out.println("Year Made: " + yearmade);
    }

    public static void main(String[] args) {

        Robot r1 =new Robot("chitti","RX-78",2011);
        Robot r2 =new Robot("ra one","RX-79",2012);

        r1.display();
        r2.display();
    }
}
