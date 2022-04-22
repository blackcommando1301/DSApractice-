import java.util.*;
public class stringReverseRecursion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(reverse(str, str.length()));

    }
    static String rev="";
    public static String reverse(String str,int n){
        if(n==0){
            return "";
        }
        rev = rev + str.charAt(n-1);
        reverse(str, n-1);
        return rev;
    }
}
