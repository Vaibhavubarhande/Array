package com.Arrraysss;

import java.util.Scanner;

public class Searchelem {

	// Search an Element in Array

	public static void main(String[] args) {
		int n = 0;
		int count = 0;

		int[] a = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Elements");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter search element");
		n = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Element Found");
		} else
			System.out.println("Element not found");

	}
}
