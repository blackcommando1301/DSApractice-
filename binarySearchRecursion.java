import java.util.*;
public class binarySearchRecursion {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int size=arr.length;
        int key =8;
        System.out.println(binary(arr,0,size-1,key));
    }
    public static int binary(int[] arr,int st,int end,int k){
        if(st>end){
            return -1;
        }
        int mid= st + (end-st)/2;
         if(arr[mid]==k){
             return mid;
         }
         else if(arr[mid]>k){
             return binary(arr, st, mid-1, k);

         }else{
             return binary(arr, mid+1, end, k);
         }

    }
}
