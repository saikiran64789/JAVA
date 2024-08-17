import java.util.*;
import java.lang.*;

public class switch1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String fruit = in.next();


         int day = in.nextInt();
         switch(day){
            case 1 :
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            
            case 7:
            System.out.println("sunday");
            break; 
            

        }



    
}
}