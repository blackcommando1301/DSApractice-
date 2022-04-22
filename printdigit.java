import java.util.*;
public class printdigit{
public static void main(String[] args){
    String [] arr={"zero","one","two","three","four","five","six","seven","eight","nine"}; 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    printDigit(n,arr);
}

public static void printDigit(int n,String[] arr){
    if(n==0){
        return ;
    }
    printDigit(n/10, arr);
    int digit=n%10;
    System.out.print(arr[digit] +"  "   );
}
}