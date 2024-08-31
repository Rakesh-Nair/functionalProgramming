package com.learn.functionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LearnFP01 {
	public static void main(String args[]) {
		//List<Integer> numbers = List.of(12,5,2,45,3,45,2,1,32,3,454,1,5665,32,1,14);
		List<Integer> numbers = List.of(1, 2, 3, 4);
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		//printAllNumbersFunctionalApproach(numbers);
		//printAllNumbersFunctionalApproachDirect(List.of(12,5,2,45,3,45,2,1,32,3,454,1,5665,32,1,14));
		//printAllNumbersFunctionalApproachEven(List.of(12,5,2,45,3,45,2,1,32,3,454,1,5665,32,1,14));
		//printAllNumbersFunctionalApproachEvenCube(List.of(12,5,2,45,3,45,2,1,32,3,454,1,5665,32,1,14));
		//printNumberofChars(courses);
		//int sum = addNumbers(numbers);
		//int sum = addNumbers2(numbers);
		//int sum = addSquaresOfNumbers(numbers);
		//System.out.println("Sum is "+sum);
		//sort(courses);
		//printNumberSquare(numbers);
		printLengthOfCourses(courses);
	}

	private static void printLengthOfCourses(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream().map(x -> x+" of length "+x.length()).forEach(System.out::println);sax
		System.out.println(courses.stream().map(x -> x.length()).collect(Collectors.toList()));
	}

	private static void printNumberSquare(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().map(x -> x*x).collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void sort(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream().sorted(Comparator.comparing(x -> x.length())).forEach(System.out::println);
	}

	private static int addSquaresOfNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		//return numbers.stream().reduce(0, (x,y) -> x+y*y);
		return numbers.stream().map(x -> x*x).reduce(0, Integer::sum);
	}

	private static int addNumbers2(List<Integer> numbers) {
		// TODO Auto-generated method stub
		//return numbers.stream().reduce(0, (x,y) -> x+y);
		return numbers.stream().reduce(0, Integer::sum);
	}

	private static int sum(int a, int b) {
		return a+b;
	}
	
	private static int addNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().reduce(0, LearnFP01::sum);
	}

	private static void printNumberofChars(List<String> courses2) {
		// TODO Auto-generated method stub
		//courses2.stream().forEach(x -> System.out.println(x.length()));
		courses2.stream().map(x -> x.length()).forEach(System.out::println);
	}

	private static void printAllNumbersFunctionalApproachEven(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().filter(x -> x%2 ==0).forEach(System.out::println);
	}

	private static void printAllNumbersFunctionalApproachDirect(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().forEach(System.out::println);
	}

	private static void printAllNumbersFunctionalApproach(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().forEach(LearnFP01::print);
	}
	
	private static void print(int number) {
		System.out.println(number);
	}
	
	private static void printAllNumbersFunctionalApproachEvenSquare(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().filter(x -> x%2 ==0).map(x -> x*x).forEach(System.out::println);
	}
	
	private static void printAllNumbersFunctionalApproachEvenCube(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().filter(x -> x%2 ==0).map(x -> x*x*x).forEach(System.out::println);
	}
}
