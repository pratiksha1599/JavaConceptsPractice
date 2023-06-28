package pattern;

import java.util.Scanner;

public class Ex_Pattern4 {
	public static void main(String[] args) {

		System.out.println("Enter the rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
         for(int i=1;i<=rows;i++)
         {
        	 for(int j=1;j<=rows;j++) {
        		 if((i+j)<=rows)
        		 {
        			 System.out.print(" ");
        		 }
        		 
        		 else
        		 {
        			 System.out.print("*");
        		 }
        		 
        		 
        	 }
        	 System.out.println();
         }
		
		
	}
}
