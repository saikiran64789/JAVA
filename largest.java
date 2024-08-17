
import java.util.*;

public class largest {
/*   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b  = in.nextInt();
    int c = in.nextInt();*/ 
   
   
   /*//Q: find largest of the three numbers
   int max = a;
   if(b>max){
    max = b;

   }
   if(c > max )
   {
    max = c;
   }
   System.out.println("large number:"+max);
}*/

//another methed

/*int max = Math.max(c, Math.max(a,b));

System.out.println("large number:"+max);
*/

//case check problems
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char ch = in.next().trim().charAt(0);

    if(ch>='a' && ch <='z'){
        System.out.println("Lowercase");


    }else{

    
    System.out.println(ch);

    }
}

}