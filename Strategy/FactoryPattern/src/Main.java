public class Main {
    public static void main(String[] args) {
        ShapeFactory obj = new ShapeFactory();
        Shape temp = obj.getShape("Circle");
        temp.draw();
        temp.area(2);
        Shape rec = obj.getShape("Rectangle");
        rec.area(4);
    }
}