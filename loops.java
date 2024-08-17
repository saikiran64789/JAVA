import java.util.*;
import java.lang.*;

public class loops {
    public static void main(String[] args)
    {
        /*syntax of for loops:
         
        for(intialisation;condition;increment/decrement)
        {
        //body
        }
         */
        
       /*//Q:print number from 1 to 5

       for(int num=1;num<10;num +=1)
       {
        System.out.println(num);
       }
       

       //print numbers from 1 to n
       Scanner in = new Scanner (System.in);
       int n = in.nextInt();

       for(int num = 1; num<= n; num++)
       {
        System.out.println("hello world");

       }*/

       //while loop
       /*syntax
         while(condition){
         //body
         }
        */
      
         int num = 1;
         while(num <= 5)
         {
            System.out.println(num);
            num +=1;
         }
        //output 1 2 3 4 5

    /*     //do while 
        syntax 
           do{

           }while(condition);
    */
    int n= 1;
    do{
        System.out.println("hello world");

    }while(n !=1);
    
    }    
}
