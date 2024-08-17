import java.util.*;
import java.lang.*;
public class Fiborecursion {

    public static void main(String[] args) {
        
        int ans = fibo(23);
        System.out.println(ans);

    }
    static int fibo(int n){
        //base condition
        if(n<2)
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
