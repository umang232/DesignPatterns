public class Vehicle{
    DriveStrategy driveObj;

    public Vehicle(DriveStrategy obj){
        driveObj = obj;
    }

    public void drive(){
        driveObj.drive();
    }

}