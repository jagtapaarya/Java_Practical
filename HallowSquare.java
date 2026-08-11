import java.io.*;
import java.lang.*;
import java.util.*;

class HallowSquare{
		public static void main(String args[]){
			Scanner sc =new Scanner (System.in);
			System.out.println("Enter a number:");
			int num=sc.nextInt();
			for(int r=0;r<=num;r++){  
				for(int c=0;c<=r;c++){
					if(r==0||r==4||c==0||c==num){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
}