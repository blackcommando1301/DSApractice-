import java.util.*;
public class chefandlanguage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int a2=sc.nextInt();
            int b2=sc.nextInt();
            int a3=sc.nextInt();
            int b3=sc.nextInt();

            if((a==a2 && b==b2)||(a==b2 && b==a2)){
                System.out.println("1");
            }else if((a==a3 && b==b3)||(a==b3 && b==a3)){
                System.out.println("2");}
                else{
                    System.out.println("0");
                }

        }

    }
}
