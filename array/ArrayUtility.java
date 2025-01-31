package com.array;

import java.util.Scanner;

public class ArrayUtility {

	public static int[] inputArray(int size) {
	Scanner in = new Scanner(System.in);
	int arr[] = new int[size];
	for(int i =0;i<arr.length;i++) {
		arr[i] = in.nextInt();
	}

	return arr;

	}
}
