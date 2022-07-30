package com.learning.review;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		
		
		int n=5,count=0;
		
		
		for(int i=1;i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("it's a prime number");
		}else {
			System.out.println("not a prime number");
		}
		
	}

}
