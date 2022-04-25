import java.util.*;
public class subsquencsPrac {
    public static void main(String[] args) {
        String s="123";
        System.out.println(subsequnce(s));

    }
    public static ArrayList<String> subsequnce(String str){
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> mylist=new ArrayList<>();
        String baki=str.substring(1);
         char ch=str.charAt(0);
        ArrayList<String> aayi=subsequnce(baki);
          
        for(String s:aayi){
            mylist.add(s);
        }
        for(String s:aayi){
            mylist.add(ch+s);
        }
         
        return mylist;

    }
}
