package com.tcs.training;

public class TestLoops {
	public static void main(String[] args) {
		//starting point
		//condition
		//statements
		//direction<>
		//termination
		
		int start=0;
		int stop=100;
		while(start <= stop) {
			System.out.println("Run="+ start);
			start++;
		}
		
		for(start=1 ; start <= stop; start++) {
			System.out.println("run="+start);
		}
		
		
		for(stop=100; stop>=start ; stop--) {
			System.out.println("rev="+stop);
		}
		
		for(start=1; start<=stop/2 ;start++ ) {
			System.out.println("half="+start);	
		}
		for(start=1; start<=stop ;start+=2 ) {
			System.out.println("alt="+start);	
		}
		int sum=0;
		int count = 1;
		for(start=1; start<=stop; start++) {
			
			if(count > 3) {
				System.out.println("sum of 3="+sum);
				count =1;
				sum=0;
				continue;
			}
			sum+=start;
			count++;
			
		}
		
		int i=0;
		for(;i<=20;i++); {
			System.out.println(i);  //i=21
		}
	    
		
	}

}
