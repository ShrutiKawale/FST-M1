package activity;

import java.net.StandardSocketOptions;

public class Activity2 {

    public static boolean checkSumInArray(int[] array) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                sum = sum + array[i];
            }
        }
        if(sum==30){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){

        int[] array={10, 77, 10, 54, -11, 10};
        System.out.println(checkSumInArray(array));

    }

}
