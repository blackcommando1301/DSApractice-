import java.util.*;
public class occurence2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        arr=input(arr,sc);
        int k=sc.nextInt();
        int first=firstindex(arr, k);
        int last=lastindex(arr,k);
        System.out.println(first + " " );
        
        
        }
    public static int[] input(int[] arr,Scanner sc){
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static int firstindex(int[] arr,int k){
         int st=0;
         int end=arr.length-1;
         while(st<=end){
             int mid=st + (end-st)/2;
             if(arr[mid]==k){
                if( arr[mid-1]==k){
                    end=mid-1;
                }else{
                    return mid;
                }
             }else if(arr[mid]>k){
                end=mid-1;
             }else{
                 st=mid+1;
             }
         }return  -1;
    }
    public static int lastindex(int[] arr,int k){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st + (end-st)/2;
            if(arr[mid]==k){
                if(arr[mid+1]==k){
                    st=mid+1;
                }else{
                    return mid;
                }
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
                st=mid+1;
            }

        }return -1;
    
    }
}