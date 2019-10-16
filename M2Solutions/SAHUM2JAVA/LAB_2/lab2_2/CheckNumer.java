package com.lab2;

public class CheckNumer {
	public static void main(String[] args) {
		String s = args[0];
		int i = Integer.parseInt(s);
		
		if(i > 0){
			System.out.println("Given Number is POSITIVE Number");
		}else{
			System.out.println("Given Number is NEGATIVE Number");
		}
	}
}
