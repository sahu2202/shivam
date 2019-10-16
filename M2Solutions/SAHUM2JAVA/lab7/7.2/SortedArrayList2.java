package com.cg.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortedArrayList2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0, j = 0;
		System.out.println("Enter number of products to add (max 10):");
		j = sc.nextInt();
		List<String> strlist = new ArrayList<String>();
		for (i = 0; i < j; i++) {
			strlist.add(sc.next());
		}
		System.out.println(strlist);
		Collections.sort(strlist);
		System.out.println();
		System.out.println("Sorted String array is :->");
		for (String s : strlist) {
			System.out.println(s);
		}

		sc.close();
	}

}
