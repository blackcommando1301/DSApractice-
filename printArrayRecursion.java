import java.util.*;
public class printArrayRecursion {
    public static void main(String[] args){
        int[] n={1,3,4,5,6,7};
        print(n,6);

    }
    public static void print(int[] arr,int l){
        if(l==0){
            return ;
        }
        
        print(arr, l-1);
        System.out.println(arr[l-1]);


    }
}
