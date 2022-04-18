package activity;

import java.net.StandardSocketOptions;

public class Activity4 {

    public static void main(String[] args){
       int[] array = {3,4,2,10,12,1,5,6};
       int temp;
        System.out.println("Unsorted  given array is below::");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
       for(int i=0; i<array.length; i++){
           //System.out.println("********************");
           for(int j=i+1; j>0 && j<array.length;j--){
               //System.out.println(j-1+ "  "+ j);
               if(array[j-1]>array[j])
               {
                   temp = array[j-1];
                   array[j-1]=array[j];
                   array[j]=temp;
               }
           }
       }
       System.out.println("\nSorted array after sorting is below::");
       for(int i=0; i<array.length; i++){
           System.out.print(array[i] + " ");
       }


    }
}
