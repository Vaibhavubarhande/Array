package com.Arrraysss;

public class Swap {

	public static void main(String[] args) {

		// Swapping without temp

		int a = 5;
		int b = 6;

		System.out.println("Value of a is : " + a + "  Value of b is : " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a is : " + a + "  Value of b is : " + b);

	}

}
