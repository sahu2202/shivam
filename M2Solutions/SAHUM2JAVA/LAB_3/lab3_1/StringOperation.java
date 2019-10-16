package com.lab3_1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringOperation {

	public static String addString(String myString) {
		return myString + " " + myString;
	}

	public static String replaceString(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 !=0 ) {
				str = str.substring(0, i - 1) + "#" + str.substring(i, str.length());
			}
		}
		return str;
	}

	public static String removeDuplicates(String str) {
		String s1 = "";
		Set<Character> s2 = new LinkedHashSet<>();
		char ch[] = str.toCharArray();
		for (Character c : ch) {
			s2.add(c);
		}

		for (Character c1 : s2) {
			s1 += c1;
		}
		return s1;
	}

	public static String changeCharacters(String str) {
		String s1 = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				s1 += Character.toUpperCase(ch[i]);
			} else {
				s1 += ch[i];
			}
		}
		return s1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("----Choose the Options below------");
			System.out.println("1. Add String to itself");
			System.out.println("2. Replace Odd Position whith #");
			System.out.println("3. Remove Duplicates Characters in the String");
			System.out.println("4. Change Odd characters to Upper Case");
			System.out.println("5. EXIT");

			System.out.println("Enter Your Choice: ");
			int choiceVal = sc.nextInt();
			sc.nextLine();
			switch (choiceVal) {

			case 1:
				System.out.println("Enter string: ");
				String s1 = sc.next();
				System.out.println(addString(s1));
				break;

			case 2:
				System.out.println("Enter String:  ");
				String s2 = sc.nextLine();
				System.out.println(replaceString(s2));
				break;

			case 3:
				System.out.println("Enter String: ");
				String s3 = sc.nextLine();
				System.out.println(removeDuplicates(s3));
				break;

			case 4:
				System.out.println("Enter String: ");
				String s4 = sc.nextLine();
				System.out.println(changeCharacters(s4));
				break;

			case 5:
				return;

			default:
				System.out.println("Wrong Choice!!");
			}
		}
	}
}
