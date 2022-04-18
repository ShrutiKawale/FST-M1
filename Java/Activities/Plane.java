package activity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Plane {

    private ArrayList<String> passengers;
    private int maxPassengers;
    private LocalDateTime lastTimeTookOf;
    private LocalDateTime lastTimeLanded;

    Plane(int maxPassengers){
        this.maxPassengers=maxPassengers;
        passengers = new ArrayList<>(maxPassengers);
    }
    public void onboard(String[] passenger){

        for(int i=1;i<passenger.length;i++){
            passengers.add(passenger[i]);
        }
    }
    public ArrayList<String> getPassengers(){
        return passengers;
    }
    public void takeOff(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        lastTimeTookOf = LocalDateTime.now();
        System.out.println("The plane tool off at following time "+ dtf.format(lastTimeTookOf));

    }
    public void land(){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        lastTimeLanded = LocalDateTime.now();
        passengers.clear();
    }
    public LocalDateTime getLastTimeLanded(){
        return lastTimeLanded;
    }
}
