package array;

import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter 10 numbers");
		
		int number[] = new int[10];
		
		for(int i =0;i<number.length;i++) {
			number[i] = in.nextInt();
		}
		
		for(int i =0;i<number.length;i++) {
			if(number[i]==25) {
				System.out.println("Valid Array");
				break;
			}	
			
		}
		
		
		

	}

}
