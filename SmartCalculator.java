//Logic Implemented Will be:User WIll Give Number And Choose WHat Operation to be perfomed 1.add 2 subtract 3.multiply 4.divide 5.find remainder 6.power root 7.square root 8 cube 9.Percentage Calculator 
//🧮 Smart Calculator

import java.io.*;
import java.util.*;
import java.lang.*;

 class SmartCalculator extends Thread{
	 static Scanner sc=new Scanner(System.in);
	 
	 public static void main(String args[]){
		SmartCalculator s1=new SmartCalculator();
		 System.out.println("!======🧮 Smart Calculator======!");
		 System.out.println("=================================");
		 int choice;
		 do{
			 System.out.println("1.Addition");
			 System.out.println("2.Subtraction");
			 System.out.println("3.Multiplication");
			 System.out.println("4.Divide");
			 System.out.println("5.Find Modulus");
			 System.out.println("6.FInd Square Root");
			 System.out.println("7.Find Cube Root");
			 System.out.println("8.Find Percentage");
			 System.out.println("9.Exit");
			 System.out.println("Enter Your Choice now!:");
			 choice=sc.nextInt();
			  System.out.println("=================================");
			 switch(choice){
				case 1:
					s1.Addition();
					System.out.println("=================================");
					break;
				case 2:
					s1.Subtraction();
					System.out.println("=================================");
					break;
				case 3:
					s1.Multiplication();
					System.out.println("=================================");
					break;
				case 4:
					s1.Division();
					System.out.println("=================================");
					break;
				case 5:
					s1.Modulus();
					System.out.println("=================================");
					break;
				case 6:
					s1.SquareRoot();
					System.out.println("=================================");
					break;
				case 7:
					s1.CubeRoot();
					System.out.println("=================================");
					break;
				case 8:
					s1.Percentage();
					System.out.println("=================================");
					break;	
				case 9:
					System.out.println("Bye Bye");					
					System.out.println("=================================");
					break;	
					
			 }
			 
			 
		 }while(choice!=9);
		 
	 }
	 int Addition(){
		 int a,b,c;
		 System.out.println("Enter Two Numbers:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=a+b;
		 System.out.println("Addition is:" +c);
		 return c;
	 }
	 int Subtraction(){
		 int a,b,c;
		 System.out.println("Enter Two Number:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 c=a-b;
		 System.out.println("Subtraction is:" +c);
		 return c;
	 }
	 int Multiplication(){
		 int a,b,c=0;
		 System.out.println("Enter Two Numbers:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 try{
			 c=a*b;
		 }
		 catch(ArithmeticException e){
				System.out.println("Multiplication is not possible by 0");
		 }
		 System.out.println("Multiplication is:"+c);
		 return c;
	 }
	 int Division(){
		 int a,b,c=0;
		 System.out.println("Enter Two Numbers:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 try{
			 c=a/b;
		 }
		 catch(ArithmeticException e){
				System.out.println("Division Not Possible By 0!");
		 }
		
		System.out.println("Division Is :"+c);
		 return c;
	 }
	 int Modulus(){
		 int a,b,c=0;
		 System.out.println("Enter Two Numbers:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 try{
			 c=a%b;
		 }
		 catch(ArithmeticException e){
				System.out.println("Division Not Possible By 0!");
		 }
		
		System.out.println("Division Is :"+c);
		 return c; 
	 }
	 int SquareRoot(){
		 int num;
		 System.out.println("Enter A Number");
		 num=sc.nextInt();
		 if(num>0){
			 num=num*num;
			 System.out.println("Square Root:"+num);
		 }
		 else{
			 System.out.println("Number is 0!");
		 }
		 return num;
	 }
	 int CubeRoot(){
		 int num;
		 System.out.println("Enter A Number");
		 num=sc.nextInt();
		 if(num>0){
			 num=num*num*num;
			 System.out.println("Square Root:"+num);
		 }
		 else{
			 System.out.println("Number is 0!");
		 }
		 return num;
	 }
	 
	 double Percentage() {
		System.out.println("Enter Number Of Subject Marks You want to Enter:");
		int size = sc.nextInt();

		int total = 0;

		System.out.println("Enter Marks for Subjects (Out Of 50):");

		for (int i = 1; i <= size; i++) {
			int marks = sc.nextInt();
			total = total + marks;
		}

		int maxMarks = size * 50;

		double percentage = ((double) total / maxMarks) * 100;

		System.out.println("Maximum Marks: " + maxMarks);
		System.out.println("Percentage: " + percentage + "%");

		return percentage;
	}
	 
	 
 }