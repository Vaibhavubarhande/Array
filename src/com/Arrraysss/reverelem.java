package com.Arrraysss;

public class reverelem {

	// Print one array elements into another array in reverse order
	
	public static void main(String[] args) {

		int x[] = { 10, 20, 30, 40, 50 };
		int y[] = { 1, 2, 3, 4, 5 };

		for (int i = 4; i >= 0; i--) {

			y[i] = x[i];

			System.out.print(y[i] + ",");

		}

	}
}