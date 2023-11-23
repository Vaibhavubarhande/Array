package com.Arrraysss;

public class AddofeachElem {

	// print addition of each digit from the given string

	public static void main(String[] args) {

		int[] x = { 12, 13, 36, 54, 25 };

		int rem = 0;

		for (int i = 0; i < x.length; i++) {

			int sum = 0;
			int num = x[i];

			while (num > 0) {

				rem = num % 10;
				sum = sum + rem;
				num = num / 10;
			}
			System.out.print(sum + " ");
		}
	}
}
