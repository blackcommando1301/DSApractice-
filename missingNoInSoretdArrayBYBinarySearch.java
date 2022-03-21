import java.util.*;
public class missingNoInSoretdArrayBYBinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int ans1= find(arr);
       if(ans1==-1){
           System.out.println(n);
       }else{
           System.out.println(ans1);
       }
    }
 public static int find(int[] arr)   {
  int n=arr.length;
    int st=0;
  int end=n-1;
  int ans=-1;
  while(st<=end){
      int mid=(st+end)/2;
          if(arr[mid]==mid){
              st=mid+1;

          }else if(arr[mid]>mid){
              end=mid-1;
              ans=mid;
          }



 }return ans;
}
}