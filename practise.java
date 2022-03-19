import java.util.*;
public class practise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]>k){
                end=mid-1;
            }else if(arr[mid]<k){
                st=mid+1;
            }else{
                System.out.println(mid);
                break;
            }
        }
    }
}
