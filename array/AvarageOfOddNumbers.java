package array;

import java.util.Scanner;

public class AvarageOfOddNumbers {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers:");
		int num[] = new int[10];
		int c=0;
		for(int i=0;i<num.length;i++) {
			num[i] = in.nextInt();
		}
		
		int sum =0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
					sum+=num[i];
					c++;
			}
			
		}

		System.out.println("Average of odd number: "+(sum/c));
	

	}

}
