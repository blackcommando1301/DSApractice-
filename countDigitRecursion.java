import java.util.*;
public class countDigitRecursion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Count(n));
    }
    static int count=0;
    public static int Count(int x){
       
        if (x<=0){
           return count;
           }
           else if(x>0){
            count =count + x%10;
            return  Count(x/10);
            }else{
                return 0;
            }
           
    
     
    
  }
       
      

    }

