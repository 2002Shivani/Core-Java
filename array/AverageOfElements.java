/*
 *  Write a Java program to calculate the average value of array elements.
 */

package array;

import java.util.Scanner;

public class AverageOfElements {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int sum = 0;
		int array[] = new int[5];
		System.out.println("Enter 5 numbers");
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("Average of Array Elements:"+(sum/array.length));
	}

}
