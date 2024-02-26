package com.tcs.oops.testaccess;
import com.tcs.oops.access.A;

public class B {
	
	void method() {
		
		A obj = new A();
		//obj.d; //only d is visible bcoz it is public i- non subclass in other package
	}

}
