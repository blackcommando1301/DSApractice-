import java.util.*;
public class StringReverseRecursionCHARACTERarray {
    public static void main(String[] args){
    String s="abcd";
    char arr[] = s.toCharArray();
     char res[]=reverse(arr, 0, arr.length-1);
     String ress =String.valueOf(res);
     System.out.println(ress);

    }
    public static char[] reverse(char[] str,int st,int end ){
        if (st>end){
            return str;
        }
        char temp=str[st];
        str[st]=str[end];
        str[end]=temp;
     
       return  reverse(str,st+1,end-1);

     }
}
