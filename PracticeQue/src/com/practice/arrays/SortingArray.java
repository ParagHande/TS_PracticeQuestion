package com.practice.arrays;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int[] arrayNumber = {3,7,4,9,1,8,-3,2,6,5};
		int maxNum = arrayNumber[0];
		int minNum = arrayNumber[0];
		for (int i : arrayNumber) {
			if(maxNum < i) {
				maxNum = i;
				}
			if(minNum > i) {
				minNum = i;
				}
		}
		System.out.println("Given Array : "+Arrays.toString(arrayNumber));
		System.out.println("Max No. : "+maxNum);
		System.out.println("Min No. : "+minNum);
		//--------------------------------------------------------
		int[] sortedArray = arrayNumber;
		int temp = 0;
		
		for (int i=0; i<sortedArray.length-1;i++) {
				for(int j=i+1; j<sortedArray.length-1;j++) {
					if(sortedArray[i]>sortedArray[j+1]) {
						temp = sortedArray[j+1];
						sortedArray[j+1] = sortedArray[i];
						sortedArray[i] =temp;
					}
				}
		}
		System.out.println("Sorted array in Ascending order  : "+Arrays.toString(sortedArray));
		//--------------------------------------------------------
		int[] reverseArrayNumber = new int [sortedArray.length];
		int index = sortedArray.length;
		for(int i=sortedArray.length-1; i>=0; i--) {
			reverseArrayNumber[sortedArray.length-index] = sortedArray[i];
			index--;
		}
		System.out.println("Sorted array in Descending order : "+Arrays.toString(reverseArrayNumber));
	}
}
