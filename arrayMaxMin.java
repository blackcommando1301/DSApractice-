import java.util.*;
public class arrayMaxMin{
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] arr=new int[n];
     int max=0;
     int min=Integer.MAX_VALUE;
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
         max=Math.max(arr[i], max);
         min=Math.min(arr[i], min);
     }
     int ans=max-min;
     System.out.println(ans);

 }
}