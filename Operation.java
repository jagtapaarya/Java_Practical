import java.io.*;
import java.util.*;
import java.lang.*;

class Operation{
    public static void main(String args[]){
        System.out.println("\n-----------------First Reverse------------\n");
        Operation so1 = new Operation();
        so1.firststop(); // call method
		System.out.println("\n-----------------Third Reverse------------\n");
		so1.thirdop();
    }

    void firststop(){
        String s = "You Are Very Very Good Students";
        // op: Students Good Very Very Are You

        String [] words = s.split(" "); // split by space
        // ["You", "Are", "Very", "Good", "Students"]

        for(int i = words.length - 1; i >= 0; i--){ // i-- to reverse
            System.out.print(words[i] + " ");
        }
    }
	
	void Secondop(){
        String s = "You Are Very Very Good Students";
        // op: Students Good Very Very Are You

        String [] words = s.split(" "); // split by space
        // ["You", "Are", "Very", "Good", "Students"]

        for(int i = words.length - 1; i >= 0; i--){ // i-- to reverse
            System.out.print(words[i] + " ");
        }
    }
	void thirdop(){
        String s = "You Are Very Very Good Students";
        // op: Students Good Very Very Are You
		String revword=" ";
		String rev_str="";
        String [] words = s.split(" "); // split by space
        // ["You", "Are", "Very", "Good", "Students"]

        for(int i = words.length - 1; i >= 0; i--){ // i-- to reverse
           String oneword=words[i];
		   
		   for(int j=oneword.length()-1;j>=0;j--){
			   revword=revword+oneword.charAt(j)+" ";
		   }
		   
        }
		System.out.print(revword+"\n");
		
    }
}