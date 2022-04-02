import java.util.*;
public class squareRootByBinarySearch {
    public static void main(String[] args){
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       if(n<2){
           System.out.println(n);
           return;
       }    else{
        int st=2;
        int end=n/2;
        while(st<=end){
            int mid=st + (end-st)/2;
            if(mid*mid>n){
                end=mid-1;
            }
            else if(mid*mid==n){
            System.out.println(mid);
            return;
            
            }else{
                st=mid+1;
            }
        }System.out.println(end);

           
       }

    }
}
