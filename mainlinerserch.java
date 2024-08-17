
import java.util.*;
import java.lang.*;
public class mainlinerserch {
public static void main(String[] args)
{ 
    int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
    int target = 197 ;
    int ans = linearsearch(nums, target);
    System.out.println(ans);
    
}
static int linearsearch(int[] arr, int target)
{
    if(arr.length == 0){ 
        return -1;

     }
     //run a for loop
    for(int index = 0;index < arr.length;index++){
        int element = arr[index];
        if(element == target)
        {
            return index;
        }
         
    }
    //this line will excute if none of the return statement above have excecuted
     
    return -1;

}
}