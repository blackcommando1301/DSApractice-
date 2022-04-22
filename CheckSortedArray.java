import java.util.*;
public class CheckSortedArray {
    public static void main(String[] args){
        int[] arr={0,1,2,3,4};
        System.out.println(check(arr, 0,0));
    }
    public static int check(int[] arr,int n,int sum){
        
        if(n==arr.length|| arr.length==0 ){
            return sum;
        } 
         sum+=arr[n];
        return check(arr,n+1,sum);
      
    }
}
