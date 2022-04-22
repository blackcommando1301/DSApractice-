import java.io.*;
import java.util.*;

public class subsquence {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        System.out.println( getStairPaths(n));

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> newlist=new ArrayList<>();
        if(n>=1){
            ArrayList<String> ral=getStairPaths(n-1);
            for(String s:ral){
                newlist.add(1+s);
            }
        }
        if(n>=2){
            ArrayList<String> ral=getStairPaths(n-2);
            for(String s:ral){
                newlist.add(2+s);
            }
        }
        if(n>=3){
            ArrayList<String> ral=getStairPaths(n-3);
            for(String s:ral){
                newlist.add(3+s);
            }
        }
        return newlist;
    }

}