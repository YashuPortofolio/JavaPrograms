package com.StringKodNest;

import java.util.Scanner;

public class UnicodePrinter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first String:");
		String str1=scan.nextLine();
		char []arr=str1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			System.out.println(arr[i]+":"+num);
		}
		
	}

}
