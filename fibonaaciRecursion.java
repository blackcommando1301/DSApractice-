import java.util.*;
public class fibonaaciRecursion {
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      fib(n,0,1);

  }  
  public static void fib(int n,int a,int b){
      if(n==0){
          return ;

      }
      System.out.println();
      fib(n-1, b, a+b);
     
  }
}
