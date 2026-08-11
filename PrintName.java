
//15/7/2026

//Conditional Statements
//Print The Name 20 TImes using do While loop
import java.util.*;
import java.io.*;
 class PrintName{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=1;
		int end;
		System.out.println("ENter Your Name:");
		String name=sc.next();
		System.out.println("Enter How many times u want to print:");
		end=sc.nextInt();
		do{
			System.out.println(n+ ""+name);
			n++;
		
		}
		while(n<=end);
	}
 
 }
 