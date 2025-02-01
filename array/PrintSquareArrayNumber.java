package array;

import java.util.Scanner;

public class PrintSquareArrayNumber {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 10 array elements");
		
		int array[] = new int[10];
		
		for(int i =0;i<array.length;i++) {
			array[i] = in.nextInt();
		}
		
		System.out.println("Numbers whose square present in an array as follow:");
		for(int i =0;i<array.length;i++) {
			for(int j =0;j<array.length;j++) {
				if(array[j]==(array[i]*array[i])) {
					System.out.print(array[i]+" ");
				}
			}
		}
	}

}
