package com.practice.algorithm;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		int num = 515;
		int originalNum = num;
		int reverseNum = 0;
		
		while (num != 0) {
			int remainder  = num % 10;          // reminder = 512 % 10 = 2
			reverseNum = reverseNum * 10 + remainder; // reverse  = 0 * 10 + reminder = 0*10+2 = 2
			num = num/10;						// num      = 512/10 = 51.2 // next num value is = 52
		}
		System.out.println("Original Number = "+originalNum);
		System.out.println("Reverse Number = "+reverseNum);
		if(originalNum == reverseNum) {
				System.out.println("The Given Number Is Palindrome");
		}else System.out.println("The Given Number Is Not a Palindrome");
	}
}