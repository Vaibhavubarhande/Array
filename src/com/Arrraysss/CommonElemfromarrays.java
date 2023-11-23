package com.Arrraysss;

import java.util.ArrayList;

public class CommonElemfromarrays {

	public static void main(String[] args) {
		
		int[] x = {10,20,30,40,50};
		int[] y = {20,30,40,50,60};
		
		ArrayList alx = new ArrayList<>();
		ArrayList aly = new ArrayList<>();
		
		for(int i=0;i<x.length;i++) {
			alx.add(x[i]);
		}
		
		for(int i=0;i<y.length;i++) {
			aly.add(y[i]);
		}
		
		alx.retainAll(aly);
		
		System.out.println(alx);
	}
}