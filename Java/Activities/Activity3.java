package activity;


public class Activity3 {

    public static void getAgeOnPlanets(float ageInSeconds){

        float ageOnEarth = ageInSeconds/31557600;
        System.out.println("Age of the person on earth is " + ageOnEarth + " years");
        System.out.println("Age of the person on Mercury is " + ageOnEarth/0.2408467 + " years");
        System.out.println("Age of the person on Venus is " + ageOnEarth/0.61519726 + " years");
        System.out.println("Age of the person on Mars is " + ageOnEarth/1.8808158 + " years");
        System.out.println("Age of the person on Jupiter is " + ageOnEarth/11.862615 + " years");
        System.out.println("Age of the person on Saturn is " + ageOnEarth/29.447498 + " years");
        System.out.println("Age of the person on Uranus is " + ageOnEarth/84.016846 + " years");
        System.out.println("Age of the person on Neptune is " + ageOnEarth/164.79132 + " years");
    }
    public static void main(String[] args){
        int ageInSeconds = 820497600;
        getAgeOnPlanets(ageInSeconds);

    }
}
