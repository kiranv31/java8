package com.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaComparator {
	
	public static void main(String[] args) {
		Comparator<String> firstCharNumber = (String a, String b)-> a.substring(0, 2).compareTo(b.substring(0, 2)); 
		List<String> strings = Arrays.asList("Kiran","Vibha","Akash","Rajeev","Ankita");
		Collections.sort(strings, firstCharNumber);
		printList(strings);
	}
	
	public static void printList(List<String> args) {
		for (String string : args) {
			System.out.println(string);
		}
	}
	
	
}
