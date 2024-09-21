package arrayss.oops;

public class Square extends Calculator implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("Area of Square: "+(10*10));
    }

    @Override
    public void calculateVolume() {

    }
}
