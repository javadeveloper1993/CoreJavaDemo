package com.example.constructor;

/**
 * @author Maulik
 * 
 */
public class Constructor_Default {
	public static void main(String[] args) {
		Student student = new Student();
	}
}

class Student {
	public Student() {
		System.out.println("This Is Default Constructor");
	}
}
