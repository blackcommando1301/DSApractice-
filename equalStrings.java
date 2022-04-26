import java.util.*;
import java.util.Scanner;

public class equalStrings {

    static boolean isAnagram(String a, String b) {
        // StringBuilder A=new StringBuilder(a);
        // StringBuilder B=new StringBuilder(b);
           char[] A=a.toCharArray();
           char[] B=b.toCharArray();
           Arrays.sort(A);
         Arrays.sort(B);
         return Arrays.equals(A,B);
         
        
           
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
