package com.controlflow;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number:");
		int no = in.nextInt();

		if (no < 0) {
			System.out.println("Number is Negative ");
		} else if (no > 0) {
			System.out.println("Number is Positive");
		} else {
			System.out.println("Number is Zero");
		}

		in.close();
	}

}
