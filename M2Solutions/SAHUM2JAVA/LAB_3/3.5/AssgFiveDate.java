package com.cg.lab3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AssgFiveDate {

	public static String warPeriod(String date,String month,String year)
	{
		DateTimeFormatter fr = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dl = LocalDate.parse(date,fr);
		String s1 = dl.plusYears(Integer.parseInt(year)).toString();
		DateTimeFormatter fr1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dl1 = LocalDate.parse(s1,fr1);
		String s2 = dl1.plusMonths(Integer.parseInt(month)).toString();
		//String out = dl.toString();
		return s2;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter date of perchase -> [dd-MM-yyyy]");
		String date = sc.next();
		System.out.println("Enter period of warrantee -> [months and  years]");
		String months = sc.next();
		String years = sc.next();
		String out = warPeriod(date,months,years);
		System.out.println("Date of warrantee expire is -> "+ out);
		sc.close();

	}

}
