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


    }
 public static int first(int[] arr,int k) {
    int n=arr.length;
    int st=0;
    int end=n-1;
    while(st<=end){
        int mid=(st+end)/2;
        if(arr[mid]==k){
            if(mid==0){
               return mid; 
            }else if(arr[mid-1]==k){
                end=mid-1;

            }else{
                return mid;
            }
            
            
           
        }else if(arr[mid]>k){
            end=mid-1;

        }else{
            st=mid+1;

        }

    } return -1;


 }  
}
