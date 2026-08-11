//12/7/2026

//Square Pattern

import java.io.*;
import java.lang.*;
import java.util.*;

class SquarePattern{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter NO. of Rows you want to print");
			int noofrows=sc.nextInt();
			
			System.out.println("Enter Number Of colums You want to print:");
			int noofcols=sc.nextInt();
			
			
			for(int r=0;r<noofrows;r++){
			
				for(int c=0;c<noofcols;c++){
				
				System.out.print("*");
				}
				System.out.println();
			}
		
		
		}

}