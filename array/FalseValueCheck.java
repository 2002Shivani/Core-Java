package array;

import java.util.Scanner;

public class FalseValueCheck {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean array[] = new boolean[5];

		System.out.println("Enter 5 boolean values");
		for (int i = 0; i < array.length; i++) {
			array[i] = in.nextBoolean();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] == false) {
				System.out.println("array[" + i + "]=" + array[i]);
			}
		}
	}

}
