package com.learning.review;



public class PalindromNumber {
	
	public static void main(String[] args) {
		
		
		int n=121,s=0,c,r;
		
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			
		}if(c==s)
		{
			System.out.println("palindrom number");
		}else {
			System.out.println("not a palindrom number");
		}
		
		
	}
}
