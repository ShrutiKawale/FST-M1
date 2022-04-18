package activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity9 {

    public static void main(String[] args){
        List<String> myList = new ArrayList<>();
        myList.add("Alice");
        myList.add("Tom");
        myList.add("Will");
        myList.add("Bella");
        myList.add("Cris");
        for(int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        System.out.println("Element at third place is as follows "+myList.get(2));
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name you wish to find in the List");
       String input =  obj.next();
        if(myList.contains(input)){
        System.out.println("Element is present.");
        }
        else{
            System.out.println("The given element is not present in the list");
        }
        System.out.println("The size of the list is "+myList.size());
        myList.remove(2);
        System.out.println("The size of the list after removing the element is "+myList.size());
}}
