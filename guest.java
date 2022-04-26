import java.util.*;
public class guest {
   public static void main(String[] args) {
       int n=3;
       System.out.println(list(n));
   } 
   public static ArrayList<String> list(int n){
        if(n==0)
        {
            ArrayList<String>base=new ArrayList<String>();
            base.add("");
            return base;
        } 

        ArrayList<String> mylist=new ArrayList<String>();
        ArrayList<String> res=list(n-1);
        for(String s:res){
            mylist.add( s + n);
        }
        for(String s:res){
            mylist.add( s);
        }
        return mylist;
   }
}
