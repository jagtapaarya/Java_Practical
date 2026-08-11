import java.io.*;
import java.util.*;

class ArrayList1{
	public static void main(String args[]){
		ArrayList a1=new ArrayList();
		a1.add(91);
		a1.add('Y');
		a1.add("Aarya");
		a1.add(35.66);
		System.out.println(a1);
		System.out.println("Size:"+a1.size());
		System.out.println("Removing:"+a1.remove(2));
		System.out.println("Get:"+a1.get(2));
		System.out.println(a1);
		
	}
}