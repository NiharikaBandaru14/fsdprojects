package com.tcs.training;

public class TestArrays {
	public static void main(String[] args) {
		int data[]= {25,24,85,74,65,15};
		//o to length-1
		//index cannot be -ve
		//homogeneous elements
		
		for(int i:data) {
			System.out.println(i);
		}
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
				
	}

}
