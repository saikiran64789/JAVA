import java.util.*;
import java.lang.*;

public class shadowing {
    static int x = 90;//this well be shadowed at line 8
    public static void main(String[] args){
        System.out.pritnln(x);//90
        int x ;//the class variables at line 4 is shadowed by this
        
        System.out.println(x);
        x = 40;
         System.out.println(x);//40
        fun();
 
    }
     static void fun()
     {
        System.out.println(x);
     }
       
}
