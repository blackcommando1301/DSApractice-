import java.util.*;
public class gmp {
    public static void main(String[] args) {
        int n=2;
        int m=2;
      ArrayList<String> ans=  gmp(1, 1, n,m);
      System.out.println(ans);
    }
    public static ArrayList<String> gmp(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> base= new ArrayList<>();
            base.add("");
            return base;
        }
        if(sr>dr ||sc>dc){
            ArrayList<String> base= new ArrayList<>();
            
            return base;
        }
       

        ArrayList<String> mylist=new ArrayList<>();

        for(int i=1;i<dc;i++){
            ArrayList<String> hlist=gmp(sr,sc+i,dr,dc);
            for(String s:hlist){
                mylist.add("h" +i + s);
            }
        }
        for(int i=1;i<dr;i++){
            ArrayList<String> vlist=gmp(sr+i,sc,dr,dc);
            for(String s:vlist){
                mylist.add("v" +i + s);
            }
        }
        for(int i=1;i<dr|| i<dc;i++){
            ArrayList<String> dlist=gmp(sr+i,sc+i,dr,dc);
            for(String s:dlist){
                mylist.add("d" +i + s);
            }
        }
    return mylist;


    }
}
