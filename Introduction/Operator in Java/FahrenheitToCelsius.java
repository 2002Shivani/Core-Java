package com.basic.operator;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Fahrenheit:");
		int f = in.nextInt();
		float C = (f-32)*(5/9);
		 
		 System.out.println("Celsius:"+ C);
		 in.close();
	}

}
