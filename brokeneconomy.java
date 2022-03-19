import java.io.*;
import java.util.*;

public class brokeneconomy{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
     binarySearch(arr,k);
    
 }
  
  public static void binarySearch(int[] arr,int k){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]<k){
                st=mid+1;
            }else if(arr[mid]>k){
                end=mid+1;
            }else{
               System.out.println(k);
               return;
            }
        } System.out.println(arr[end]);
        System.out.println(arr[st]); }



}