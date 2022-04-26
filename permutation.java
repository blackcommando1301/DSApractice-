import java.util.*;
public class permutation {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(permu(s));

    }

    public static ArrayList<String> permu(String str){
        if(str.length()==0){
            ArrayList<String> base =new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ans=new ArrayList<>();
           for(int i=0;i<str.length();i++){
               char main=str.charAt(i);
               String res =str.substring(0, i) + str.substring( i+1) ;
               ArrayList<String> rres=permu(res);
               for(String s:rres){
                
                   ans.add(main + s);
               }

           }
           return ans;
    }
}
