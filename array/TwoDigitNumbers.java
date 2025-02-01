package array;

import java.util.Scanner;

public class TwoDigitNumbers {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter 5 numbers");
	
	int num[] = new int[5];
	for(int i=0;i<num.length;i++) {
		num[i] = in.nextInt();
	}
	
	System.out.println("Two digit numbers are:");
	for(int i= 0 ;i<num.length;i++) {
		if(num[i]>9 && num[i]<100) {
			System.out.print(num[i]+" ");
		}
	}
	}

}

