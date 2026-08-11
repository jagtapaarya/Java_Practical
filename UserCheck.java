//Check Whether the user is register succesfull enters a username and password from user (Username:Admin pAss: Admin123)


import java.io.*;
import java.util.*;

	class UserCheck{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);


			String register;
			String username,password;
			System.out.println("Are You Registered!?(Yes/No)");
			register=sc.next();
			if(register.equals("Yes")){
				System.out.println("Great!Now Enter Your username and PAssword");
				System.out.println("Enter Your USername:");
				username=sc.next();
				System.out.println("Enter Your Password:");
				password=sc.next();

				if((username.equals("admin"))&&(password.equals("admin123"))){
					System.out.println("Registration Successfull!!");
			}
			else{
					System.out.println("Not Registered");
			}
		

			}
			else{
				System.out.println("CReate your Account first");	
			}

				
				


	}

}