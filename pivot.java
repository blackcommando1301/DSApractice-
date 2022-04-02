import java.util.*;
public class pivot {
    public static void main(String[] args){
        
        
        int[] arr={7,9,10,11};
       System.out.println( findpivot(arr));

    }
    public static int findpivot(int[] arr){
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int mid=st + (end-st)/2;
            if(arr[mid]>=arr[0]){
                st=mid+1;
            }else{
                end=mid;
            }

        }
        return st;
    }
    
}
