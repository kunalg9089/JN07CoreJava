package com.tnsif.Day 9;

public class Point {
	float pointA;
	float pointB;
	
	public Point() {
		
		System.out.println("This is Point Class");
	
	
	public Point(float value) {
		
		this.pointA = value;
		this.pointB = value;
		
	}
	
	public Point(float pointA, float pointB) {
		
		this.pointA = pointA;
		this.pointB = pointB;
	}
	
	@override 
	public String toString() {
		return "Point (" + pointA + ", " + pointB + ")";
	}

	
}
