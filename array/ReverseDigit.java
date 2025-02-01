package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int[] array = new int[10];
		int rev=0;
		System.out.println("Enter 10 numbers");
		for(int i =0;i<array.length;i++) {
			array[i] = in.nextInt();
		}
		
		for(int i =0;i<array.length;i++) {
			rev=0;
			while(array[i]!=0) {
				int reminder = array[i]%10;
				 rev = rev*10+reminder;
				 array[i] = array[i]/10;
			}
			
			array[i] = rev;
	
		}
		
		System.out.println("Reverse array:");
		
	for(int i =0;i<array.length;i++) {
		System.out.print(array[i]+" ");
		
	}
	}

}
