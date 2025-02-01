//. Write a Java program to remove a specific element from an array.

package array;

import java.util.Scanner;

public class RemoveArrayElement {

	public static void main(String[] args) {
	
		int array[] = {1,2,3,4,5};
	
		
		Scanner in = new Scanner(System.in);
		
		int value = in.nextInt();
		
		for(int i =0;i<array.length;i++) {
			if(value!=array[i]) {
				for(int j=0;j<array.length-1;j++) {	
					array[j] = array[i++];
				}
			}
		}
		
		for(int i =0 ;i<array.length-1;i++) {
			System.out.println(array[i]);
		}
		
	}

}
