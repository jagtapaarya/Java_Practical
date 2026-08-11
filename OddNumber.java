
//15/7/2026
//Odd NUmbers Between 20 and 70
import java.util.*;
import java.io.*;

class OddNumber{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
        OddNumber obj = new OddNumber(); 
        obj.OddNumber();
    }
    
   
    public void OddNumber(){
		  
		  System.out.println("OddNumber Series:");
		  
		  for(int i=20;i<70;i++){
			if(i%2!=0){
			System.out.println(+i);
		  }
        }
    }
}