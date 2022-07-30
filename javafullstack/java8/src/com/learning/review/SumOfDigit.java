package com.learning.review;

public class SumOfDigit {
	
	public static void main(String[] args) {
		
		int n=134,r,sum=0;
		
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
			
			
		}
		System.out.println("sum of digit "+sum);
		
	}

}
