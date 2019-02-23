package com.java8features;

import java.util.function.Function;

interface Test{
	boolean stringTest(String a);
}
public class FunctionaInterface {

	public static void main(String[] args) {
		
		// functional interfaces with lamda
		Test myTest = (a)-> a.contains("ab");
		System.out.println(myTest.stringTest("testbhs"));
		
		// for custom message 
		Function<String, String> urlDecode = p -> {
			return "Hello:"+p; 
			};
			
		System.out.println(urlDecode.apply("test"));
		
	}
}
