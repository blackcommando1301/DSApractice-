import java.util.*;
public class tiles {
 public static void main(String[] args) {
     int n=4;
     int m=2;
     System.out.println(tiles(n, m));
 }
 public static int  tiles(int n,int m){
      if(n==m){
        //   ArrayList<String> base=new ArrayList<>();
        //   base.add("vvhh");
        //   base.add("hhvv");
        //   return base;
        return 2;
      }
      if(n<m){
        // ArrayList<String> base=new ArrayList<>();
        // base.add("hhhh");
        // return base;
        return 1;
      }
   int  ans =  tiles(n-1,m) + tiles(n-m,m);
   return ans ;

    // ArrayList<String> mylist=new ArrayList<>();
    // ArrayList<String> htile=tiles(n-1,m);
    // ArrayList<String> vtile=tiles(n-m,m);

    // for(String s:htile){
    //     mylist.add("h" + s);
    // }
    // for(String s:vtile){
    //     mylist.add("v" + s);
    // }
    // return mylist;
 }

}
