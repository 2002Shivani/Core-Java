package com.basic.operator;
import java.util.Scanner;
public class PerimeterOfRectangle {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Sides A ,B, C and D");
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		int ABCD = A+B+C+D;
		
		System.out.println("Perimeter of Rectangle is:"+ABCD);
				
				
				
		in.close();
				
				
				

	}

}
