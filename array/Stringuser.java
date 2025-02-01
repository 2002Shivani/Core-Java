package array;

import java.util.Scanner;

public class Stringuser {
	
  public static void main(String args[]) {
	  
	  String user[] = new String[5];
	  String copy[] = new String[5];
	  
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter 5 user names");
	  for(int i =0;i<user.length;i++) {
		  user[i] = in.nextLine();
	  }
	  
	  for(int i =0;i<user.length;i++) {
		  copy[i] = user[i];
	  }
	  
	  
	  System.out.println("Original data : ");
	  for(int i =0;i<user.length;i++) {
		 System.out.println(user[i]+" ");
	  }
	  
	  System.out.println("Copy data : ");
	  for(int i =0;i<copy.length;i++) {
		 System.out.println(copy[i]+" ");
	  }
	  
  }

}
