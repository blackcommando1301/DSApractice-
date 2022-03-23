import java.util.*;
public class practice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(solve(arr,k));


    }
    public static int solve(int[] arr, int k) {
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(mid==0||mid==arr.length-1){
                if(arr[mid]==k){
                   return mid+1;
                }else{
                    return -1;
                }
            }else if(arr[mid]<arr[mid-1]){
                if(arr[mid]>k && arr[mid-1]<k){
                    end=mid-1;
                }else if(arr[mid]<k && arr[st]<k){
                    st=mid+1;

                }
            }else{
                return mid;
            }
        }return -1;
    }
}
