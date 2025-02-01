package array;

import java.util.Scanner;

public class AltrenativeNoAddition {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int addition=0;
		System.out.println("Enter 10 numbers");
		
		int number[] = new int[10];
		
		for(int i =0;i<number.length;i++) {
			number[i] = in.nextInt();
		}
		
		for(int i =0;i<number.length;i+=2) {
			addition = number[i]+addition;
		}
		
		System.out.println("Addition: "+addition);
	}

}
