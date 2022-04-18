package activity;

public class Activity12 {
    public static void main(String[] args){
        Addable var1 =(int num1,int num2)-> (num1+num2);
        System.out.println(var1.add(2,3));
        Addable var2 =(int num1,int num2)->{

            return (num1+num2);
        };
        System.out.println(var2.add(7,9));
    }

}
