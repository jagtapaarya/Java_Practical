//Check IF Array Contains A Specific Number

import java.io.*;
import java.util.*;
import java.lang.*;

	class FindSpecificNumber{
		public static void main(String args[]){
		int array[]={10,20,30,40,50,60,70,80,90};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A number You Want to Find:");
		int num=sc.nextInt();
		int i,index=-1;
		boolean found=false;		
		for( i=0;i<array.length;i++){
				if(array[i]==num){
					found = true;
					index = i;
				}
			}
			if(found){
				System.out.println(num+"Found At :"+index);
			}
			else{
				System.out.println("Number Is Not present in Array!"); 
			}
				
		}
	}	
