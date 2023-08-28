package com.StringKodNest;

import java.util.Scanner;

public class UpperMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first String:");
		String str1=scan.nextLine();
		UpperToLower lower=new UpperToLower();
		String res=lower.upperToLower(str1);
		System.out.println(res);
	}

}
