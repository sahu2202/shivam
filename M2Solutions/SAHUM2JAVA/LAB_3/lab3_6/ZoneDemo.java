package com.lab3_6;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneDemo {
	
	public static void checkZone(String s1){
		ZonedDateTime z1 = ZonedDateTime.now(ZoneId.of(s1));
		System.out.println(z1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Zone ID: ");
		String s1 = sc.nextLine();
		checkZone(s1);
		sc.close();
	}
}
