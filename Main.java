//Array Logic!
	//Print Array
	//Reverse Array
	//find largest in array
	//find smallest in array
	import java.io.*;
	import java.util.*;
class Main{
	public static void main(String args[]){
	System.out.println("Array Programs");
	Main ob=new Main();
	ob.task1();
	ob.task2();
	ob.task3();
	ob.task4();
	
	}
	void task1(){
	System.out.println("-----------------------------");
	
	char [] ch={'a','a','r','y','a'};
	for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		System.out.println("-----------------------------");
	}
	void task2(){
		int i;
		int size;
		System.out.println("--------------Task 2---------------");
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter The Size Of array");
		 size=Sc.nextInt();
		System.out.println("Enter The Number:");
		int ar[] = new int[size];
		for(i=0;i<size-1;i++){
		 ar[i]=Sc.nextInt();
		}
		System.out.println("Array Reverse");
		for(i = size - 1; i >= 0; i--){
			
			System.out.println(ar[i]);
		}
		System.out.println("-----------------------------");
	
	}
		void task3(){
			System.out.println("--------------Task 3---------------");
			int a[]={99,11,66,110,1,4};
			int max=0;
			for(int i=0;i<a.length;i++){
				if(a[i]>max){
					max=a[i];
				}
				
			}
			System.out.println("Maximum :"+max);
		
		}
		void task4(){
			System.out.println("--------------Task 3---------------");
			int a[]={99,11,66,110,1,4};
			int min;
			for(int i=0;i<a.length;i++){
				if(a[i]<min){
					min=a[i];
				}
			}
			System.out.println("MiniMum :"+min);
		
		}
}