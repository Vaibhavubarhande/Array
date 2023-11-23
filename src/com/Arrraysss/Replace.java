package com.Arrraysss;

public class Replace {

	public static void main(String[] args) {

		int [] a = {21,23,22,24,54,66,32,43};
		int [] b = {12,21,23,33,45,65,67};

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {

					a[i] = 0;

					System.out.print(a[i]+ " ");
				}
			}
			if (a[i] != 0) {
				System.out.print(a[i]+ " ");
			}
		}
	}
}
