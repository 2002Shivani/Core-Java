/*
 * 3. Write a Java program to print the following grid.

Expected Output :

- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -                                                                                           
- - - - - - - - - -  
 */

package array;

public class PrintGrid {

	public static void main(String[] args) {
		
		String[] array = {"----------"};
		
		for(int i =0 ;i<10;i++) {
			for(int j = 0;j<array.length;j++) {
				System.out.println(array[j]);
			}
		}
		
	}

}
