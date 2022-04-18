package activity;

public class Activity8 {

    public static String exceptionTest(String message) throws CustomException {
        if(message!=null){
            return message;
        }
        else{
            throw new CustomException("The passed value for string is null please checHak");
        }
    }

    public static void main(String[] args){
        String message1 ="Hello World";
        String message2=null;
        try {
            System.out.println(Activity8.exceptionTest(message1));
        }
        catch(CustomException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(Activity8.exceptionTest(message2));
        }
        catch(CustomException e){
            System.out.println(e.getMessage());
        }

    }
}
