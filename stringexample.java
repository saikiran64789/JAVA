import java.util.*;
import java.lang.*;
public class stringexample {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name:");
        String naam = in.next();

        String personalised = myGreet(naam);
        System.out.println(personalised);
    }
     
    static String myGreet(String name){
        String message = "hello"+name;
        return message;

    }
    
}
