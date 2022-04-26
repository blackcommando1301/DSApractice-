import java.util.ArrayList;

public class getMazePath2 {

    public static void main(String[] args) {
        
   
        int src=3;
        int dest=3;
        System.out.println(mazepath(1, 1, src, dest));

    }

public static ArrayList<String> mazepath(int sr,int sc,int dr,int dc){
     if(sr==dr && sc==dc){
     ArrayList<String> base=new ArrayList<>();
     base.add("");
     return base;
     }
     if(sr>dr || sc>dc){
        ArrayList<String> base=new ArrayList<>();
          return base; 
     }
    ArrayList<String>mylist=new ArrayList<>();

    ArrayList<String> vlist=mazepath(sr+1,sc,dr,dc);
    ArrayList<String> hlist=mazepath(sr,sc+1,dr,dc);
    for(String s:hlist)
    {
        mylist.add("h"+s);
    }
    for(String s:vlist)
    {
        mylist.add("v"+s);
    }
    return mylist;

}
}
