package activity;

public class Bicycle implements BicycleParts,BicycleOperations{

    public int gears;
    public int speed;

    Bicycle(int gears,int speed){
        this.gears=gears;
        this.speed=speed;

    }

    public void applyBrake(int decrement) {
        speed = speed-decrement;
    }

    public void speedUp(int increment) {
        speed=speed+increment;

    }

    public void bicycleDesc(){
        System.out.println("this is the current speed of bicycle "+ speed);
        System.out.println("This is the number of gear" + gears);
    }
}
