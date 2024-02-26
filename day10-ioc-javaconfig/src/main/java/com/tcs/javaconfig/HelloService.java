package com.tcs.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "helloservice")
public class HelloService {    //stereotype - it has special status in ioc container if it has any dependencies , it will get autowired
	
	@Autowired
	HelloWorldImpl hello; //dependancy
	
	void callHello() {
		hello.message();
		}

}
