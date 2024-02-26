package com.tcs.oops;

public class TestPrimitives {
	
	static void validate(byte b, short s) {
		b--;
	}
	static void validate(int b,int s) {
		b++;
	}
	
	static void validate(byte b) {
		b++;
	}
	static void other(int i) {
		i++;
	}
	
	public static void main(String[] args) {
		
		byte b=10; //1
		final int i=10; //4bytes
		b=i;
		
		validate(b);
		other(b);//conversion context-implicit widening takes place
		
		short s=10;
		//whenever java performs operations, it min perform on int 
		//short sum=s+s; //byte,short converted to int, resulting int
						//int,int -> result int
						//int, long -> result long(bcoz of long is wide)
						//long,long -> res long
						//long,float -> res float
						//float,double -> res double
		
		long lg=234l;
		float f=34.33f;
		f=f+lg; //happen bcoz of float is wide
		//lg=f+lg;  //error
		
		b=10;
		s=10;
		validate(10,10); //widening
		
		
		
	}
	
}
