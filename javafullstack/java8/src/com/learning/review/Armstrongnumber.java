package com.learning.review;

public class Armstrongnumber {

	public static void main(String[] args) {
		int n=153,arm=0,rem,c;
		c=n;
		while(n>0)
		{
			rem=n%10;
			arm=(arm*arm*arm)+arm;
			n=n/10;
			
		}if(c==arm)
			System.out.println("it a armstrong number");

		else {
			System.out.println("not a armstrong number");
		}
	
	}
}
