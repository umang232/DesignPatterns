public class Main{
    public static void  main(String[] args){
        Vehicle car = new Car();
        car.drive();

        Vehicle bike = new Bike();
        bike.drive();

        Vehicle l = new Lambo();
        l.drive();
    }
}