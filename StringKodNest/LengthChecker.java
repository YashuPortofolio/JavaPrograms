package com.StringKodNest;

import java.util.Scanner;

public class LengthChecker {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first String:");
		String str1=scan.nextLine();
		System.out.println("Enter another  String:");
		String str2=scan.nextLine();
		if(str1.length()==str2.length()) {
			System.out.println("Both strings are of same length");
		}
		else {

			System.out.println("Both strings are not of same length");
		}
		
	}

}
