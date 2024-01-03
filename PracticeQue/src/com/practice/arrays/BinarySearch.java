package com.practice.arrays;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arrayNumber = {3,7,4,9,1,8,-3,2,6,5};
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
		System.out.println("Sorted Array : "+Arrays.toString(sortedArray));
		//Sorted array : [-3, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		int find = 9;
		int low = 0;
		int high = sortedArray.length-1;
		int mid = (low+high)/2;
		int loop =0;
		while(true) {
			if(find>sortedArray[sortedArray.length-1]) {
				System.out.println("Element Is Not Present in an Array");
				break;
			}else if(find<sortedArray[0]) {
				System.out.println("Element Is Not Present in an Array");
				break;
			}
			else if(find==sortedArray[mid]) {
				 System.out.println("Element Is Present in an Array");
				 System.out.println("No is Equal to Mid");
				break;
			}
			else if(find<sortedArray[mid]) {
				high = mid-1;
				mid = (low+high)/2;
				System.out.println("No is Lower than Mid Array Element");
			}else if(find>sortedArray[mid]) {
				low = mid+1;
				mid = (low+high)/2;
				System.out.println("No is Higher than Mid Array Element");
			}
			loop++;
			System.out.println("Loop count : "+loop+"\n");
		}
		
	}
}



