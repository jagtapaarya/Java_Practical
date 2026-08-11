//Number Guessing Game Project

import java.util.*;
import java.lang.*;
import java.io.*;

class NumberGuessingGame{
		static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		 
			
		NumberGuessingGame n1=new NumberGuessingGame();
		int RealAns=17;
		int UserAns=n1.Input();
		
		
		
		if(UserAns==RealAns){
			System.out.println("Yess!!That's The Right Number");
		
		}
		else{
			System.out.println("Maybee!!Close..");
			System.out.println("If You Wanna Try Again Enter :1");
			int choice=sc.nextInt();
				if(choice==1){
					UserAns=n1.Input();
					if(UserAns==RealAns){
						System.out.println("Yess!!That's The Right Number");
					}
					else{
						System.out.println("Try Again!!");
					}
				}
				else{
					return;
				}
				
	}
}
	 int Input(){
		System.out.println("Enter a Number You THink Is the Real Answer");
		 int UserAns=sc.nextInt();
		 return UserAns;
		}
}