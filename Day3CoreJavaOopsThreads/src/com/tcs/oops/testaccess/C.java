package com.tcs.oops.testaccess;

import com.tcs.oops.access.A;

public class C extends A {
	
	public C() {
		//proctected mem can accessable to sub classes in other package.
		c=10;
		d=20;
	}

}
