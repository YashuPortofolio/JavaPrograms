package com.StringKodNest;

public class CountOfCases {
	void countCases(String str) {
		int upperCount=0;
		int lowerCount=0;
		for(int i=0;i<str.length();i++) 
		{
			if((int)str.charAt(i)>=97) {
				lowerCount++;	
			}
			else {
				upperCount++;
			}
		}
		System.out.println("Upper case Count"+upperCount);
		System.out.println("Lower case Count"+lowerCount);
		//return null;
	}
}
