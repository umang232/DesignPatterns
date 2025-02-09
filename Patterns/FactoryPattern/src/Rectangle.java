import java.awt.desktop.SystemEventListener;

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("It's a rectangle");
    }

    @Override
    public void area(int num) {
        System.out.println("Area = "+ num*num);
    }
}
