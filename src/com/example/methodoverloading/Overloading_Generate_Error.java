package com.example.methodoverloading;

/**
 * @author Maulik
 * 
 */
public class Overloading_Generate_Error {

	public static void main(String[] args) {

	}

}

class OverloadingClass_Generate_Error {

	void display() {
		System.out.println("This is No Argument Method..!!!");
	}

	int display(int no, double No) {
		System.out.println("This is Int Argument Method..!!! Value Is : " + no);
		return no;
	}

	double display(double no, int No) {
		System.out.println("This is Int Argument Method..!!! Value Is : " + no);
		return No;
	}

	double display(double no1, int No1) {
		System.out.println("This is Int Argument Method..!!! Value Is : " + no);
		return No;
	}

	void display(String name) {
		System.out.println("This is String Argument Method..!!! Value Is : "
				+ name);
	}

}
