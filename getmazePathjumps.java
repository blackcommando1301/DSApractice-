import java.util.*;
public class getmazePathjumps {
    public static void main(String[] args) {
      int n=2;
      int m=2;
      System.out.println(gmp(1, 1, n, m));
    }
    public static ArrayList<String> gmp(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> base =new ArrayList<>();
            base.add("");
            return base;
        }
        if(sr>dr || sc>dc){
            ArrayList<String> base=new ArrayList<>();
            return base;
        }
         ArrayList<String> mylist=new ArrayList<>();
         ArrayList<String> vlist=new ArrayList<>();
         ArrayList<String> hlist=new ArrayList<>();
         ArrayList<String> dlist=new ArrayList<>();
          for(int i=1;i<dr;i++){
             vlist=gmp(sr+i,sc,dr,dc);
             for(String s:vlist){
                mylist.add("v" + i + s);
            }
          }
          for(int i=1;i<dc;i++){
             hlist=gmp(sr,sc+i,dr,dc);
             for(String s:hlist){
                mylist.add("h" + i + s);
            }
        }
        for(int i=1;i<dr || i<dc;i++){
        dlist=gmp(sr+i,sc+i,dr,dc);
        for(String s:dlist){
            mylist.add("d" + i + s);
        }
        }
         
       return mylist;
    }
}
