package activity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args){
        Set<String> hs = new HashSet<>();
        hs.add("Iron Man");
        hs.add("Spider Man");
        hs.add("Wonder Woman");
        hs.add("Batman");
        hs.add("Ant man");
        hs.add("Hulk");
        System.out.println("The size of the hashSet is "+hs.size());
        hs.remove("Captain America");
        hs.remove("Batman");
        System.out.println("The size after removing the element "+ hs.size());

        if(hs.contains("Hulk")){
            System.out.println("Given element is present in the set.");
        }
        else{
            System.out.println("The given element is absent form the set.");
        }
        /*Iterator<String> itr =  hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        System.out.println(hs);

    }
}
