//import java.io.*;
//import java.util.*;
//import java.lang.*;
 //class PerfectNumber{
//	public static void main(String args[]){

//	int num=6;
//	int sum=0;
//	int i;
//	for(i=1;i<6;i++){
//	if(num%i==0) {
//		sum=sum+i;
//	}
//     }

//	if(num==sum){
//		System.out.println("Number is A Perfect NUmber!");
//	}
//	else{
//		System.out.println("Number Is not A Perfect Number");
//	}
 //   }	
//}



//User Input



import java.io.*;
import java.util.*;
import java.lang.*;
 class PerfectNumber{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int num;
	int sum=0;
	int i;
	System.out.println("Enter A number:!");
	num=sc.nextInt();
 
	for(i=1;i<6;i++){
	if(num%i==0) {
		sum=sum+i;
	}
      }

	if(num==sum){
		System.out.println("Number is A Perfect NUmber!");
	}
	else{
		System.out.println("Number Is not A Perfect Number");
	}
    }	
}
