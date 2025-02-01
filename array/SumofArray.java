//Write a Java program to sum values of an array.
package array;

import java.util.Scanner;

public class SumofArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		int sum =0 ;
		int array[] = new int[5];
		System.out.println("Enter 5 numbers");
		for(int i =0;i<array.length;i++) {
			array[i] = in.nextInt();
		}
		
		for(int i : array) {
			sum+=i;
		}
		
		System.out.println("Sum of Array Element is:"+sum);
	}

}
