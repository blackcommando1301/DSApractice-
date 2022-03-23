 import java.util.*;
 public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        if(n<0){
            n=n*-1;
            flag=1;
        }
        int sum=0;
        for(int i=n;i>0;i=i/10){
            int rem=i%10;
            sum=sum*10 +rem;

        }
        if(flag==1){
            sum=sum*-1;
        }
        System.out.println(sum);
        
    }
}
