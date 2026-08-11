//Check whether  user enter a character,digit or special character
import java.io.*;
import java.util.*;

class Java{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter Any Single Character:");
		ch = sc.next().charAt(0);  

		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){  
			System.out.println(ch + " Is A Character!");
		}
		else if(ch>='0' && ch<='9'){ 
 
			System.out.println(ch + " Is A Digit!");
		}
		else{
			System.out.println(ch + " Is A Special Symbol!");
		}
	}
}