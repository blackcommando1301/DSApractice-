import java.util.*;
public class recursionprint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println( print(n));
    }
    public static int  print(int n){
        if(n==0){
            return 0;
        }
        int x=print(n-1);
        return n+x;
    }
}
