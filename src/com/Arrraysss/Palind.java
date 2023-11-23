package com.Arrraysss;

//Find and print pal... numbers from array

public class Palind {

	public static void main(String[] args) {

		int[] x = { 101, 202, 303, 54, 689, 974, 111 };

		for (int i = 0; i < x.length; i++) {

			int temp = x[i];
			int rem = 0;
			int rev = 0;

			while (temp > 0) {
				rem = temp % 10;
				rev = rev * 10 + rem;
				temp = temp / 10;
			}
			if (rev == x[i]) {
				System.out.print(x[i] + " ");
			}
		}
	}
}
