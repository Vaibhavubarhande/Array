package com.Arrraysss;

public class AscOrder {

	// Print Array in ascending order

	public static void main(String[] args) {

		int temp;

		int[] x = { 12, 34, 18, 19, 21, 45, 98 };

		for (int i = 0; i < x.length; i++) {
			
			for (int j = i+1; j < x.length; j++) {
				
				if (x[i] > x[j]) {
					
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + ",");

		}
	}

}
