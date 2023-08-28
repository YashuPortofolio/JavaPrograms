package com.StringKodNest;
import java.util.Scanner;

public class SwappingCases {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String:");
		String str1=scan.nextLine();
		char[] arr=str1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if((int)arr[i]>=65 && (int)arr[i]<=90) {
				arr[i]=(char) (arr[i]+32);
			}
			else {
				arr[i]=(char) (arr[i]-32);
			}
		}
		for (char c : arr) {
			System.out.print(c);
		}
	}

}
