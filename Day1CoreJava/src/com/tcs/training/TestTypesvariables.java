package com.tcs.training;

public class TestTypesvariables {
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=0;
		if(a<10) {
			c=a+b;
		}
		if(a>=10) {
			c=a-b;
		}
		System.out.println(c);
		boolean res= a>b && a>c;
		System.out.println(res);
		
		res = false==false;
		res = false==res;
		res=!true;
		boolean flag=true;
		if(flag=true)
			System.out.println(flag);
		else
			System.out.println(flag);
		
		a=-20;
		if(a!=0) {
		if(a<0)
			System.out.println("Negative");
		else
			System.out.println("Positive");
		}
		else
			System.out.println("zero");
	
	
	int tot=1100;
	int sub=6;
	int avg=tot/sub;
	
	if(avg>90) 
		System.out.println("A+");
	else if (avg >= 80 && avg <90)
		System.out.println("A");
	else if (avg >= 70 && avg <80)
		System.out.println("B");
	else if (avg >= 60 && avg <70)
		System.out.println("C");
	else
		System.out.println("D-FAIL");
	}
}
