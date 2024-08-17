import java.util.*;
import java.lang.*;

public class swap {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

    swap (a , b);

    System.out.println(a+ " " + b);

    String name = "saikiran";
    changeName(name);
    System.out.pritln(name);
         
    }
    Static void changeName(String name){
        name = "saikiran";

    }
    Static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

    }
}
