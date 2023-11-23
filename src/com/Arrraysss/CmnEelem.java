package com.Arrraysss;

import java.util.Scanner;

public class CmnEelem {

	public static void main(String[] args) {

		int[] x = { 1, 6, 3, 4, 5 };
		int[] y = { 1, 2, 3, 5, 6 };

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {

				if (x[i] == y[j]) {
					System.out.print(x[i] + ",");
				}
			}
		}
	}
}
