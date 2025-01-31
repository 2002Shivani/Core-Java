package com.basic.operator;
import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number-1:");
		int num1 = in.nextInt();
		System.out.println("Enter Number-2");
		int num2 = in.nextInt();
		
		System.out.println("Addition:-"+(num1+num2));
		System.out.println("Subtration:-"+(num1-num2));
		System.out.println("Multiplication:-"+(num1*num2));
		System.out.println("Division:-"+(num1/num2));
		System.out.println("Modulus:-"+(num1%num2));
		
		in.close();

	}

}
