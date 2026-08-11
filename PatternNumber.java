//4 3 2 1 
//1 2 3 4
//4 3 2 1
//1 2 3 4


import java.io.*;
import java.util.*;


class PatternNumber{
		public static void main(String args[]){
		
		
		for(int r=1;r<5;r++){
			
			for(int c=1;c<5;c++){
				
				if(c%2==1){
					System.out.println("1 2 3 4");
				}
				else{
					System.out.println("4 3 2 1");
				}
			}
		
		}
		
	}
}