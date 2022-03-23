import java.util.*;
public class dupilcateArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int mini=Integer.MAX_VALUE;
            int sum=0;
            for(int i=0;i<n;i++){
               arr[i]=sc.nextInt(); 
                mini=Math.min(mini, arr[i]);
                 sum=sum+arr[i];
            }
            System.out.println(sum-mini);
        }
        
    }
    
}
