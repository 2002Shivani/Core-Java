package com.basic.input;
import java.util.Scanner;

public class InputName {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Your Good Name:");
		String inputName = in.nextLine();
		
		System.out.println("Welcome "+inputName+" to Coding");
		in.close();

	}

}
