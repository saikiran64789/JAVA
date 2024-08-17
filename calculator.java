import java.util.*;
import java.lang.*;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        //take input from user till user does not press X or x
        int ans = 0;
        while(true){
            //true the operator as input
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                //input two numbers
                System.out.println("Enter the number:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
                if(op == '+'){
                    ans = num1+num2;
                }
                if(op == '-'){
                    ans = num1-num2;

            }
            if(op == '*'){
                ans = num1*num2;
             }
           if(op == '/'){
            if(num2 != 0){
                ans = num1 / num2;
            }
        }
        if(op == '%'){
            ans = num1 % num2;
        }
    }else if(op == '*'  || op == 'x'){
        break;
    }else{
        System.out.println("invalid operation!!");
    }



        System.out.println(ans);
}
    }
    
}

