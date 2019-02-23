package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Kiran","Vibha","Akash","Rajeev","Ankita");
		strings.forEach(e->System.out.println(e));
		
		List<String> filtered = new ArrayList<>();
		strings.stream().filter((str)->str.length() > 5 && str.endsWith("v")).forEach(e -> System.err.println(e));;
		strings.parallelStream().filter((str)->str.length() > 5).forEach(e -> System.err.println(e));
		
	}
}
