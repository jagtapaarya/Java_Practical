//	  * * * * *
//   * * * * *
//  * * * * *
// * * * * *
//* * * * * 

class SolidRhomus{
	public static void main(String args[]){
		 System.out.println("....Solid Rhombus....");
		for(int i=1;i<=5;i++){
			for(int s=1;s<=5-i;s++){
				System.out.print(" ");
			}
		for(int j=1;j<=5;j++){
			System.out.print("* ");
		  }
		  System.out.println();
	    }
		 System.out.println("=======================================");
		 System.out.println("....Hallow Square....");
		 //* * * * *
		 //*       *
		 //*       *
		 //*       *
		 //* * * * *
		 
		 for(int r=1;r<=5;r++){
			 for(int c=1;c<=5;c++){
				 if(r==1||r==5||c==1||c==5){
					 System.out.print("* ");
				 }
				 else{
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }
		 
		 System.out.println("=======================================");
		 System.out.println("....Hallow Right Triangle....");
		/* *
		   * *
		   *   *
		   *     *
		   * * * * * */
		   
		   for(int r=1;r<=5;r++){
			   for(int c=1;c<=r;c++){
				   if(c==1||c==r||r==5){
					   System.out.print("* ");
				   }
				   else{
					  System.out.print(" "); 
				   }
			   }
			   System.out.println();
			   
		   }
	}
}