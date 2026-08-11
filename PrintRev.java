//15/7/2026
//PrintRev
import java.util.*;
import java.io.*;

class PrintRev{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
        PrintRev obj = new PrintRev(); 
        obj.printReverse();
    }
    
    // Method to print reverse numbers
    public void printReverse(){
        System.out.print("Enter The Start: ");
        int start = sc.nextInt();
        
        System.out.print("Enter The End: ");
        int end = sc.nextInt();
        
        System.out.println("Reverse Numbers Are:");
        for(int i = start; i >= end; i--){ 
            System.out.println(+i);
        }
    }
}