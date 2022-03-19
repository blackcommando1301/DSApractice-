
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){

        arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
   first(arr,k);
 }
 public static  void first(int[] arr,int k){
  int st=0;   int ff=0;   int mm=0;
  int end=arr.length-1;
   while(st<=end){
       int mid=(st+end)/2;
       if(k<arr[mid]){
           end=mid-1;
       }else if(k>arr[mid]){
           st=mid+1;
       }else{
           if(ff<=mid){
               ff=mid;
           }else{
               mm=mid;
           }

       }

   }System.out.println(ff);
   System.out.println(mm);
 }

}