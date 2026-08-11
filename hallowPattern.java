//12/7/2026

//hallow Pattern

import java.io.*;
import java.lang.*;
import java.util.*;

class hallowPattern{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
        hallowPattern obj = new hallowPattern(); 
        obj.hallowPattern();
    }
    
   
    public void hallowPattern(){
		  
		  for(int r=0;r<=5;r++){
			for(int c=0;c<=5;c++){
		  
					if(r==0||r==5||c==0||c==5){
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



