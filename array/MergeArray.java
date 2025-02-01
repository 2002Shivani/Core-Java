package array;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	int array1[] = new int[3];
	int array2[] = new int[3];
	int array3[] = new int[array1.length+array2.length];
	
	System.out.println("Enter Array 1 :");
	for(int i =0 ;i<array1.length;i++) {
		array1[i] = in.nextInt();
	}
	System.out.println("Enter Array 2 :");
	for(int i =0 ;i<array2.length;i++) {
		array2[i] = in.nextInt();
	}
	
	for(int i =0 ;i<array1.length;i++) {
			array3[i] = array1[i];
	}
	for(int i =0 ;i<array2.length;i++) {
		array3[i+3] = array2[i];
}
	
	for(int i =0 ;i<array3.length;i++) {
		System.out.println(array3[i]);
	}

	}

}
