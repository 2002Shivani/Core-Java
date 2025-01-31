package com.basic.operator;
import java.util.Scanner;
public class ProductOfFloatingPoint {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter Float Number-1:");
	 float a = in.nextFloat();
	 System.out.println("Enter Float Number-2");
	 float b = in.nextFloat();
	 
	 float product = a*b;
	 System.out.println(product);
	 in.close();
	}

}
