import java.util.*;
import java.lang.*;


public class pattern {
    public static void main(String[] args) {
        pattern5(6);
    }
    

/*    static void pattern5(int n){
          for(int row = 0; row < 2 * n; row++){
           int totalColsInRow = row > n ? 2 * n - row: row;

           for(int col = 0; col < totalColsInRow; col++){
            System.out.print("*");
           }
           System.out.println();
          }
    }
    //output
    *
    **
    ***
    ****
    *****
    ******
    *****
    ****
    ***
    **
    *
    */

    /*static void pattern4(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            //for every row,run the col
            for(int col = 1; col <= row; col++){
                System.out.print(col+" ");
            }
            //when one  row is printed, we need to add a newline
            System.out.println();
             
        }
    }
    //output
    //1
    //1 2
    //1 2 3
    //1 2 3 4

*/

   /* static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            //for every row,run the col
            for(int col = 1; col <= n-row+1;col++)
            {
                System.out.print("*");
            }
            //when one row is printed,we need to add a newline

            System.out.println();
        }
    }*/
     ///output
     // *****
     //****
     //***
     //**
     //*

/*
    static void pattern2(int n)
    {
        for(int row = 1; row <=n; row++)
        {
            //for every row,run the cool
            for(int col = 1; col <= row; col++)
            {
                System.out.print("*");
            }
            //when one row is printed, we need to add a newline

            System.out.println();
        }
    }*/
    //output
   // *
    //**
    //***
    //****


    /*
    static void pattern1(int n)
   {
    for(int row = 1; row <= n;row++)
    {
        //for every row,run the col
        for(int col = 1;col <= row; col++)
        {
        System.out.print(" * ");

    }
     //when one row is printed,we need to add a newline

     System.out.println();
   }
    
}*/



}