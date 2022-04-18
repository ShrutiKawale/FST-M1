package activity;

public class Driver {
    public static void main(String[] args){
        MountainBike mb = new MountainBike(3, 10, 25);
        mb.bicycleDesc();
        mb.speedUp(20);
        mb.applyBrake(5);
        mb.bicycleDesc();
    }
}
