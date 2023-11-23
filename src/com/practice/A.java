package com.practice;

public class A {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;

		System.out.println("The value of a is " + a + " " + "b is " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("The value of a is " + a + " " + "b is " + b);
	}
}