package com.practice.arrays;

public class SearchingElement {
	
	public static void main(String[] args) {
		int[] arrayNumber = {3,7,4,9,1,8,-3,2,6,5};
		int find = 55;
		for (int i : arrayNumber) {
			if (i == find) {
				System.out.println("We found an element in aarray : "+i);
				System.exit(0);
			}
		}System.out.println(find + " : is not availabe in array");
	}
}
