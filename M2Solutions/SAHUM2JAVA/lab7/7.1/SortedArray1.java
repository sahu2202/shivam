package com.cg.lab7;

import java.util.*;

public class SortedArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0, j = 0;
		System.out.println("Enter number of products to add (max 10):");
		j = sc.nextInt();
		String[] str = new String[j];
		for(i=0;i<j;i++)
		{
			str[i] = sc.next();
		}
		for(i=0;i<str.length;i++)
		{
			System.out.print(str[i] + "\t");
		}
		
		System.out.println();
		Set<String> strset = new TreeSet<String>();
		for(i=0;i<str.length;i++)
		{
			strset.add(str[i]);
		}
		System.out.println("Sorted String array is :->");
		System.out.println(strset);
		sc.close();
	}

}
