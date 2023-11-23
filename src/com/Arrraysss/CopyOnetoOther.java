package com.Arrraysss;

public class CopyOnetoOther {

	// Copy one array element into another array

	public static void main(String[] args) {

		int a[] = { 10, 42, 15, 8, 9 };
		int b[] = { 11, 52, 85, 8, 9 };

		for (int i = 0; i < a.length; i++) {

			b[i] = a[i];

			System.out.print(b[i] + " ");
		}

	}
}
