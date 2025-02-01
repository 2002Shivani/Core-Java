package array;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
	
		char[] array = {'A','B','C','D'};
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Array is:");
		for(int i =0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println("\nEnter Character From array to find an index:");
		
		char ch = in.next().charAt(0);
		for(int i =0;i<array.length;i++) {
			if(array[i]==ch) {
				System.out.println("Index of "+ch+" is "+i);
				break;
			}
		}
	
	}

}
