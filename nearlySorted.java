import java.util.*;
public class nearlySorted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(find(arr,k));
    }
    public static int find(int[] arr,int k){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(mid==0) {
                if(arr[mid+1]==k){
                return mid+1;}else{

                    return -1;}
                
            }else if(mid==arr.length-1 ){
                if(arr[mid-1]==k){
                return mid-1;}else{
                    return -1;
                }
                
            }else if(arr[mid]==k){
                return mid;
            }else if(arr[mid+1]==k){
                return mid+1;
            }else if(arr[mid-1]==k){
                return mid-1;
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }return -1;
    }
}
