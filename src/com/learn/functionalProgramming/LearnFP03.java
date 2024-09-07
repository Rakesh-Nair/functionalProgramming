package com.learn.functionalProgramming;

import java.util.List;

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
	
	
}
public class LearnFP03 {
	public static void main(String args[]) {
		List <Course> courses = List.of(
				new Course("Spring","Framework",98, 2000),
				new Course("Spring Boot","Framework",99, 2000),
				new Course("API","Microservices",92, 2000),
				new Course("Microservices","Microservices",98, 2001),
				new Course("FullStack","FullStack",98, 5000),
				new Course("AWS","Cloud",91, 2000),
				new Course("Azure","Cloud",90, 21000),
				new Course("Docker","Cloud",84, 200),
				new Course("Kubernetes","Cloud",81, 200));
		
	}
}
