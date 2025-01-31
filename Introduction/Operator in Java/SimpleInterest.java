package com.basic.operator;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Principal:");
		int p = in.nextInt();
		System.out.println("Enter Time:");
		int t = in.nextInt();
		System.out.println("Enter Rate of Interest:");
		int r = in.nextInt();
		
		int SI = (p*t*r)/100;
		
		System.out.println("Simple Interest is:"+SI);
		in.close();
	}

}
