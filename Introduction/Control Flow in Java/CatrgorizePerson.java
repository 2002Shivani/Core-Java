package com.controlflow;

import java.util.Scanner;

public class CatrgorizePerson {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number Categorize:");
		int age = in.nextInt();
		if(age<=13) {
			System.out.println("Child");
		}
		else if(age<=20) {
			System.out.println("Teen");
		}
		else if(age<=60) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
		
		in.close();

	}

}
