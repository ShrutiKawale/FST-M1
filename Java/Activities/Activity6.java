package activity;

import java.net.StandardSocketOptions;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Activity6 {
    public static void main(String[] args){
        int numberOfPassengers =5;
        Plane plane =new Plane(numberOfPassengers);
        String[] passenger1 ={"Harry","Nevil","Ron","Luna","Fred","Snape"};
        //System.out.println(passenger1);
        plane.onboard(passenger1);
        plane.takeOff();
       ArrayList<String> onBorderPassenger =  plane.getPassengers();
        for(int i=0; i < onBorderPassenger.size(); i++){
            System.out.println( onBorderPassenger.get(i) );
        }

        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println(e.getStackTrace());}
        plane.land();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("The plane landed at "+ dtf.format(plane.getLastTimeLanded()) );


    }
}
