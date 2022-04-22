import java.util.*;
public class printNatural {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
          int y=  printAvg(n,x);
        System.out.println(y);

    }

    public static int  printAvg(int n,int x){
       if(n==0){
           return 1;
       }
       int y=printAvg(n-1, x);
       return y*x ;
      
    }
}
