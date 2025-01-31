package com.controlflow;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		int a = in.nextInt();
		System.out.println("Enter Number 2 :");
		int b = in.nextInt();
		System.out.println("Enter Number 3 :");
		int c = in.nextInt();

		if (a > b && a > c) {
			System.out.println("Number 1 is greater");
		} else if (b > a && b > c) {
			System.out.println("NUmber 2 is greater");
		} else {
			System.out.println("Number 3 is greater");
		}

		in.close();
	}

}
