import java.util.*;
public class sortedarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
 
        int[] arr={7,8,9,10,1,2,3};

        int target=1;
       System.out.println( binarySearech( arr,target));
    }
    public static int binarySearech(int[] num,int target){   
        int st=0;
        int end=num.length-1;
        while(st<=end){
         int mid=st+(end-st)/2;
         if(num[mid]==target){
             return mid;
         }else if(num[st]<num[mid]){
             if(target>=num[st] && target<=num[mid]){
                 end=mid-1;
             }else{
                 st=mid+1;
             }
         }else{
             if(num[mid]<target && target<num[end]){
                 st=mid+1;
             }else{
                 end=mid-1;
             }
         }
        }return -1;

        
    }
}
