import java.util.*;
public class nameValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        if(str.length()>=8 && str.length()<=30){
            count++;
        }
       char a=str.charAt(0);
       if (a>='a' && a<='z' || a>='A' && a<='Z'){
            count ++;
       }
       if(str.contains("!") || str.contains("?") || str.contains("/") || str.contains(".") || str.contains(",") ){
           count ++;
       }
       if(count ==3){
           System.out.println("INVALID");
       }else{
          System.out.println("VALID"); 
       }
    }
}
