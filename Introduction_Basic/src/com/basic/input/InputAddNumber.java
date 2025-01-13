package com.basic.input;
import java.util.Scanner;

public class InputAddNumber {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number-1:");
		int a = in.nextInt();
		System.out.println("Enter Number-2:");
		int b = in.nextInt();
		
		int sum = a+b;
		
		System.out.println("Addition is:"+sum);
		
	}

}
