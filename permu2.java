import java.util.*;
public class permu2 {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(permu2(s));
    }

    public static ArrayList<String> permu2(String str){
        if(str.length()==0){
          ArrayList<String> base=new ArrayList<>();
          base.add("");
          return base;
        }

     ArrayList<String> mylist=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char main=str.charAt(i);
            String res=str.substring(0,i) + str.substring(i+1);
            ArrayList<String> rres=permu2(res);
            for(String s:rres){
                 mylist.add(main + s);   
            }
        }
        return mylist;
    }
}
