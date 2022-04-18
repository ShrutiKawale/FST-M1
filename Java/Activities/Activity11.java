package activity;

import java.util.HashMap;
import java.util.Map;

public class Activity11{
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"purple");
        myMap.put(2,"yellow");
        myMap.put(3,"orange");
        myMap.put(4,"green");
        myMap.put(5,"blue");
        System.out.println(myMap);
        myMap.remove(5);
        System.out.println("The hashmap after removing one element is "+myMap );
        System.out.println("The size of hashMap is "+myMap.size());

    }

}
