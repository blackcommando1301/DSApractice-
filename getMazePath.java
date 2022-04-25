import java.util.*;
public interface getMazePath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(gmm(1,1,n,m));

    }
    public static ArrayList<String> gmm(int sr,int sc,int dr,int dc){
        if(sc==dc && sr==dr){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        if(sc>dc || sr>dr){
            ArrayList<String> base=new ArrayList<>();
        
            return base;
        }

        ArrayList<String> mylist=new ArrayList<>();
        ArrayList<String> vlist=gmm(sr+1,sc,dr,dc);
        ArrayList<String> hlist=gmm(sr,sc+1,dr ,dc);

        for(String s:vlist){
            mylist.add("v"+s);
        }
        for(String s:hlist){
            mylist.add("h"+s);
        }
        return mylist;

    }
}
