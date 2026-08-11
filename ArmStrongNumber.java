import java.io.*;
import java.util.*;
import java.lang.*;
 class ArmStrongNumber{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	int num=sc.nextInt();
	int sum=0;
	int original=num;
	
	while(num>0){
		int rem=num%10;
		sum=sum+rem*rem*rem;
		num=num/10;
     }

	if(original==sum){
		System.out.println("Number is A ArmStrong NUmber!");
	}
	else{
		System.out.println("Number Is not A ArmStrong Number");
	}
    }	
}
