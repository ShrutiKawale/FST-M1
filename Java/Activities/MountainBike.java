package activity;

public class MountainBike extends Bicycle {
    int seatHeight;

    MountainBike(int height, int speed, int gears) {
        super(gears,speed);
        seatHeight = height;
    }

    public void setHeight(int newHeight) {
        seatHeight = newHeight;
    }

    public void bicycleDesc() {
        System.out.println("this is the current speed of bicycle " + speed);
        System.out.println("This is the number of gear " + gears);
        System.out.println("This is the height of seat " + seatHeight);
    }
}