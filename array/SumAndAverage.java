package com.array;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int[] array = new int[5];
	
		int sum =0;
		System.out.println("Enter 5 elements in array:");
		for(int i=0;i<array.length;i++) {
			array[i] = in.nextInt();
			sum = sum+array[i];
		}
		
		int avg = sum/array.length;
		
		System.out.println("Sum is:"+sum);
		System.out.println("Average is:"+avg);
		in.close();
		

	}

}
