import java.util.*;
public class arraylist {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<Integer>();
        // adding a full array in array list
        int[] a={2,3,4,5};
        for(int i=0;i<a.length;i++){
            list.add(a[a.length-1-i]);
        }
        // System.out.println(list);
    
    // add elelments in array list
    list.add(3);
    // System.out.println(list);
    // get a specific item from array list
    int n=list.get(3);
    // System.out.println(n);
// add elements in between the list
list.add(2,9);
System.out.println(list);


    }

}
