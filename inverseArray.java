 import java.util.*;
public class inverseArray {
    public static void main( String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(i==arr[j]){
                ar[i]=j;

              }
          }

        }
        for(int val:ar){
            System.out.println(val);
        }

    }
    
}
