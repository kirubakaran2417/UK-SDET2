package arrayss.oops;

public class Circle implements Shape,Colour{
    @Override
    public void calculateArea() {
        double area = 3.14*10*10;
        System.out.println(area);
    }

    @Override
    public void calculateVolume() {
        double volume = 3.14*10*10*10;
        System.out.println(volume);
    }

    @Override
    public void setColor() {
        System.out.println("Color is red");
    }
}
