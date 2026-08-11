import java.io.*;
import java.util.*;
import java.lang.*;

class Fibonacci1{
	public static void main(String args[]){
    
		  Scanner sc=new Scanner(System.in);
          int first=0;
		  int second=1;
		  int terms,third=0;
		  System.out.println("Enter Terms How Many Terms YOU want");
		  terms=sc.nextInt();
		  
		  System.out.println("Fibonacci Series:");
		  
		  for(int i=0;i<terms;i++){
			System.out.println(+third);
			 third=first+second;
			first=second;
			second=third;
		  }
	}
}