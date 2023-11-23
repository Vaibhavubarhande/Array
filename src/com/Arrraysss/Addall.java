package com.Arrraysss;

public class Addall {

	// Addition of all Array Elements

	public static void main(String[] args) {

		int sum = 0;

		int a[] = { 10, 5, 4, 8, 9 };

		for (int i = 0; i < a.length; i++) {

			sum = a[i] + sum;

		}
		System.out.print("Sum of all Array elements is : " + sum);
	}

}
