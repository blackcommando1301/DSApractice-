package binarySearch;
import java.util.*;
public class indexInJava {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=5;
        System.out.println(search(arr, k));
    }
    public static int search(int[] arr,int k){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid= st + (end-st)/2;
            if(arr[mid]==k){
                
                return mid;
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return -1;
    }
}
