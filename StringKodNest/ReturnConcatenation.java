package com.StringKodNest;

import java.util.Scanner;

public class ReturnConcatenation {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first String:");
		String str1=scan.nextLine();
		System.out.println("Enter another  String:");
		String str2=scan.nextLine();
		String res=concate(str1, str2);
		System.out.println(res);
	}
	public static String concate(String s1,String s2) {
		if(s1.equals(s2)) {
		return s1+" "+s2;
		}
		else {
		return "Strings not equal";
		}
	}

}
