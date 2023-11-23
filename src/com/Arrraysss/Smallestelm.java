package com.Arrraysss;

public class Smallestelm {

	// Smallest element of an array

	public static void main(String[] args) {
		int min;

		int[] x = { 10, 20, 30, 60, 45, 2, 2, 3 };
		
		min = x[0];

		for (int i = 1; i < x.length; i++) {

			if (x[i] < min) {

				min = x[i];
			}
		}
		System.out.println(min);
	}

}
