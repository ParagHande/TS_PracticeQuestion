package com.practice.algorithm;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int num = 153;
		int originalNum = num;
		int cube = 0;
		
		while (num != 0) {
			int remainder  = num % 10;   
			cube = cube + (remainder*remainder*remainder);
			num = num/10;						
		}
		if(originalNum == cube) {
			System.out.println(originalNum + " is an Armstrong Number");
		}else System.out.println(originalNum + " is Not an Armstrong Number");
	}
}
