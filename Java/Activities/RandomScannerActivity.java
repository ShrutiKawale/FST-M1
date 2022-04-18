package activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers to store in an array");
        int num;
        Random indexGen = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<3;i++) {
            int temp=i+1;
            System.out.println("Enter number " +temp  +" \n");
            num = scan.nextInt();
            list.add(num);
        }
        System.out.println(list);
        int index = indexGen.nextInt(3);
        System.out.println("Random index generated is "+index);
        System.out.println("Value at random index is "+list.get(index));
    }
}
