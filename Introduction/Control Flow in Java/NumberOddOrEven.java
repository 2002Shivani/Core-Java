package com.controlflow;

import java.util.Scanner;

public class NumberOddOrEven {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = in.nextInt();

		if (n % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}

		in.close();
	}

}
