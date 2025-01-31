package com.basic.operator;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Principal:");
		int p = in.nextInt();
		System.out.println("Enter Rate of Interest:");
		int r = in.nextInt();
		System.out.println("Enter Time:");
		int t = in.nextInt();
		
		int CI = p*(1+(r/100))*t;
		
		System.out.println("Compound Interest is:"+CI);
		
		in.close();

	}

}
