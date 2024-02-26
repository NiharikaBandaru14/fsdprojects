package com.tcs.training;

public class CompInt {
	public static void main(String[] args) {
		int n=100000;
		int t=25;
		int r=13;
	
		r=(1+r/n);
		for(int i=1;i<=n;i++) {
			t+=t*r;;
		}
		
	}

}
