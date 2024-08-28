package com.learn.functionalProgramming;

import java.util.List;

public class LearnFP01 {

	public static void main(String args[]) {
		printAllNumbersFunctionalApproach(List.of(12,5,2,45,3,45,2,1,32,3,454,1,5665,32,1,14));
	}

	private static void printAllNumbersFunctionalApproach(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().forEach(LearnFP01::print);
	}
	
	private static void print(int number) {
		System.out.println(number);
	}
}
