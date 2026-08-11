//1 0 1 0 
//1 0 1 0 
//1 0 1 0 
//1 0 1 0 

import java.io.*;
import java.util.*;

class Pattern1010{
	
	public static void main(String args[]){
		
		for(int r=1;r<=4;r++){
			
			for(int c=1;c<=4;c++){
				if(c%2==1){
					
					System.out.print("1 ");
				}
				else{
					System.out.print("0 ");
				}
				
			}
			System.out.println("");
		}
	}
}