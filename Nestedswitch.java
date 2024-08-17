import java.util.*;
import java.lang.*;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        
        switch(empID)
        {
            case 1:
              System.out.println("saikiran");
              break;
            case 2:
            System.out.println("harshavardhan");
            break;

            case 3:
            System.out.println("EMP Number 3");

            switch (department)
            {
                case "IT":
                System.out.println("IT Department");
                break;

                case "management":
                System.out.println("management Department");
                break;
                
                default:
                System.out.println("No department entered");
                
            }
            break;
            
            default:
            System.out.println("enter correct EMPID");
        }
    }
    
}
