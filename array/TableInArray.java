package array;

import java.util.Scanner;

public class TableInArray {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int n = in.nextInt();
		
		int table[] = new int[10];
		
		System.out.println("TABLE OF "+n);
		for(int i =0;i<table.length;i++) {
			table[i] = n*(i+1);
			System.out.print(table[i]+" ");
		}
		
	}

}
