package com.practice.arrays;

public class AverageOfEvenNumber {

	public static void main(String[] args) {
		int[] arrayNumber = {1,2,3,4,5,6,7,8,9};
		int dividend = 0;
		int divisor = 0;
		for(int i=0;i<arrayNumber.length;i++) {
			if(arrayNumber[i]%2==0){  
				System.out.print(arrayNumber[i]+",");  
				dividend = dividend+arrayNumber[i];
				divisor++;
				}  
		}
		System.out.println("\nAddition of even Number	     : "+ dividend);
		System.out.println("Total Number of Even Number  : "+divisor);
		System.out.println("Average of Even No. in Arary : "+dividend/divisor);
	}

}
