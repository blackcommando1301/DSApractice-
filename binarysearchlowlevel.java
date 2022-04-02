import java.util.*;
public class binarysearchlowlevel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        int k=sc.nextInt();
        int index=binarysearch(arr, k);
        System.out.println(index);
        


    }
    public class Solution {
        public int solve(int[] arr, int b) {
            int min=arr[1];
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                min=Math.min(min,arr[i]);
            }
            sum-=b;
            int newsum=0;
            int ans=0;
            for(int j=min;newsum==sum;j++){
                ans=j;
            for(int i=0;i<arr.length;i++){
                 newsum=0;
                if(arr[i]>j){
                    int k=arr[i]-j;
                    newsum+=arr[i]-k;
                }
            }
            }return ans;
        }
    }
    
    
    public static int binarysearch(int[] arr,int k){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st +(end-st)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }return -1;
    }
}
