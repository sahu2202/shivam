package com.lab3_3;

import java.time.LocalDate;
import java.time.Period;

public class DateDemo {

	public static void printDate(LocalDate d) {
		LocalDate d1 = LocalDate.now();
		Period p1 = d1.until(d);

		System.out.println("Duration in Days: " + Math.abs(p1.getDays()));
		System.out.println("Duration in Months: " + Math.abs((p1.getYears() * 12) + p1.getMonths()));
		System.out.println("Duration in Years: " + Math.abs(p1.getYears()));
	}
	
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2018, 05, 15);
		printDate(d1);
	}
}
