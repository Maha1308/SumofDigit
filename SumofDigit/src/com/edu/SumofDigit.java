package com.edu;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		int d;
		int n,s=0,m=1;
	int t=0;
	
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	int temp=n;
	while(n>0)
	{
		d=n%10;
		n=n/10;
		s=s+d;
		m=m+d;
	}
	t=s+m;
	if(temp==t)
	{
		System.out.println("it is special number");
	}
	else
	{
		System.out.println("it is not special number");
	}
	

	}

}
