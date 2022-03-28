import java.util.*;

public class mountain {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        arr=input(arr,sc);
        
        int index=binarysearch(arr);
        System.out.println(index);
        
}
public static int[] input(int[] arr,Scanner sc){
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    return arr;
}
public static int binarysearch(int[] arr){
    int st=0;
    int end=arr.length-1;
    while(st<=end){
        int mid=st + (end-st)/2;
        if(arr[mid-1]>arr[mid] && arr[mid]<arr[mid+1]){
            return mid;
        }else if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]){
            end=mid-1;
        }else{
            st=mid+1;
        }

    }return -1;}




}