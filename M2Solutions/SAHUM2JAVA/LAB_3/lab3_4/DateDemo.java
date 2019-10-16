package com.lab3_4;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo {
	
	public static void printDate(LocalDate d1, LocalDate d2){
//		Period p1 = d1.until(d2);
		Period p1 = Period.between(d1, d2);
		System.out.println("Duration in Months: "+Math.abs((p1.getYears() * 12)+p1.getMonths()));
		System.out.println("Duration in Days: "+Math.abs(p1.getDays()));
		System.out.println("Duration in Years: "+Math.abs(p1.getYears()));
	}
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(2015, 05, 15);
		LocalDate d2 = LocalDate.of(2018, 10, 16);
		
		printDate(d1,d2);
	}
}
