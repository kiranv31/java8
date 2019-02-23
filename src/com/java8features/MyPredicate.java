package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyPredicate {

	public static void main(String[] args) {
		List<Integer> members = Arrays.asList(12,56,23,54,9,19,87);
		Predicate<Integer> adult = (age)->  age > 18;
		printList(members, adult);
		System.out.println(adult.test(12));
	}
	
	public static void printList(List<Integer> args, Predicate<Integer> adult) {
		for (Integer integer : args) {
			if(adult.test(integer)) {
				System.out.println(integer);
			}
		}
	}
}
