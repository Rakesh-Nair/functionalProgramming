package com.learn.functionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
				+ noOfStudents + "]";
	}
	
	
}
public class LearnFP03 {
	public static void main(String args[]) {
		List <Course> courses = List.of(
				new Course("Spring","Framework",98, 2000),
				new Course("Spring Boot","Framework",98, 2002),
				new Course("API","Microservices",92, 2000),
				new Course("Microservices","Microservices",98, 2001),
				new Course("FullStack","FullStack",98, 5000),
				new Course("AWS","Cloud",91, 2000),
				new Course("Azure","Cloud",90, 21000),
				new Course("Docker","Cloud",84, 200),
				new Course("Kubernetes","Cloud",81, 200));
		
		//allMatch, noneMatch, anyMatch
		
		
		Predicate<? super Course> ReviewScoreGreaterThan80 = course -> course.getReviewScore() > 80;
		Predicate<? super Course> ReviewScoreLessThan80 = course -> course.getReviewScore() < 80;
		
		System.out.println(courses.stream().allMatch(ReviewScoreGreaterThan80));
		
		System.out.println(courses.stream().anyMatch(ReviewScoreLessThan80));

		System.out.println(courses.stream().noneMatch(ReviewScoreGreaterThan80));
		
		Comparator<? super Course> comparator = Comparator.comparing(Course::getReviewScore).thenComparing(Course::getNoOfStudents);
		//System.out.println(courses.stream().sorted(comparator).collect(Collectors.toList()));
		
		Comparator<Course> nameComparator = Comparator.comparing(Course::getName).reversed();
		System.out.println(courses.stream().sorted(nameComparator).collect(Collectors.toList()));

	}
}
