package activity;

public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(int tyres,int doors){
        this.tyres=4;
        this.doors=4;
    }
    //- This displays the values of all the variables
   public void  displayCharacteristics(){
        System.out.println(color+" This is the color of car");
        System.out.print(transmission+ "This is the mode of transmission");
        System.out.println(make+ "This is the make of the car");
        System.out.println(tyres+ " The car has these many tyres.");
        System.out.println(doors+" The car has these many doors.");
   }
   public void  accelarate(){
        System.out.println("Car is moving");
   }
    public void  brake(){
        System.out.println("Car has stopped.");
    }
}
