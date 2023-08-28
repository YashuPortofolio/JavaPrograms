package com.StringKodNest;

import java.util.Scanner;

public class LowerMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first String:");
		String str1=scan.nextLine();
		LowerCase low=new LowerCase();
		String res=low.lowerToUpper(str1);
		System.out.println(res);
	}

}
