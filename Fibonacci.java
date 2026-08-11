//15/7/2026

//Fibonacci
import java.util.*;
import java.io.*;

class Fibonacci{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
        Fibonacci obj = new Fibonacci(); 
        obj.fibonacci();
    }
    
   
    public void fibonacci(){
          int first=0;
		  int second=1;
		  int third=0;
		  
		  System.out.println("Fibonacci Series:");
		  
		  for(int i=0;i<15;i++){
		  third=first+second;
		  
		  
		  System.out.println(+third);
		  first=second;
		  second=third;
		  }
        }
    }
