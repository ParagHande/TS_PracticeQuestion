package com.practice.arrays;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		int[] arrayNumber = {1,2,3,4,5,6,7,8,9};
		int[] reverseArrayNumber = new int [arrayNumber.length];
		int index = arrayNumber.length;
		
		System.out.println("Given Array  : "+Arrays.toString(arrayNumber));
		System.out.println("Array length : "+arrayNumber.length);
		for(int i=arrayNumber.length-1; i>=0; i--) {
			reverseArrayNumber[arrayNumber.length-index] = arrayNumber[i];
			index--;
		}
		System.out.println("\nReverse Array        : "+Arrays.toString(reverseArrayNumber));
		System.out.println("reverse Array length : "+reverseArrayNumber.length);
		
		
	}

}
