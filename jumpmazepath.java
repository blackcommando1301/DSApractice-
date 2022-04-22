
import java.util.*;

public class jumpmazepath {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        System.out.print(getMazePaths(0,0,n-1,m-1));

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(sr>dr || sc>dc){
            ArrayList<String> base=new ArrayList<>();
         
            return base;
        }
        ArrayList<String > mylist = new ArrayList<>();
        ArrayList<String > hlist = new ArrayList<>();
        ArrayList<String > vlist = new ArrayList<>();
        ArrayList<String > dlist = new ArrayList<>();
        
        for(int i=1;i<=sc;i++){
            hlist =getMazePaths(sr,sc+i,dr,dc);
            for(String s:hlist){
                mylist.add("h"+i+s);
            }
            
        }
        for(int i=1;i<=sr;i++){
              vlist =getMazePaths(sr+i,sc,dr,dc);
              for(String s:vlist){
                mylist.add("v"+i+s);
            }
        }
        for(int i=1;i<=sr ||i<=sc;i++){
             dlist =getMazePaths(sr+i,sc+i,dr,dc);
             for(String s:dlist){
                mylist.add("d"+i+s);
                
            }
        }
        return mylist;
        
        
    }

}