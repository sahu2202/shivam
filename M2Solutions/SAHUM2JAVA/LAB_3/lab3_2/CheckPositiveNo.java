package com.lab3_2;

import java.util.Scanner;

public class CheckPositiveNo {
	
	public static boolean isPositive(String s1){
		int strLength = s1.length();
		
		for(int i = 1; i<strLength; i++){
			if(s1.charAt(i) < s1.charAt(i-1)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check is (positive) or not: ");
		String str1 = sc.next();
		
		if(isPositive(str1)){
			System.out.println("Yes! Entered String is POSITIVE");
		}else{
			System.out.println("No! Entered String is NOT POSITIVE");
		}
	}
}
