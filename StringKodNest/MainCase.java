package com.StringKodNest;

import java.util.Scanner;

public class MainCase {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first String:");
		String str1=scan.nextLine();
		CountOfCases cases=new CountOfCases();
		cases.countCases(str1);
		
	}

}
