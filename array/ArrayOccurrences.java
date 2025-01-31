package com.array;

import java.util.Scanner;

public class ArrayOccurrences {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 5 array element:");
		int array[] =ArrayUtility.inputArray(5);
		System.out.println("Enter Number to check occurrence:");
		int num = in.nextInt();
		int ocr = numberOfOccurrance(array,num);
		if(ocr>0) {
			System.out.println("Number  is occurred "+ocr+" times.");
		}else {
			System.out.println("No Occurrence.");
		}
		
	}
	
	public static int numberOfOccurrance(int[] array , int num) {
		int occr =0;
		int i =0;
		while(i<array.length) {
			if(array[i]==num) {
				occr++;
			}
			i++;
		}
		return occr;
	}

}
