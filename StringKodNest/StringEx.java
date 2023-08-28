package com.StringKodNest;

public class StringEx {
	public static void main(String[] args) {
		String str="KodNEst Technologies pvt Ltd.";
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf('v'));
		String str1=" Prahllad Omkar Bharadwaj ";
		System.out.println(str1);
		//leading space and trailing space
		String str2=str1.trim();
		System.out.println(str2);
		String arr[]=str2.split(" ");
		for (String s : arr) {
			System.out.println(s);
			
		}
		String str3="Raja Ram Mohan Roy";
		char arr1[]=str3.toCharArray();
		for (char c : arr1) {
			System.out.print(c+" ");
			
		}
		String str4="YASWANTHI";
		char c[]=str4.toCharArray();
		int len=str4.length();
		for(int i=len-1;i<=0;i++) {
			System.out.print(c.length+" ");
		}
		
	}

}
