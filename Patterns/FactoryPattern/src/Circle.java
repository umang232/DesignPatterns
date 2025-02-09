public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("It's a circle" );
    }

    @Override
    public void area(int num) {
        System.out.println("Area = "+ 3.14*num*num);
    }

}
