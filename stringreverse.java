

import java.util.Scanner;

public class stringreverse {	
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        
        int N1star=2*n-1;  
        int N2star=1;
        for(int i=1;i<=n;i++){
//             for first linear star
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }  
            System.out.print(" ");
//             for 1st traingle
            for(int j=1;j<=N1star;j++){
            System.out.print("*");
                }
            System.out.print(" ");
            for(int j=1;j<=N2star;j++){
            System.out.print("*");
                }
            N2star+=2;
            System.out.print(" ");
             for(int j=1;j<=N1star;j++){
            System.out.print("*");
                }
            N1star-=2;
            System.out.print(" ");
            for(int j=1;j<=n;j++){
            System.out.print("*");
        }  
            System.out.println("*");
        
        
        }
        

       
    }

   
}