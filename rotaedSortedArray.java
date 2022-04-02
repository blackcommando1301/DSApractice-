import java.util.*;
public class rotaedSortedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(search(arr,k));
    }
    public static  int pivot(int[] nums){
        int st=0;
        int end=nums.length-1;
        while(st<end){
            int mid=st +(end-st)/2;
            if(nums[mid]>=nums[0]){
                st=mid+1;
            }else{
                end=mid;
            }
        }
        return st;
    }
    public static int bs(int nums[],int st,int end,int k){
        while(st<=end){
            int mid=st + (end-st)/2;
            if(nums[mid]>k){
                end=mid-1;
            }else if(nums[mid]<k){
                st=mid+1;
            }else{
                return mid;
            }
        }return -1;
    }
    public static int search(int nums[],int target){
         int p=pivot(nums);
         
         if(nums[p]<=target && target<nums[nums.length-1]){
            return bs(nums,p,nums.length-1,target);
         } else{
            return bs(nums,0,p-1,target);
         }

        

    }
}
